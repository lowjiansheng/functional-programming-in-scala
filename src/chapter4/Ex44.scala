package chapter4

trait Ex44 {
    def sequence[A](a: List[Option[A]]): Option[List[A]]
}

object Ex44 extends Ex44{
    override def sequence[A](a: List[Option[A]]): Option[List[A]] = {
        Some(a.map {
            case Some(aAA) => aAA
            case _ => return None
        })
    }
}
