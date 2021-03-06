name := "scala-bcrypt"

organization := "com.github.t3hnar"

description := "Scala wrapper for jBcrypt + pom.xml inside"

scalaVersion := "2.12.2"

crossScalaVersions := Seq("2.12.2", "2.11.11", "2.10.6")

releaseCrossBuild := true

licenses := Seq(("Apache License, Version 2.0", url("http://www.apache.org/licenses/LICENSE-2.0")))

homepage := Some(new URL("https://github.com/t3hnar/scala-bcrypt"))

startYear := Some(2012)

scalacOptions := Seq(
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  "-deprecation",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Xfuture")

libraryDependencies ++= Seq(
  "com.github.PWAckerman" %% "jBCrypt" % "0.4",
  "org.scalatest" %% "scalatest" % "3.0.3" % Test)

pomExtra in Global := {
  <scm>
    <url>git@github.com:t3hnar/scala-bcrypt.git</url>
    <connection>scm:git:git@github.com:t3hnar/scala-bcrypt.git</connection>
    <developerConnection>scm:git:git@github.com:t3hnar/scala-bcrypt.git</developerConnection>
  </scm>
    <developers>
      <developer>
        <id>t3hnar</id>
        <name>Yaroslav Klymko</name>
        <email>t3hnar@gmail.com</email>
      </developer>
    </developers>
}

releasePublishArtifactsAction := PgpKeys.publishSigned.value
