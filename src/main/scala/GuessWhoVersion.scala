/*
 * Copyright 2019 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
case class Person (name: String, hairColour: String, eyeColour: String)

class GuessWhoVersion {

  val ListOfPeople: Seq[Person] = Seq(Person("Barry", "Brown", "Blue"), Person("Becky", "Blonde", "Green"), Person("Bill", "Black", "Black"), Person("Bob", "Ginger", "Brown"), Person("Ben", "White", "Hazel"))
  val winningPerson: Person = Person("Barry", "Blonde", "Green")


  def filterFullName(name1: String, listOfPeople: Seq[Person]): Seq[Person] = {
    if (winningPerson.name.toLowerCase.trim == name1.toLowerCase.trim) {
      listOfPeople.filter(_.name.toLowerCase == name1.toLowerCase)
    } else {
      listOfPeople.filterNot(_.name.toLowerCase == name1.toLowerCase)
    }
  }

  def filterEyeColour(eyeColour: String, listOfPeople: Seq[Person]): Seq[Person] = {
    if (winningPerson.eyeColour.toLowerCase == eyeColour.toLowerCase) {
      listOfPeople.filter(_.eyeColour.toLowerCase == eyeColour.toLowerCase)
    } else {
      listOfPeople.filterNot(_.eyeColour.toLowerCase == eyeColour.toLowerCase)
    }
  }

  def filterHairColour(colour: String, listOfPeople: Seq[Person]): Seq[Person] = {
    if (winningPerson.hairColour.toLowerCase == colour.toLowerCase) {
      listOfPeople.filter(_.hairColour.toLowerCase == colour.toLowerCase)
    } else {
      listOfPeople.filterNot(_.hairColour.toLowerCase == colour.toLowerCase)
    }
  }
}

object GuessWhoVersion extends App {
  def checkGameEnd(s: Seq[Person]): Boolean = s.length == 1
  def takePlayerInput: String = io.StdIn.readLine().trim
  val guessWho = new GuessWhoVersion

  println("Welcome to Guess Who!")
  def playGame(s: Seq[Person]):Seq[Person] = {
    println(s"Remaining people: ${s.map(_.name).mkString("[", ", ", "]")}\n")
    println("What would you like to guess?")
    println("[a] Full name")
    println("[b] Eye colour")
    println("[c] Hair colour")
    val selection = takePlayerInput.toLowerCase

    def filteredS: Seq[Person] = selection match {
      case "a" =>
        println("What name would you like to guess? -> ")
        val guess = takePlayerInput.toLowerCase
        guessWho.filterFullName(guess, s)
      case "b" =>
        println("What eye colour would you like to guess? -> ")
        val guess = takePlayerInput.toLowerCase
        guessWho.filterEyeColour(guess, s)
      case "c" =>
        println("What hair colour would you like to guess? -> ")
        val guess = takePlayerInput.toLowerCase
        guessWho.filterHairColour(guess, s)
      case _ =>
        playGame(s)
    }
 val endSeq = filteredS

    def callEndGameCheck(endSeq: Seq[Person]): Seq[Person] = {
      filteredS
      if (endSeq.length == 1) {
        println("dfdf")
        endSeq

      }
      else {
        println("Keep playing! Almost there Try again!\n")
        playGame(endSeq)
      }
    }
    callEndGameCheck(endSeq)
  }
  val winner: Seq[Person] = playGame(guessWho.ListOfPeople)
  println(s"There is only one person left: ${winner.head.name}!")
 // println(s"Well done for guessing ${winner.head.name} correctly!")
  println("GAME OVER")
}
