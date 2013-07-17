package week2

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

@RunWith(classOf[JUnitRunner])
class FunSetsTest  extends FunSuite with BeforeAndAfter {

  import FunSets._
  var negativeNumbersSet: Set = singletonSet(-1)
  var positiveNumbersSet: Set = singletonSet(1)
  var unionSet = union(positiveNumbersSet, negativeNumbersSet);
  var intersectionSet = intersect(positiveNumbersSet, negativeNumbersSet);
  
  test("integer -1 is contained in the negative numbers set"){
    var result = contains(negativeNumbersSet, -1)
    expect(true)(result)
  }
  
  test("integer 1 is not contained in the negative numbers set"){
    var result = contains(negativeNumbersSet, 1)
    expect(false)(result)
  }
  
  test("1 and -1 are un the union of the positive and negative sets"){
    var result1 = contains(unionSet, 1)
    var result2 = contains(unionSet, -1)
    expect(true)(result1)
    expect(true)(result2)
  }
  
  test("1 and -1 are not in the intersection of a positive and a negative set"){
    var result1 = contains(intersectionSet, 1)
    var result2 = contains(intersectionSet, -1)
    expect(false)(result1)
    expect(false)(result2)
  }
  
  test("negative numbers set only contains negative numbers"){
    var result = forall(negativeNumbersSet, (p:Int) => p < 0)
    expect(true)(result)
  }
  
  test("negative numbers set doesn't contain positive numbers"){
	  var result = forall(negativeNumbersSet, (p:Int) => p >= 0)
	  expect(false)(result)
  }
  
  test("positive numbers set only contains positive numbers"){
    var result = forall(positiveNumbersSet, (p:Int) => p >= 0)
    expect(true)(result)
  }
  
  test("positive numbers set doesn't contain negative numbers"){
	  var result = forall(positiveNumbersSet, (p:Int) => p < 0)
	  expect(false)(result)
  }
  
  test("negative numbers set does not contain the 0"){
    var result = exists(negativeNumbersSet, (p:Int) => p == 0);
    expect(false)(result)
  }
  
  test("-1 exists in the negative numbers set"){
    var result = exists(negativeNumbersSet, (p:Int) => p == -1)
    expect(true)(result)
  }

}