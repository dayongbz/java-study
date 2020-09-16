public enum EnumTest {
    DAYONG_JJANG("다용짱");
    private final String text;

    EnumTest(String text) {
        this.text = text;
    }
    public String getText() {
        return this.text;
    }
}
