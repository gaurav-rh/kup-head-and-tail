package com.knoldus.assignment

import org.scalatest.flatspec.AnyFlatSpec

class HeadAndTailTest extends AnyFlatSpec {
  val list = List(5, 3, 6, 7, 8, 9, 1)
  val listToSort = new HeadAndTail()
  val emptyList = List()

  "a list " should "be valid sorted" in {
    val result = list.sorted
    assert(listToSort.insertionSort(list) == result)
  }

  "a empty list" should "be valid sorted" in {
    val exceptionMessage = "Nothing in List"
    assert(intercept[Exception] {
      listToSort.insertionSort(emptyList)
    }.getMessage == exceptionMessage)
  }
}
