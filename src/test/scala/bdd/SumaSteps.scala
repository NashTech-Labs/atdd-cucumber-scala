package bdd

import cucumber.api.scala.{CA, ScalaDsl}
import org.scalatest.matchers.ShouldMatchers
import cucumber.runtime.PendingException
import collection.mutable

class SumaSteps extends ScalaDsl with CA with ShouldMatchers {

  var valors = mutable.MutableList[Int]()
  var resultat = 0

  Before{
    resultat = 0
    valors = mutable.MutableList[Int]()
  }

  Donat( """^que he introduït (\d+) a la calculadora$""") {
    (num: Int) => valors += num
  }
  Quan( """^premo el botó (.+)$""") {
    (op: Char) => op match {
      case '+' =>  resultat = valors.foldLeft(0)( _ + _ )
      case _ => throw new IllegalArgumentException("No conec el botó " + op)
    }
  }

  Aleshores( """^el resultat ha de ser (\d+) a la pantalla$""") {
    (expectedRes: Int) =>
    assert(resultat === expectedRes)
  }

}