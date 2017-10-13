package j;

public class SomeJavaClass {
    private final String field1;
    private final String field2;

    public SomeJavaClass(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String concat() {
        return field1 + field2;
    }
}
