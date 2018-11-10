import scala.io.{BufferedSource, Source}
import scala.reflect.io.File

object FileDemo extends App {

  def processFiles(filename: String, width: Int): Unit = {
    def processLine(line: String): Unit = {
      if (line.length > width)
        println(line.trim, "is trimmed from ", filename)
    }
    val contents: BufferedSource = Source.fromFile(filename)
    for (line <- contents.getLines())
      processLine(line)
  }
  val filename  = File("src/main/scala/FileDemo.scala").toAbsolute.toString()
  processFiles(filename, 10)

}

