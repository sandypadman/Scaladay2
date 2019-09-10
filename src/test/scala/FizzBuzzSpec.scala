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
import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {
  val fb= new FizzBuzz
  "fizzBuzz when pass a multiple of 3" should "return Fizz" in{
    assert(fb.fizzBuzz(3)=== "Fizz")
    assert(fb.fizzBuzz(6)=== "Fizz")

  }
  "fizzBuzz when pass a multiple of 5" should "return Buzz" in{
    assert(fb.fizzBuzz(5)=== "Buzz")
    assert(fb.fizzBuzz(10)=== "Buzz")
    fb.fizzBuzz(5) shouldBe "Buzz"
  }
  "fizzBuzz when pass a multiple of 3 and 5" should "return Buzz" in{
    assert(fb.fizzBuzz(30)=== "FizzBuzz")
    assert(fb.fizzBuzz(15)=== "FizzBuzz")
  }
  "fizzBuzz when pass anything else" should "return number" in{
    assert(fb.fizzBuzz(31)=== "31")
    assert(fb.fizzBuzz(16)=== "16")
  }
}
