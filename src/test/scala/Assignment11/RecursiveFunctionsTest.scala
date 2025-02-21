package Assignment11

import org.scalatest.funsuite.AnyFunSuite


class RecursiveFunctionsTest extends AnyFunSuite {
  test("sumList should return the correct sum of a list") {
    assert(RecursiveFunctions.sumList(List(21, 12, 31, 4, 50)) == 118)
    assert(RecursiveFunctions.sumList(List(1, 2, 3, 4, 5)) == 15)
    assert(RecursiveFunctions.sumList(List(10, -5, 3)) == 8)
    assert(RecursiveFunctions.sumList(List()) == 0)
  }
}

