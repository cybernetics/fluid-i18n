fluid-i18n
============

[![Maven Central](https://img.shields.io/maven-central/v/io.fluidsonic.i18n/fluid-i18n?label=Maven%20Central)](https://search.maven.org/artifact/io.fluidsonic.i18n/fluid-i18n)
[![JCenter](https://img.shields.io/bintray/v/fluidsonic/kotlin/i18n?label=JCenter)](https://bintray.com/fluidsonic/kotlin/i18n)
[![Tests](https://github.com/fluidsonic/fluid-i18n/workflows/Tests/badge.svg)](https://github.com/fluidsonic/fluid-i18n/actions?workflow=Tests)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.4.0%20(Darwin,%20JVM,%20JS)-blue.svg)](https://github.com/JetBrains/kotlin/releases/v1.4.0)
[![#fluid-libraries Slack Channel](https://img.shields.io/badge/slack-%23fluid--libraries-543951.svg?label=Slack)](https://kotlinlang.slack.com/messages/C7UDFSVT2/)

Kotlin multiplatform internationalization support backed by [Unicode CLDR](http://cldr.unicode.org/) data.  
**Highly experimental. Feel free to contribute!**



Installation
------------

`build.gradle.kts`:
```kotlin
dependencies {
    implementation("io.fluidsonic.i18n:fluid-i18n:0.9.0")
}
```



Usage
-----

### Country names

```kotlin
val usa = Country.byCode("US")
println(usa.name) // United States
println(usa.shortName) // US
println(usa.variantName) // United States

val locale = Locale.forLanguage("de")
println(usa.name(locale)) // Vereinigte Staaten
println(usa.shortName(locale)) // USA
println(usa.variantName(locale)) // Vereinigte Staaten

val ivoryCoast = Country.forCode("CI")
println(usa.name) // Côte d’Ivoire
println(usa.shortName) // Côte d’Ivoire
println(usa.variantName) // Ivory Coast
```



License
-------

Apache 2.0