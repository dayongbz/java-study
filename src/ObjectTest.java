import java.util.Objects;

public class ObjectTest {
    int num = 0, age = 20;
    String name = "dayong";

    public static void main(String[] args) {
        ObjectTest obj1 = new ObjectTest();
        ObjectTest obj2 = new ObjectTest();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectTest that = (ObjectTest) o;
        return num == that.num &&
                age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, age, name);
    }
}
