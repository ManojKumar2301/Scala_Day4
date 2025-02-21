package Assignment11

object ListImmutability extends App{
  val listA=List(2, 4, 5)

  // if we uncomment the below line then we get an error because of modifying the list directly
  //listA(0)=0

  val listB=listA.updated(1,10)

  println(s"ListA: $listA")
  println(s"listB: $listB")

}
