package yitian.study.test;


import org.junit.Before;
import org.junit.Test;
import yitian.study.JavaHello;

public class TestJavaHello {
    private JavaHello hello;

    @Before
    public void init() {
        hello = new JavaHello();
    }

    @Test
    public void testJavaHello() {
        hello.hello();
    }
}
