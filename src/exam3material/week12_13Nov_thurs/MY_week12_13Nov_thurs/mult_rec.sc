// #Sireum #Logika
//@Logika: --manual

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

//want to return x * y, through repeated addition
//recursively compute x + x + ... + x (y times)
def mult(x: Z, y: Z): Z = {
  //what goes here?
  //what should we require?
  //what should we ensure?

  Contract(
    Requires(y >= 0),
    Ensures(Res[Z] x * y)
  )

  var answer: Z = 0

  if (y == 0) {
    answer = 0

    Deduce(
      1 (answer == 0) by Premise,
      2 (y == 0) by Premise,
      3 (answer == x * y) by Algebra*(1, 2)
    )
    //what do we need to do here?
  } else {

    Deduce(
      1 (!(y == 0)) by Premise,
      2 (answer == 0) by Premise,
      3 (y >= 0) by Premise,
      4 (y - 1 >= 0) by Algebra*(1, 4)
    )

    var temp: Z = mult(x, y-1)

    

    answer = x + temp

    Deduce(
      1 (answer == x + temp) by Premise,
      2 (temp == x * (y - 1)) by Premise,
      3 
    )

    //what do we need to show here?
  }

  //what do we need to do here?

  return answer
}

////////////// Test code //////////////

val a: Z = 5
val b: Z = 4

var ans: Z = mult(a, b)

//what do we want to assert that ans is?