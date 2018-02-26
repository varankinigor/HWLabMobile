package enums;

public enum HOME_PANEL_TEXTS {
    HEADER_TEXT("The global coordination of the DNS Root, IP addressing, and other Internet protocol resources is performed as the Internet Assigned Numbers Authority (IANA) functions. Learn more."),
    DOMAINS_HEADER_TEXT("Domain Names"),
    DOMAINS_TEXT("Management of the DNS Root Zone (assignments of ccTLDs and gTLDs) along with other functions such as the .int and .arpa zones."),
    NUMBERS_HEADER_TEXT("Number Resources"),
    NUMBERS_TEXT("Coordination of the global IP and AS number spaces, such as allocations made to Regional Internet Registries."),
    PROTOCOLS_HEADER_TEXT("Protocol Assignments"),
    PROTOCOLS_TEXT("The central repository for protocol name and number registries used in many Internet protocols.");

    private String text;

    HOME_PANEL_TEXTS(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
