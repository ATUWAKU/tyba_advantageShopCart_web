package co.com.yisus.certification.utils;

public enum ColorIndex {

    GRAY("GRAY","1"),
    PURPLE("PURPLE","2");

    private String name;
    private String index;

    ColorIndex(String name, String code) {
        this.name = name;
        this.index = code;
    }

    public String getName() {
        return name;
    }

    public String getIndex() {
        return index;
    }
}
