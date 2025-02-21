package Assignment13
import scala.collection.mutable.ArrayBuffer

object Stack extends App {
  class Stack {
   val elements = ArrayBuffer[Int]()
    def push(item: Int): Unit = elements += item
    def pop(): Option[Int] = {
      if (elements.nonEmpty)
      {
        val lastElement = elements.remove(elements.length - 1)
        Some(lastElement)
      }
      else
      {
        None
      }
    }
  }

  val stack = new Stack
  stack.push(10)
  stack.push(20)
  println(stack.pop())
  println(stack.pop())
  println(stack.pop())
}

