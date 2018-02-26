package enums;

public enum BROWSERS {
    CHROME("Chrome"),
    SAFARI("Safari");

    private String text;

    BROWSERS(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
