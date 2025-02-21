package Assignment12

object WordCount extends App {
  def countWords(text: String): Map[String, Int] = {
    val words = text.trim.split("\\s+").filter(_.nonEmpty)
    words.groupBy(identity).view.mapValues(_.length).toMap
  }

  val text = "Manoj Kumar is learning Scala and Manoj loves Scala"
  println(countWords(text))
}
