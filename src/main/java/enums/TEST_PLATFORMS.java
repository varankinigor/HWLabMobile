package enums;

public enum TEST_PLATFORMS {
    ANDROID("Android"),
    IOS("iOS");

    private final String text;

    TEST_PLATFORMS(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
