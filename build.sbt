import Dependencies._

lazy val commonSettings = Seq(
  name := "scala-spark-test",
  organization := "com.dnutels",
  version := "0.0.1-alpha.2",
  scalaVersion := "2.11.11"
)

lazy val root = project.in(file("."))
  .settings(
    commonSettings,
    libraryDependencies ++= dependencies
  )
