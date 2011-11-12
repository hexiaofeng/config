import de.johoop.findbugs4sbt.FindBugs._
import de.johoop.findbugs4sbt.ReportType
import de.johoop.jacoco4sbt._
import JacocoPlugin._

name := "config"

version := "0.1"

fork in test := true

fork in run := true

fork in run in Test := true

libraryDependencies += "net.liftweb" %% "lift-json" % "2.4-SNAPSHOT" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.7" % "test"

externalResolvers += "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/"

seq(findbugsSettings : _*)

findbugsReportType := ReportType.Html

findbugsReportName := "findbugs.html"

seq(jacoco.settings : _*)
