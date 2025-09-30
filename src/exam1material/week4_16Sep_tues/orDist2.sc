// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._



@pure def orDist2(p: B, q: B, r: B): Unit = {
  Deduce(
    ( (p | q ) & (p | r) ) |- ( p | (q & r) )
      Proof(
        //PROOF GOES HERE
    1 (p ∨ q) ∧ (p ∨ r) by Premise // premise
    2 -> p ∨ q               // from 1 by ∧E
    3 -> p ∨ r               // from 1 by ∧E

    Subproof(
      Assume(p),
      4 -> p ∨ (q ∧ r),      // from  p, by ∨I (left)
    ),                       // discharges Assume(p)

    Subproof(
      Assume(q),

      Subproof(
        Assume(p),
        5 -> p ∨ (q ∧ r),    // from p, by ∨I (left)
      ),                     // discharge Assume(p)

      Subproof(
        Assume(r),
        6 -> q ∧ r,          // from q,r by ∧I
        7 -> p ∨ (q ∧ r),    // from 6, by ∨I (right)
      )                      // discharge Assume(r)

      // Combine subproofs with ∨E on line 3
      8 -> p ∨ (q ∧ r)       // from 3, using Subproofs
    ),                       // discharge Assume(q)

    // Combine subproofs with ∨E on line 2
    9 -> p ∨ (q ∧ r)         // from 2, using both top subproofs
  )
)

    )
  )
}