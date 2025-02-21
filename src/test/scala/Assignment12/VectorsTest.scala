package Assignment12

import org.scalatest.funsuite.AnyFunSuite

class VectorsTest extends AnyFunSuite {

  val numbers: Vector[Int] = Vector(20, 25, 35, 12, 5)

  test("numbers should have correct elements") {
    val expected = Vector(20, 25, 35, 12, 5)
    assert(numbers == expected)
  }

  test("accessing elements by index should return correct values") {
    assert(numbers(4) == 5)
    assert(numbers(2) == 35)
  }

  test("index out of bounds should throw an exception") {
    assertThrows[IndexOutOfBoundsException] {
      numbers(10)
    }
  }
}

