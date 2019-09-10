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
import org.scalatest.FlatSpec
class CalculateTaxSpec extends FlatSpec {
  val calResult= new CalculateTax

  "calculateTax should return 15% of 20000" should "return 3000" in{
    assert((calResult.calculateTax(20000)) === 3000)
  }
  "calculateTax should return 20% of 60000" should "return 12000" in{
    assert((calResult.calculateTax(60000)) === 12000)
  }
  "calculateTax should return 40% of 110000" should "return 44000" in{
    assert((calResult.calculateTax(110000)) === 44000)
  }

}
