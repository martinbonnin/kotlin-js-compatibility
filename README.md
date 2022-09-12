Reproducer for an issue where the JS compiler doesn't see artifacts produced by the 1.7 compiler (with languageVersion=1.5)

To reproduce:

```
# publish a lib built with 1.7 and languageVersion=1.5
./gradlew -p lib publishToMavenLocal

# try to consume it
./gradlew -p app compileKotlinJs

# error 
> Task :compileKotlinJs FAILED
e: /Users/mbonnin/git/js-compat/app/src/commonMain/kotlin/app/HelloApp.kt: (4, 11): Unresolved reference: lib
```