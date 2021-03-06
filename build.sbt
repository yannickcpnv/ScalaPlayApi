ThisBuild / scalaVersion := "2.13.8"

ThisBuild / version := "1.0.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala, BuildInfoPlugin)
  .settings(
    name := "Scala Play Framework Api Demo",
    libraryDependencies ++= Seq(
      guice,
      "com.typesafe.play" %% "play-slick" % "5.0.2",
      "com.typesafe.play" %% "play-slick-evolutions" % "5.0.2",
      "com.h2database" % "h2" % "2.1.212",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
    ),
    buildInfoKeys := Seq[BuildInfoKey](
      name,
      version,
      scalaVersion,
      sbtVersion
    ),
    buildInfoPackage := "api",
  )
