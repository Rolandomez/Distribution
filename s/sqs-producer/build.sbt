organization := "org.scalablytyped"
name := "sqs-producer"
version := "3.1.1-58fbbc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__client-sqs" % "3.329.0-e79d36",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.329.0-35fc6e",
  "org.scalablytyped" %%% "aws-sdk__middleware-endpoint" % "3.329.0-065ce6",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.329.0-a363ee",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.329.0-62d616",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.329.0-caa31a",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.329.0-98a842",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.329.0-3ef5a2",
  "org.scalablytyped" %%% "aws-sdk__util-endpoints" % "3.332.0-7550bd",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
