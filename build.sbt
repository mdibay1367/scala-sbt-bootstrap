name := ""

organization := "dibay"

version := "0.1"

scalaVersion := "2.11.7"

viewSettings

scalacOptions ++= Seq("-deprecation", "-unchecked")

scalacOptions ++= Seq("-Yrangepos")

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "org.specs2" %% "specs2-core" % "3.6.4" % "test"
)

initialCommands += """"""

