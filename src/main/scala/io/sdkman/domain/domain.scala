package io.sdkman.domain

case class Application(alive: String, stableCliVersion: String, betaCliVersion: String)

case class Candidate(
    candidate: String,
    name: String,
    description: String,
    default: Option[String],
    websiteUrl: String,
    distribution: String
)

case class Version(
    candidate: String,
    version: String,
    platform: String,
    url: String,
    vendor: Option[String] = None,
    visible: Option[Boolean] = Some(true)
)
