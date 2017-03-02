package yitian.study

import org.junit.Before;
import org.junit.Test;

class HiTest {
    lateinit var hi: Hi
    @Before
    fun init(){
        hi=Hi()
    }
    @Test
    fun testHi(){
        hi.say()
    }
}