package com.knoldus.assignment

class HeadAndTail {
  def insertionSort(list: List[Int]): List[Int] = {
    if (list.isEmpty) throw new Exception("Nothing in List")
    else nowSort(list)
  }

  def nowSort(list: List[Int]): List[Int] = {
    if (list.isEmpty) Nil
    else insert(list.head, nowSort(list.tail))
  }

  def insert(head: Int, arrangedList: List[Int]): List[Int] = {
    if (arrangedList.isEmpty) List(head)
    else if (head < arrangedList.head) head :: arrangedList
    else arrangedList.head :: insert(head, arrangedList.tail)
  }
}