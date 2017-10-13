package j;

import g.SomeGroovyClass;

public class RunnerJava {
    public static void main(String[] args) {
        SomeGroovyClass someGroovyClass = new SomeGroovyClass("aa", "bb");
        System.out.println(someGroovyClass.concat());

        SomeJavaClass someJavaClass = new SomeJavaClass("aa", "bb");
        System.out.println(someJavaClass.concat());

        System.out.println("aa".equals(new String("aa")));
        System.out.println("aa" == new String("aa"));
    }
}
