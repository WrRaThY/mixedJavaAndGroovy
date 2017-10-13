package g
/**
 * @author WrRaThY
 * @since 11.10.2017
 */
class SomeGroovyClass {
    String field1
    String field2

    SomeGroovyClass(String field1, String field2) {
        this.field1 = field1
        this.field2 = field2
    }

    String concat() {
        field1 + field2
    }
}
