package Assignment12

object Sets extends App{
  val A="I am Manoj Kumar".toLowerCase()
  val setA=A.split(" ").toSet
  println(setA)

  val setB=Set("i", "am", "anand", "kumar")
  println(setB)

  val unionSet=setA.union(setB)
  println(s"Union of sets: $unionSet")

  val intersectionSet=setA.intersect(setB)
  println(s"Intersection of sets: $intersectionSet")

}
