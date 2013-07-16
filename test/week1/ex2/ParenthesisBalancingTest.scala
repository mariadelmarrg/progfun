package week1.ex2

import org.junit.runner.RunWith
import org.scalatest.BeforeAndAfter
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ParenthesisBalancingTest extends FunSuite with BeforeAndAfter {

  var parenthesisBalancing: ParenthesisBalancing = _

  before {
    parenthesisBalancing = new ParenthesisBalancing
  }

  test("value: () is balanced") {
	  var result = parenthesisBalancing.balance("()".toList)
	  expect(true)(result)
  }
  
  test("value: ( is not balanced"){
    var result = parenthesisBalancing.balance("(".toList)
    expect(false)(result)
  }

  test("value: (if (zero? x) max (/ 1 x)) is balanced"){
    var result = parenthesisBalancing.balance("(if (zero? x) max (/ 1 x))".toList)
    expect(true)(result)
  }
  
  test("value: I told him (that it’s not (yet) done). (But he wasn’t listening) is balanced"){
    var result = parenthesisBalancing.balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList)
    expect(true)(result)
  }
  
  test("value: :-) is not balanced"){
    var result = parenthesisBalancing.balance(":-)".toList);
    expect(false)(result)
  }
  
  test("value: ())( is not balanced"){
    var result = parenthesisBalancing.balance("())(".toList);
    expect(false)(result)
  }
    
}