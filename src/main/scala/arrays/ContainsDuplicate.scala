package info.sandroalmeida
package arrays

import scala.annotation.tailrec

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

@tailrec
def containsDuplicate(list: List[Int], set: Set[Int]): Boolean =
  if list.isEmpty then false
  else if set.contains(list.head) then true
  else containsDuplicate(list.tail, set + list.head)
