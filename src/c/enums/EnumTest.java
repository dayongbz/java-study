package c.enums;

public enum EnumTest {
    DAYONG("이다용",20),DOG("개",3);

    private final String name;
    private final int age;

    EnumTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
