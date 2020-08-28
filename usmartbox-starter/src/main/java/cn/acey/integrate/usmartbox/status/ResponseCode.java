package cn.acey.integrate.usmartbox.status;

public enum ResponseCode {
    SUCCESS("000000"),
    SYSTEM_ERROR("999999"),
    SIGN_ERROR("000023"),
    APIKEY_ERROR("000024");

    private final String value;

    ResponseCode(String v) {
        value = v;
    }

    public static ResponseCode fromValue(String v) {
        for (ResponseCode c : ResponseCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }
}
