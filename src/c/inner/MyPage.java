package c.inner;

public class MyPage {
    public static void main(String[] args) {
        MyPage myPage = new MyPage();
        myPage.setUI();
        myPage.pressKey();
    }

    InputBox input;

    public void setUI() {
        this.input = new InputBox();
        KeyEventListener keyEventListener = new KeyEventListener() {
            @Override
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void onKeyUp() {
                System.out.println("Key Up");
            }
        };
        input.setKeyListener(keyEventListener);
    }

    public void pressKey() {
        input.listenerCalled(2);
        input.listenerCalled(4);
    }
}
