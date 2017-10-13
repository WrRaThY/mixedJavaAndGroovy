package g

import j.SomeJavaClass

/**
 * @author WrRaThY
 * @since 11.10.2017
 */
class RunnerGroovy {
    static void main(String[] args) {
        SomeGroovyClass someGroovyClass = new SomeGroovyClass("aa", "bb")
        println someGroovyClass.concat()

        SomeJavaClass someJavaClass = new SomeJavaClass("aa", "bb")
        println someJavaClass.concat()

        println "aa" == new String("aa")
        println "aa".equals(new String("aa"))
    }
}
