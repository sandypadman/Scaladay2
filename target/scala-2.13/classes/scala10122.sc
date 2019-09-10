val item:Map[Int,String]= Map( 1->"red",2->"yellow")
item(2)

val seqList:Seq[Int]=Seq(1,2,3,4)

def addOne(seq:Seq[Int])= {
  seq.map(x => (x+1).map(y => y*2))
}

def addOneAndMultTwo(seq:Seq[Int])= {
 // seq.map(x => x.map(y =>y+1))
}

addOne(seqList)



