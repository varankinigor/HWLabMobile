package enums;

public enum  ADD_CONTACT_TITLES {
    TARGET_ACCOUNT("Target Account"),
    CONTACT_NAME("Contact Name"),
    CONTACT_PHONE("Contact Phone"),
    CONTACT_EMAIL("Contact Email");

    private String text;

    public String getText() {
        return text;
    }

    ADD_CONTACT_TITLES(String text) {
        this.text = text;
    }
}
