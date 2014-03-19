// Comment to get more information during initialization
//logLevel := Level.Warn

// The Typesafe repository
//resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.1")

// Load dependencies from Maven
// @see: https://github.com/sbt/sbt/issues/1123 and https://github.com/sbt/sbt-pom-reader
addSbtPlugin("com.typesafe.sbt" % "sbt-pom-reader" % "1.0.1")