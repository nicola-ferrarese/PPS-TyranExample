import scala.sys.process._
import scala.language.postfixOps

enablePlugins(ScalaJSPlugin)

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.2"

lazy val scala3Version = "3.4.1"

testFrameworks += new TestFramework("munit.Framework")
scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }
crossScalaVersions := Seq(scala3Version)
semanticdbEnabled  := true
autoAPIMappings    := true

libraryDependencies ++= Seq(
  "io.indigoengine" %%% "tyrian" % "0.10.0",
  "io.indigoengine" %%% "tyrian-io" % "0.10.0"
)


