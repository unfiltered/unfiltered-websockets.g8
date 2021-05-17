organization := "com.example"

name := "$name$"

scalaVersion := "$scala_version$"

version := "0.1.0"

libraryDependencies ++= Seq(
  "ws.unfiltered" %% "unfiltered-netty-websockets" % "$unfiltered_version$"
)

val unusedWarnings = (
  "-Ywarn-unused" ::
  Nil
)

scalacOptions ++= unusedWarnings

Seq(Compile, Test).flatMap(c =>
  c / console / scalacOptions --= unusedWarnings
)

scalacOptions ++= "-deprecation" :: "unchecked" :: "-feature" :: Nil
