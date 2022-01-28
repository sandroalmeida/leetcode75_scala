package info.sandroalmeida
package arrays

class ContainsDuplicate_V2 {
  def containsDuplicate(list: List[Int], set: Set[Int]): Boolean =
    if list.isEmpty then false
    else if set.contains(list.head) then true 
    else containsDuplicate(list.tail, set + list.head)
}

