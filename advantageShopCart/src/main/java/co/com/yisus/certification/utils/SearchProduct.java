package co.com.yisus.certification.utils;

import static co.com.yisus.certification.utils.Constants.*;
import static co.com.yisus.certification.utils.ProductsId.*;

public class SearchProduct {

    public static String byName(String name){
        switch (name.toUpperCase()){
            case TABLET_HP_ELITEPAD:
                return TABLET.getCode();
            case PC_HP_ELITEBOOK:
                return COMPUTER.getCode();
            case SPEAKER_HP:
                return SPEAKER.getCode();
            default:
                throw new RuntimeException();
        }
    }
    public static String byCode(String code){
        switch (code){
            case CODE_TABLET_HP_ELITEPAD:
                return TABLET.getName();
            case CODE_PC_HP_ELITEBOOK:
                return COMPUTER.getName();
            case CODE_SPEAKER_HP:
                return SPEAKER.getName();
            default:
                throw new RuntimeException();
        }
    }
}
