package lectures.part1Basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extensions)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=, all side effects
  println(aVariable)

  // Instructions (DO) vs. Expressions (VALUE and/or TYPE)

  //IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  var i = 0
  while(i < 10) {
    println(i)
    i += 1
  }
  // NEVER EVER DO THIS ^^
  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit == void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning -> expressions returning Unit
  // Scala wants expressions not instructions

  //Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

}
