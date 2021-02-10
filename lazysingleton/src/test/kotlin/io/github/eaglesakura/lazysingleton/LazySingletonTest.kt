package io.github.eaglesakura.lazysingleton

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Assert.fail
import org.junit.Test

class LazySingletonTest {

    @Test
    fun get() {
        val singleton = LazySingleton<String>()

        val instance1 = singleton.get {
            "${System.currentTimeMillis()}"
        }

        val instance2 = singleton.get {
            fail()
            "abcdefg"
        }

        assertEquals(instance1, instance2)
        assertNotEquals("abcdefg", instance2)
    }
}
