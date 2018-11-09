class Point {
  private var _x = 0
  private var _y = 0

  def x = _x
  def x_= (newValue: Int): Unit = {
    _x = newValue
  }

  def y = _y
  def y_= (newValue: Int): Unit = {
    _y = newValue
  }
}

object Point extends App {
   val p = new Point
  p.x = 100
  p.y = 200
  println(p.x)
  println(p.y)
}
