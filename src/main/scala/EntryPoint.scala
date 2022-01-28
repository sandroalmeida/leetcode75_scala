package info.sandroalmeida

import arrays._

object EntryPoint {

  def main(args: Array[String]): Unit = {
    println("Main class entry point")

    val array = Array(1,1,2,3)
    val list = List(1,1,2,3)
    val v1 = ContainsDuplicate_V1()
    val v2 = ContainsDuplicate_V2()
    println(v1.containsDuplicate(array))
    println(v2.containsDuplicate(list, Set()))
  }

}
