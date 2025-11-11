// #Sireum #Logika
//@Logika: --manual

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

//adult tickets: $50
//kid tickets: $30
def getTicketCosts(adult: Z, kid: Z): Z = {
  //what do we want for our function contract?
  Contract(
    Requires(adult >= 0, kid >= 0),
    Ensures(Res[Z] == adult*50 + kid*30, Res[Z] >= 0)
  )


  //what to do here?
  Deduce(
    1 (adult >= 0) by Premise,
    2 (kid >= 0) by Premise,
  )

  //get the total ticket cost
  val overall: Z = adult*50 + kid*30

  //what to do here?
  Deduce(
    
  )

  return overall
}

////////////// Test code /////////////////

val k: Z = 3 //$30 each
val a: Z = 2 //$50 each

//what to do here?

val cost: Z = getTicketCosts(a, k)

//what to do here?

//what *should* cost be?