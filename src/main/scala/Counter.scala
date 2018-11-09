class Counter {
  private var value =0
  def increment() { value+=1}
  def current(): Int = value
}

object Counter extends App{
  val counterObject: Counter = new Counter()
  println(counterObject.current())
  counterObject.increment()
  counterObject.increment()
  counterObject.increment()
  println(counterObject.current())

}