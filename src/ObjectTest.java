public class ObjectTest {
    public static void main(String[] args) {
        ObjectTest obj = new ObjectTest();
        obj.checkToString();

    }

    public void checkToString() {
        System.out.println(this);
        System.out.println(toString());
        System.out.println(this + "32");
    }
}
