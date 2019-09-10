val newSeq:Seq[Int]= Seq(23,45,56,67,78,89)
val newMap:Map[String,String] = Map("rose"->"red",
                                   "sunflowery"-> "yellow", "violet"->"blue")
newMap.head
newMap.tail
newMap.head._2 //value of the head

val x = newMap("rose").contains("red")

def doubleValue(i:Seq[Int])= {
  i.map(x=>x*x)
}
doubleValue(newSeq)