package example

trait Greeting {
  lazy val greeting: String = "hello"
}

object Hello extends Greeting with App {
  println(greeting)
}
