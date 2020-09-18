package c.service;

public class ProfileEditor extends ProfileEditorAbstract{
    public static void main(String[] args) {
        ProfileEditor profileEditor = new ProfileEditor();
        profileEditor.editName("hello");
    }
    @Override
    public void editAge(int age) {
        // 구현 생략
    }
}
