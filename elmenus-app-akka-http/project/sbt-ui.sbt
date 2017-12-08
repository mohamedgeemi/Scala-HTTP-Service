// This plugin represents functionality that is to be added to sbt in the future

addSbtPlugin("org.scala-sbt" % "sbt-core-next" % "0.1.1")

resolvers += Classpaths.typesafeReleases

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.4")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.2.0-M8")

addSbtPlugin("com.typesafe.sbt" % "sbt-multi-jvm" % "0.3.11")