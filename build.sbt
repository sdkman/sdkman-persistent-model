import Dependencies._

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "1.0.0"
ThisBuild / organization     := "io.sdkman"
ThisBuild / organizationName := "sdkman"

lazy val root = (project in file("."))
  .settings(
    name := "sdkman-persistent-domain",
  )