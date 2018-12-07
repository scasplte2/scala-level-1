package lectures.part1Basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE

  //Compiler can infer types

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val sShort: Short = 4613
  val aLong: Long = 4251356284215623695L
  val aFloat: Float = 2.0f
  val aDouble: Double = 6.845

  // varaibles, the worst
  var aVariable: Int = 4
  aVariable = 5 // produce side effects


}
