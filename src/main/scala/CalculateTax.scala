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

class CalculateTax {

  def calculateTax (i:BigDecimal) = {
    //    println(i)
    //    i match
    //      {
    //      case i if (i > 100000) => {
    //        val result = i * (40d / 100d)
    //        println(result)
    //        result
    //      }
    //      case i if (i > 50000) => (i * 20)/100
    //      case i if (i > 10000) =>
    //        {
    //          val result = ((i *15)/100)
    //          println(result)
    //          result
    //        }
    //      case _ => i
    //    }
    //
    //val result: BigDecimal=  if(moreThan100000(i) || moreThan50000(i) || moreThan10000(i)


    def moreThan100000(i: BigDecimal) = {
      if (i > 100000)
        i * (40d / 100)
    }

    def moreThan50000(i: BigDecimal) = {
      if (i > 50000)
        i * (20d / 100)
    }

    def moreThan10000(i: BigDecimal) = {
      if (i > 10000)
        i * (15d / 100)
    }
  }

}
