# SDKMAN Persistent Model

This repo contains Scala case classes that mirror the persistent database structures for SDKMAN!

## Releases

This project relies on [JitPack](https://jitpack.io/) for releases. Push a release tag for downstream projects to
benefit from this persistent model.

## Downstream dependencies

Add the following to _build.gradle_:

```
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.sdkman:sdkman-persistent-model:x.y.z'
}
```

Or to _build.sbt_:

```
resolvers ++= Seq(
  Resolver.mavenCentral,
  "jitpack" at "https://jitpack.io"
)

libraryDependencies ++= Seq(
  "com.github.sdkman" % "sdkman-persistent-model" % "x.y.z",
)
```