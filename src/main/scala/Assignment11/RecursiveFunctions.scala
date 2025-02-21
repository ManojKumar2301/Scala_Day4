package Assignment11

object RecursiveFunctions extends App{
  def sumList(lst: List[Int]): Int = lst match {
    case Nil => 0
    case head :: tail => head + sumList(tail)
  }

  val numbers = List(21, 12, 31, 4, 50)
  println(sumList(numbers))
}
