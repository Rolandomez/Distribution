organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "8.1.0-aa7959"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "8.1.0-546ac4",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.17.3-3c0453",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.17.3-7359b5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
