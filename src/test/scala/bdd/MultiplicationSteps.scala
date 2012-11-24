package bdd

import cucumber.api.scala.{ScalaDsl, EN}
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.{Map => MutableMap}

class MultiplicationSteps extends ScalaDsl with EN with ShouldMatchers {

  val vars = MutableMap[String,Int]()
  var result = 0

  Given("""^a variable ([a-z]+) with value (\d+)$"""){ (varName:String, value:Int) =>
    vars += varName -> value
  }
  When("""^I multiply ([a-z]+) \* ([a-z]+)$"""){ (var1:String, var2:String) =>
    result = vars(var1) * vars(var2)
  }
  Then("""^I get (\d+)$"""){ (expectedResult:Int) =>
    assert(result === expectedResult)
  }
}
