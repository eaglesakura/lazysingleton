# What is this?

Lazy init object wrapper.

# Example

```kotlin
private val instance: LazySingleton<Foo>()

fun getFoo(context: Context): Foo {
    return instance.get {
        // this block call once.
        // init with Argument.
        Foo(context)
    }
}
```

# How to install

```groovy
// build.gradle
dependencies {
    implementation 'io.github.eaglesakura.lazysingleton:lazysingleton:${replace version}'
}
```

# LICENSE

[LICENSE.txt](LICENSE.txt)