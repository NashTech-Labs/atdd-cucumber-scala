name := "Cucumber Scala example"

version := "0.1"

scalaVersion := "2.10.0-RC2"

libraryDependencies += "org.scalatest" % "scalatest_2.10.0-RC2" % "2.0.M5" % "test"

seq(cucumberSettings : _*)