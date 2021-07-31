organization := "org.scalablytyped"
name := "redux-shortcuts"
version := "0.0-dt-20200923Z-f97cf2"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mousetrap" % "1.6.x-dt-20201002Z-760439",
  "org.scalablytyped" %%% "redux" % "4.0.5-119b89",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
