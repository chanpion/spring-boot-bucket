package com.chanpion.boot.samples;

/**
 * @author April Chen
 * @date 2019/4/22 14:23
 */
public class JavaDemo {

    static class A {
        static {
            System.out.println("1");
        }

        public A() {
            System.out.println("2");
        }
    }

    static class B extends A {
        static {
            System.out.println("a");
        }
      public B() {
            System.out.println("b");
        }
    }

    public static void main(String[] args) {
        A ab = new B();
        ab=new B();
    }
}

