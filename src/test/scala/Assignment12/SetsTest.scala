package Assignment12
import org.scalatest.funsuite.AnyFunSuite

class SetsTest extends AnyFunSuite {

  val setA = "I am Manoj Kumar".toLowerCase().split(" ").toSet
  val setB = Set("i", "am", "anand", "kumar")

  test("setA should contain words from the given string") {
    val expected = Set("i", "am", "manoj", "kumar")
    assert(setA == expected)
  }

  test("setB should be initialized correctly") {
    val expected = Set("i", "am", "anand", "kumar")
    assert(setB == expected)
  }

  test("union of setA and setB should contain all unique elements") {
    val unionSet = setA.union(setB)
    val expected = Set("i", "am", "manoj", "kumar", "anand")
    assert(unionSet == expected)
  }

  test("intersection of setA and setB should contain common elements") {
    val intersectionSet = setA.intersect(setB)
    val expected = Set("i", "am", "kumar")
    assert(intersectionSet == expected)
  }
}

