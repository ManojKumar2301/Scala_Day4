package Assignment11

object ListOperations extends App{
    val numbers=List(12, 20, 33, 42, 5)

    var doubleNumbers=List[Int]()
    for(i <- numbers){
      doubleNumbers=doubleNumbers :+ (i *2)
    }

    var filterNumbers=List[Int]()
    for(i <- numbers){
      if(i%2==0){
        filterNumbers=filterNumbers :+ i
      }
    }

    var sumNumbers=0
    for(i <- numbers){
      sumNumbers=sumNumbers+i
    }

    println(s"numbers: $numbers")
    println(s"doubleNumbers: $doubleNumbers")
    println(s"filterNumbers(even): $filterNumbers")
    println(s"sumNumbers: $sumNumbers")
}
