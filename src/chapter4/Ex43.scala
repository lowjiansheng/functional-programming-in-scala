package chapter4

trait Ex43 {
    def map2[A,B,C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C]
}

/*
Write a generic function map2 that combines two Option values using a binary function.
If either Option value is None, then the return value is too. Here is its signature:
 */
object Ex43 extends Ex43 {
    override def map2[A,B,C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] = {
        val c: Option[C] = (a,b) match {
            case (Some(a), Some(b)) => Some(f(a, b))
            case _ => None
        }
        c
    }
}
