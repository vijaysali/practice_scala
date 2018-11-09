object Practice extends App {
  val x = 1 + 1
  println( x )


  val y: Int = 4 + 1
  println( y )

  var z = 3 + 1
  println( z * 3 )
  // Blocks

  var a = {
    val x = 1 + 1
    x
  }

  println( "Value of block:" + a )

  // Anonymous functions (WIP)
  //(x: Int) => x * x


  val add = (x: Int, y: Int) => x + y
  println( add( 2, 3 ) )


  val ping = () => "All Ok"
  println( ping() )
  println( add( 2, 4 ) )
  println( addAndMultiply( 10, 4 )( 2 ) )
  println( systemInfo )

  // Multiple arguments with list
  def addAndMultiply(x: Int, y: Int)(z: Int): Int = (x + y) * z

  //System info
  def systemInfo: String = System.getProperty( "user.name" )
}
