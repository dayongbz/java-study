package c.enums;

public class EnumTestClass {
    public static void main(String[] args) {
        EnumTest profile = EnumTest.DAYONG;
        EnumTest []values = EnumTest.values();
        System.out.println(profile.getAge());
        System.out.println(profile.getName());
        System.out.println(EnumTest.valueOf("DAYONG"));
        System.out.println(profile.compareTo(EnumTest.DOG));
        System.out.println(EnumTest.valueOf("DAYONG"));

//        for(EnumTest value:values) {
//            System.out.println(value);
//        }
    }
}
