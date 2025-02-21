package Assignment12

import org.scalatest.funsuite.AnyFunSuite

class WordCountTest extends AnyFunSuite {

  test("countWords should correctly count occurrences of words") {
    val text = "Manoj Kumar is learning Scala and Manoj loves Scala"
    val expected = Map("Manoj" -> 2, "Kumar" -> 1, "is" -> 1, "learning" -> 1, "Scala" -> 2, "and" -> 1, "loves" -> 1)
    val result = Assignment12.WordCount.countWords(text)

    assert(result == expected)
  }

  test("countWords should return an empty map for an empty string") {
    val result = Assignment12.WordCount.countWords("")
    assert(result.isEmpty)
  }

  test("countWords should handle repeated words") {
    val text = "Scala Scala Scala"
    val expected = Map("Scala" -> 3)
    val result = Assignment12.WordCount.countWords(text)

    assert(result == expected)
  }

  test("countWords should handle case sensitivity") {
    val text = "Scala scala SCALA"
    val expected = Map("Scala" -> 1, "scala" -> 1, "SCALA" -> 1) // Case-sensitive comparison
    val result = Assignment12.WordCount.countWords(text)

    assert(result == expected)
  }
}

