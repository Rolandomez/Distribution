organization := "org.scalablytyped"
name := "naver-whale"
version := "0.0-unknown-dt-20200515Z-3cc94e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20200723Z-907e4a",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20200515Z-fc5e2f",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20200515Z-55a26d",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20200515Z-d037a5",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
