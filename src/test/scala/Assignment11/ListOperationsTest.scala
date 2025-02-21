package Assignment11

import org.scalatest.funsuite.AnyFunSuite

class ListOperationsTest extends AnyFunSuite {
  test("List operations ") {
    val numbers = List(12, 20, 33, 42, 5)

    val doubleNumbers = numbers.map(_ * 2)
    val filterNumbers = numbers.filter(_ % 2 == 0)
    val sumNumbers = numbers.sum

    assert(doubleNumbers == List(24, 40, 66, 84, 10))
    assert(filterNumbers == List(12, 20, 42))
    assert(sumNumbers == 112)
  }
}

