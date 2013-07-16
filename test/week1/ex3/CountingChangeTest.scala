package week1.ex3

import org.junit.runner.RunWith
import org.scalatest.BeforeAndAfter
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CountingChangeTest extends FunSuite with BeforeAndAfter {
	
  var countingChange: CountingChange = _
  
  before {
    countingChange = new CountingChange
  }
  
  test("can only return the change in 1 way when money is 0"){
    var result = countingChange.countChange(0, List(1,2,3))
    expect(1)(result)
  }
  
  test("cannot return any change when money is a negative number"){
    var result = countingChange.countChange(-1, List(1,2,3));
    expect(0)(result);
  }
  
  test("cannot make any way to return some change when no coins are available"){
    var result = countingChange.countChange(1, List())
    expect(0)(result)
  }
  
  test("can only return the change in 1 way when money is 1 and coins are [1]"){
    var result = countingChange.countChange(1, List(1))
    expect(1)(result)
  }
  
  test("can return the change in 2 ways when money is 2 and coins are [1, 2]"){
    var result = countingChange.countChange(2, List(1,2));
    expect(2)(result)
  }
  
  test("can return the change in 3 ways when money is 4 and coins are [1, 2]"){
    var result = countingChange.countChange(4, List(1, 2));
    expect(3)(result)
  }
  
  
}