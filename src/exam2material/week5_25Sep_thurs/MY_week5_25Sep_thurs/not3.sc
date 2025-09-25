// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

//proves the contrapositive
@pure def not3(p: B, q: B, r: B): Unit = {
  Deduce(
    ( p __>: q ) |- ( !q __>: !p  )
      Proof(
      1 (  p __>: q ) by Premise,

    )
  )
}