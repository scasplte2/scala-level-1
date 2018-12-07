package lectures.part1Basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParamLessFucntion(): Int = 42
  println(aParamLessFucntion())
  println(aParamLessFucntion)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello ", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  /*
  1. A greet func (name, age) "Hi, my name is $name and I am $age years old
  2. Factorial function 1 * 2 * ... * n
  3. A fibonacci function
    f(1) = 1
    f(2) = 1
      ...
    f(n) = f(n - 1) + f(n - 2)
  4. Test if a number is prime
   */
}
