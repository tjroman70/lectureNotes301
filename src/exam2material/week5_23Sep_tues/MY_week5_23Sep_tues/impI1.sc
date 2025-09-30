// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

@pure def imply1(p: B, q: B, r: B): Unit = {
  Deduce(
    (p __>: r, q __>: r ) |- ( p & q __>: r )
      Proof(
      1 (  p __>: r   ) by Premise,
      2 (  q __>: r   ) by Premise,
      3 SubProof(
        4 Assume (p & q),
        5 ( p ) by AndE(4),
        6 ( p ) by ImplyE(1, 5)
      ),
      7 (p & q __>: r ) by ImplyI(3)
    )
  )
}