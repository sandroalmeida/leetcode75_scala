package info.sandroalmeida
package arrays

class ContainsDuplicate {
  def containsDuplicate(nums: Array[Int]): Boolean =
    val set = collection.mutable.Set[Int]()
    var result = false
    nums.foreach(e => {
      if (set.contains(e))
        result = true
      else
        set += e
    })
    result
}

