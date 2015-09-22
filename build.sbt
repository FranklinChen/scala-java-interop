name := "scala-java-interop"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/scala-java-interop"))

startYear := Some(2015)

description := "A Scala project"

version := "1.0.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.6.4" % Test
)
