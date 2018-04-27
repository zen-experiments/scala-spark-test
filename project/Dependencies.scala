import sbt._

object Dependencies {
  val sparkVersion = "2.2.1"
  val scalatestVersion = "3.0.4"

  val dependencies = Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.scalatest" %% "scalatest" % scalatestVersion
  )
}