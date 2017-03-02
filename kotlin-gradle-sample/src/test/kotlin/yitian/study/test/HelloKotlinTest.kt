package yitian.study.test

import org.junit.Before
import org.junit.Test
import yitian.study.HelloKotlin

class HelloKotlinTest {
    lateinit var hello: HelloKotlin
    @Before
    fun init() {
        hello = HelloKotlin()
    }

    @Test
    fun testHelloKotlin() {
        hello.helloKotlin()
        hello.helloKotlin("易天")
    }
}