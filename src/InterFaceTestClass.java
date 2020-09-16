public class InterFaceTestClass implements InterFaceTest{
    public static void main(String[] args) {
        InterFaceTestClass test = new InterFaceTestClass();
        test.sayHello();
    }

    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
