package Assignment12

object WordCount extends App {
  def countWords(text: String): Map[String, Int] = {
    val words = text.split(" ")
    var wordCount = Map[String, Int]()

    for (word <- words) {
      wordCount = wordCount.updatedWith(word) {
        case Some(count) => Some(count + 1)
        case None => Some(1)
      }
    }
    wordCount
  }

  val text = "Manoj Kumar is learning Scala and Manoj loves Scala"
  println(countWords(text))
}


