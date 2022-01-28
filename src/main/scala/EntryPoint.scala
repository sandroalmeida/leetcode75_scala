package info.sandroalmeida

import arrays.ContainsDuplicate

object EntryPoint {

  def main(args: Array[String]): Unit = {
    println("Main class entry point")

    val nums = Array(1,2,3)
    val c = ContainsDuplicate()
    println(c.containsDuplicate(nums))
  }

}
