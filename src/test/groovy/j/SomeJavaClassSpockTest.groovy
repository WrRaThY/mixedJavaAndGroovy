package j

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author WrRaThY
 * @since 11.10.2017
 */
class SomeJavaClassSpockTest extends Specification {
    @Unroll
    def "SomeJavaClass spock"() {
        given:
            String field1 = "aa"
            String field2 = "bb"

        when:
            String concat = new SomeJavaClass(field1, field2).concat()

        then:
            concat == "aabb"
    }
}
