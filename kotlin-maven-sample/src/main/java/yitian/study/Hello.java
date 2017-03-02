package yitian.study;


public class Hello {
    public void hello(String name) {
        System.out.println("hello " + name);
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.hello("yitian");
    }
}
