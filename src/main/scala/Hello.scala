//import scala.annotation.tailrec




object Hello extends App {
  def MySort[T](arr: List[T], order: (T, T) => Boolean): List[T] = {
    
  }
  println(MySort(List(10, 20), (a: Int, b: Int) => a < b))
}
