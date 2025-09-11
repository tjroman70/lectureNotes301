// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

//Prove the sequent:
//p, q, r ⊢ r ∧ (q ∧ p)


@pure def and2(p: B, q: B, r: B): Unit = {
  Deduce(
    (p, q, r) |- (r & (q & p))
      Proof(
        //PROOF GOES HERE
        1 ( p ) by Premise,
        2 ( q ) by Premise,
        3 ( r ) by Premise,
        4 ( q & p ) by AndI(2, 1),
        5 ( r & (q & p)) by AndI(3, 4)
      )
  )
}