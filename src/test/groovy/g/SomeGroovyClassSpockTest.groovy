package g

import spock.lang.Specification
import spock.lang.Unroll
/**
 * @author WrRaThY
 * @since 11.10.2017
 */
class SomeGroovyClassSpockTest extends Specification {
    @Unroll
    def "SomeGroovyClass spock"() {
        given:
            String field1 = "aa"
            String field2 = "bb"

        when:
            String concat = new SomeGroovyClass(field1, field2).concat()

        then:
            concat == "aabb"
    }
}
