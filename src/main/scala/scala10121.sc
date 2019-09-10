val week = List("Monday","Tuesday","Wednesday","Thursday","Friday")
val examplemap:Map[String,Int] = Map("Monday" -> 1,"Tuesday" ->2," Wednesday "->3)

week(0)
week.head
week.tail
week.last
week.length
week(week.length - 2)

examplemap("Monday")
examplemap.apply("Monday")
val weekday = examplemap.head
//val x = examplemap.values.map(println(x))


val tuplepairs = List(("mon",1),("tue",2))

val listofnumbers = List(12,23,43,454,454,454,44,67).toSet
listofnumbers.map(number => println(number))

val listEvens = listofnumbers.map(number => (number%2==0))
val listEvens2 = listofnumbers.filter (number => (number%2==0))


//val listMap = examplemap.map(case (x,y) => println(x))
listofnumbers.contains(44)

!listofnumbers.exists(i=>(i==44))


