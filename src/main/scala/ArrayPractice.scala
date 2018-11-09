import scala.collection.mutable.ArrayBuffer

object ArrayPractice extends App {
  val x = new Array[Int](5)
  print("Array size:" + x.length)
  x.foreach(println(_))
  println("--")
  val numsBuffer = new ArrayBuffer[Int]()
  numsBuffer += (1, 2, 4)
  numsBuffer += (3, 5)
  numsBuffer.insert(0, 2)
  numsBuffer.foreach(println(_))

  val maxValue = Array(10, 30, 40).max
  val minValue = Array(20, 5, 10).min
  val sumValue = Array(10, 20, 30).sum
  println(maxValue,minValue,sumValue )

  val b        = Array(3, 5, 1, 99, 10)
  scala.util.Sorting.quickSort(b)
  val a        = ArrayBuffer("Max", "Albie", "Zeda", "Sparrow")
  println("Max:", a.max)
  println("Min:",a.min) //Albie
  println(a.sorted)

}
