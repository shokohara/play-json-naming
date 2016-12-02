scalariformSettings

name := """play-json-naming"""

version := "1.2.0-SNAPSHOT"

scalaVersion := "2.12.0"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.6.0-SNAPSHOT" % "provided",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

organization := "com.github.tototoshi"

publishMavenStyle := true

publishTo <<= version { (v: String) => _publishTo(v) }

publishArtifact in Test := false

pomExtra := _pomExtra

def _publishTo(v: String) = {
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT")) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

val _pomExtra =
  <url>http://github.com/tototoshi/play-json-naming</url>
  <licenses>
    <license>
      <name>Apache License, Version 2.0</name>
      <url>http://github.com/tototoshi/play-json-naming/blob/master/LICENSE.txt</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:tototoshi/play-json-naming.git</url>
    <connection>scm:git:git@github.com:tototoshi/play-json-naming.git</connection>
  </scm>
  <developers>
    <developer>
      <id>tototoshi</id>
      <name>Toshiyuki Takahashi</name>
      <url>http://tototoshi.github.com</url>
    </developer>
  </developers>
