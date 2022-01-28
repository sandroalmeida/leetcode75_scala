package info.sandroalmeida

import arrays._

object EntryPoint {

  def main(args: Array[String]): Unit = {
    println("Main class entry point")

    val array = Array(1,1,2,3)
    val list = List(1,1,2,3)
    println(containsDuplicate(array))
    println(containsDuplicate(list, Set()))
  }

}
