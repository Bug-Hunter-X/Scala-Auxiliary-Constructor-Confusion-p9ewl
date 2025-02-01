```scala
class MyClass(val x: Int) {
  def this() = this(0) 
}

val myInstance = new MyClass()
println(myInstance.x) // prints 0

val anotherInstance = new MyClass(5)
println(anotherInstance.x) // prints 5

// Problem:  The auxiliary constructor is called correctly and prints 0, then the primary constructor works correctly as well. 
// This example does not showcase a bug directly.
```