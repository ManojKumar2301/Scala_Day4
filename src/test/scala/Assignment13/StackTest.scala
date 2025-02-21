package Assignment13

import org.scalatest.funsuite.AnyFunSuite
import scala.collection.mutable.ArrayBuffer

class StackTest extends AnyFunSuite {

  class Stack {
    val elements = ArrayBuffer[Int]()
    def push(item: Int): Unit = elements += item
    def pop(): Option[Int] = {
      if (elements.nonEmpty) Some(elements.remove(elements.length - 1))
      else None
    }
  }

  test("push should add elements to the stack") {
    val stack = new Stack
    stack.push(10)
    stack.push(20)
    assert(stack.elements == ArrayBuffer(10, 20))
  }

  test("pop should remove and return the last element") {
    val stack = new Stack
    stack.push(10)
    stack.push(20)
    assert(stack.pop() == Some(20))
    assert(stack.pop() == Some(10))
  }

  test("pop on an empty stack should return None") {
    val stack = new Stack
    assert(stack.pop().isEmpty)
  }
}
