package Assignment11

object ListOperations extends App {
    val numbers = List(12, 20, 33, 42, 5)

    val doubleNumbers = numbers.map(_ * 2)
    val filterNumbers = numbers.filter(_ % 2 == 0)
    val sumNumbers = numbers.sum

    println(s"numbers: $numbers")
    println(s"doubleNumbers: $doubleNumbers")
    println(s"filterNumbers(even): $filterNumbers")
    println(s"sumNumbers: $sumNumbers")
}
