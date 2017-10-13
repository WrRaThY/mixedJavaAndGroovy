package j;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author WrRaThY
 * @since 11.10.2017
 */
public class SomeJavaClassJUnitTest {
    @Test
    public void someJavaClassTest() throws Exception {
        //given:
        String field1 = "aa";
        String field2 = "bb";

        //when:
        String concat = new SomeJavaClass(field1, field2).concat();

        //then:
        assertThat(concat, CoreMatchers.is("aabb"));
    }

}