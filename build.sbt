name := "sbt-cucumber"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.3"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.3.3" % Test

libraryDependencies += "info.cukes" % "cucumber-scala_2.11" % "1.2.4" % Test
libraryDependencies += "info.cukes" % "cucumber-junit" % "1.2.4" % Test
libraryDependencies += "junit" % "junit" % "4.12" % Test