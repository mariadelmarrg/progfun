package week1.ex1

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

@RunWith(classOf[JUnitRunner])
class PascalTriangleTest extends FunSuite with BeforeAndAfter {

  var pascalTriangle: PascalTriangle = _
  
  before {
    pascalTriangle = new PascalTriangle
  }
  
  test("value for column 0 and row 2 is 1") {
    var result = pascalTriangle.pascal(0,2)
    expect(1)(result)
  }
  
  test("value for column 1 and row 2 is 2"){
    var result = pascalTriangle.pascal(1,2)
    expect(2)(result)
  }
  
  test("value for column 1 and row 3 is 3"){
    var result = pascalTriangle.pascal(1,3)
    expect(3)(result)
  }
  
  test("value for column 2 and row 4 is 6"){
    var result = pascalTriangle.pascal(2, 4)
    expect(6)(result)
  }
  
}