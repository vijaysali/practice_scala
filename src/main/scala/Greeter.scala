class Greeter(var firstName: String) {
  def greet(lastName: String): Unit = {
    println( "Greetings..." )
    println( "Hello " + firstName + lastName )
  }
}

object Greeter extends App {
  println( "Hello, You are seeing scala print message." )
  val g = new Greeter( "Vijay" )
  println( g.firstName )
  g.greet( "sali" )
}
