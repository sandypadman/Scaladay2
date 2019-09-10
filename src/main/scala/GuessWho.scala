case class PersonOne(name: String, hairColour: String, eyeColour: String)

class GuessWho {


  val listOfPeople: List[PersonOne] = List(
    PersonOne("ben", "Brown","Green"),
    PersonOne("jeff", "ginger","Blue"),
    PersonOne("Craig","Blond","Black"),
    PersonOne("Tosh","Black","Brown"),
    PersonOne("ben","ginger","Black")
  )

  def guess(hairColour: String):List[PersonOne]= {
    listOfPeople.filter(person => person.hairColour == hairColour)
  }

  def guess1(name:String): List[PersonOne] = {
   listOfPeople.filter((person =>person.name == name ))
  }
}

object GuessWho extends App{
  println("Let's Play Guess Who")
  println("Please Enter your name: ")
  def takeNameInput: String = io.StdIn.readLine().trim
  val name= takeNameInput.toLowerCase
   println(s"\n WELCOME $name ")
var length=0
  val gw = new GuessWho
  playSelection

  def playSelection:List[PersonOne]= {1
    println("What would you like to guess?"+"\n"+"Enter 1: for name,"+"\n"+"Enter 2: for hairColour")
    val selection= takeNameInput.toLowerCase
    if (length==1){
    List.empty
    } else
    selection match {
      case "1" => {
        println("Guess the name of the person" + "\n")
        val guessName = takeNameInput.toLowerCase
        val x=gw.guess1(guessName.trim)
        x.map(name1 => println(name1.eyeColour))
        if(x.length==1) length=1
        gw.guess1(guessName.trim)
      }
      case "2" => {
        println("Guess the hairColour of the person" + "\n")
        val guessHairColour = takeNameInput.toLowerCase
        val y=gw.guess(guessHairColour.trim)
        y.map(name1 => println(name1.eyeColour))
        if(y.length==1) length=1
        gw.guess(guessHairColour.trim)
      }
     case _ => playSelection
    }
  }
}
