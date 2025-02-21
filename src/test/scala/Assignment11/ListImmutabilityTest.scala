package Assignment11

import org.scalatest.funsuite.AnyFunSuite

class ListImmutabilityTest extends AnyFunSuite {
  test("Lists should be immutable") {
    val listA = List(2, 4, 5)
    val listB = listA.updated(1, 10)

    assert(listA == List(2, 4, 5))
    assert(listB == List(2, 10, 5))
  }
}