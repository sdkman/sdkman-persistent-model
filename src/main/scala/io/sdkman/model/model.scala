package io.sdkman.model

sealed trait ChecksumAlgorithm {
  def id: String
  def priority: Integer
}

case object MD5 extends ChecksumAlgorithm {
  override val id       = "MD5"
  override val priority = 0
}

case object SHA1 extends ChecksumAlgorithm {
  override val id       = "SHA-1"
  override val priority = 1
}

case object SHA224 extends ChecksumAlgorithm {
  override val id       = "SHA-224"
  override val priority = 2
}

case object SHA256 extends ChecksumAlgorithm {
  override val id       = "SHA-256"
  override val priority = 3
}

case object SHA384 extends ChecksumAlgorithm {
  override val id       = "SHA-384"
  override val priority = 4
}

case object SHA512 extends ChecksumAlgorithm {
  override val id       = "SHA-512"
  override val priority = 5
}

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
    visible: Option[Boolean] = Some(true),
    checksums: Option[Map[String, String]] = None
)
