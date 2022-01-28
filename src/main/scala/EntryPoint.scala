package info.sandroalmeida

import arrays.ContainsDuplicate_V1

object EntryPoint {

  def main(args: Array[String]): Unit = {
    println("Main class entry point")

    val nums = Array(1,2,3)
    val c = ContainsDuplicate_V1()
    println(c.containsDuplicate(nums))
  }

}
