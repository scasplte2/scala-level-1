package exercises

object FunctionsExercises extends App {

  // Exercise 1
  def greeterFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old!"
  }

  println(greeterFunction("Jim", 29))


  // Exercise 2
  def factorialFunction(n: Int): Int = {
    if (n == 1) 1 else n * factorialFunction(n - 1)
  }

  println(factorialFunction(5))


  // Exercise 3
  def fibonacciFunction(n: Int): Int = {
    if (n <= 1) 1 else fibonacciFunction(n - 1) + fibonacciFunction(n - 2)
  }

  println(fibonacciFunction(4))


  // Exercise 4
  def checkPrime(n: Int): Boolean = {
    def getRemainder(numerator: Int, denominator: Int): Int = {
      if (denominator < numerator / 2) {
        if (numerator % denominator == 0) {
          denominator
        } else {
          getRemainder(n, denominator + 1)
        }
      } else {
        1
      }
    }

    if (getRemainder(n, 2) == 1) {
      true
    } else {
      false
    }
  }

  println(checkPrime(15486967))
}
