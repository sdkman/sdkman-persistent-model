import Dependencies._

ThisBuild / scalaVersion := "2.12.15"
ThisBuild / version := "1.0.0"
ThisBuild / organization := "io.sdkman"
ThisBuild / name := "sdkman-persistent-model"

lazy val root = (project in file("."))
  .settings(
    name := "sdkman-persistent-model",
  )
