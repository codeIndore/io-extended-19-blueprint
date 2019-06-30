import java.util.Scanner
abstract class Random
fun main(args: Array<String>) {

// prints new sequence every time
    println("1. The computer will think of 3 digit number.")
    println("2. You will then guess a 3 digit number")
    println("3. The computer will then give back clues, the possible clues are:")
    println("")
    println("Match: You've guessed a correct number in the correct position")
    println("Nope: You haven't guess any of the numbers correctly")
    println("4. Based on these clues you will guess again until you break the code with a\n" +
            "    perfect match, the game will report \"CODE CRACKED\"!")

  println("Lets Start the Game")
  val rnds=(100..999).random()
//  println(rnds)
var l: Int=0
  do {
      var ran:Int =rnds
      val num = Integer.valueOf(readLine())
    var num1: Int = num
    var rem: Int = 0
    var rem1: Int = 0
    var k: Int = 0
    while (num1 > 0) {
      rem = num1 % 10
      num1 /= 10
      rem1 = ran % 10
      ran = ran / 10


      if (rem1 == rem) {
        k = 1
      }
    }

      if (k == 1) {
        println("Match")
      }
      else
        println("Nope")
   l++
  } while (rnds != num)
  println("CODE CRACKED")
    println("No. Of Attempts = $l")

}
