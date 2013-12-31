organization := "organization"

name := "appName"

version := "1.0-SNAPSHOT"

autoScalaLibrary := false

crossPaths := false

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java

libraryDependencies ++= Seq(
	"com.novocode" % "junit-interface" % "0.8" % "test",
	"org.hibernate" % "hibernate-core" % "4.2.8.Final"
	)
