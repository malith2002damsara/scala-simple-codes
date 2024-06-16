
/*Q1.Area of a disk with radius r is Pi r*r. What is the area of a disk with
radius 5? */

object DiskAreaCalculator {
  // Function to calculate the area of a disk given its radius
  def areaOfDisk(radius: Double): Double = {
    math.Pi * radius * radius
  }

  def main(args: Array[String]): Unit = {
    // Calculate the area of a disk with radius 5
    val radius = 5.0
    val area = areaOfDisk(radius)
    println(s"The area of a disk with radius $radius is $area")
  }
}
