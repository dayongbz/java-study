package c.inner;

public class Test {
    public static void main(String[] args) {
        StaticNested staticNested = new StaticNested();
        Test test = new Test() {
            @Override
            public void printTest() {
                System.out.println("hello Override");
            }
        };
        test.printTest();
    }


    static class StaticNested {
        int num = 0;
    }

    public void printTest() {
        System.out.println("hello");
    }
}
