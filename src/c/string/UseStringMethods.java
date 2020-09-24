package c.string;

public class UseStringMethods {
    public static void main(String[] args) {
        UseStringMethods test = new UseStringMethods();
        String str = "The String class represents character strings.";
        test.printWords(str);
        test.findString(str, "string");
        test.findAnyCaseString(str, "string");
        test.countChar(str, 's');
        test.printContainWords(str, "ss");
    }

    public void printWords(String str) {
        for (String value : str.split(" ")) {
            System.out.println(value);
        }
    }

    public void findString(String str, String findStr) {
        System.out.println("string is appeared at " + str.indexOf(findStr));
    }

    public void findAnyCaseString(String str, String findStr) {
        System.out.println("string is appeared at " + str.toLowerCase().indexOf(findStr));
    }

    public void countChar(String str, char c) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (char value : arr) {
            if (value == c) {
                count++;
            }
        }
        System.out.printf("char '%c' count is %d\n", c, count);
    }

    public void printContainWords(String str, String findStr) {
        String[] arr = str.split(" ");
        for (String value : arr) {
            if (value.contains(findStr)) {
                System.out.printf("%s contains %s\n", value, findStr);
            }
        }
    }
}
