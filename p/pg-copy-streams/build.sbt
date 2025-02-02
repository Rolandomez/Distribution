organization := "org.scalablytyped"
name := "pg-copy-streams"
version := "1.2-dt-20230201Z-b9d5f4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "pg" % "8.6-dt-20230328Z-2ab960",
  "org.scalablytyped" %%% "pg-protocol" % "1.6.0-de8ce2",
  "org.scalablytyped" %%% "pg-types" % "4.0.1-ebd2c8",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
