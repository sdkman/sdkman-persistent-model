import Dependencies._

ThisBuild / scalaVersion := "2.13.6"
ThisBuild / version := "1.0.0"
ThisBuild / organization := "io.sdkman"
ThisBuild / name := "sdkman-persistent-domain"

lazy val root = (project in file("."))
  .settings(
    name := "sdkman-persistent-domain",
  )
