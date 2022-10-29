package co.com.yisus.certification.utils;

import static co.com.yisus.certification.utils.Constants.*;

public enum ProductsId {

    TABLET(TABLET_HP_ELITEPAD,CODE_TABLET_HP_ELITEPAD),
    COMPUTER(PC_HP_ELITEBOOK,CODE_PC_HP_ELITEBOOK),
    SPEAKER(SPEAKER_HP,CODE_SPEAKER_HP);

    private String name;
    private String code;

    ProductsId(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String   getCode() {
        return code;
    }
}
