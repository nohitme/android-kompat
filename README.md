# Android Kompat

Android Compat Kotlin extension functions and properties

## Why This?

With the help of [Kotlin][1] language, we can get rid of the ugly syntax like:

```
fun ugly() {
    val view : View
    val x = ViewCompat.getX(view)
    ViewCompat.setX(view, 1.0f)
}
```

and replace it with:

```
fun withExtensions() {
    val view : View
    val x = view.xCompat
    view.xCompat = 1.0f
}
```

The `xCompat` property is defined as an extension property which directly calls to ViewCompat methods:

```
var View.xCompat: Float
    get() = ViewCompat.getX(this)
    set(value) = ViewCompat.setX(this, value)
```

All the functions and properties are posfixed with `*Compat` so you can see it pops up in IDE and know there's a compat method you should be using.

## Notes

* The packages are the same as the ones defined in [Android Support Compat][2], so it's easier to track the changes
* All the `public static` methods are transalted into corresponding functinos or properties.
    1. Methods start with `set`, `get`, or `is (with Boolean return type)` are defined as extension properties unless they take in extra arguments and are not suitable for extension properties.
    2. If either getter or setter is not defined in compat class and it can be found in the normal Android class, the normal Android method would be used in conjunction with the compat method to make the extension property look more 'natural'
    3. Methods that are not suitable for properties will be converted into simple extionsion methods.
* The project will be updated alongside with the latest stable support libarary.
* No maven artifact is available at this moment, just use [Jitpack][1] to grab it, or you can copy the files into your project. It's straightforward enough.

## Feedbacks

If you find anything missing or wrong, feel free to submit pull requests or file an issue. Thanks.


[1]: https://kotlinlang.org/
[2]: https://github.com/android/platform_frameworks_support/tree/master/compat/java/android/support/v4
[3]: https://jitpack.io/
