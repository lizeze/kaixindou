package io.github.kaixindou.tool;


public class StringUtils {


    public static boolean isNull(String str) {


        return str == null || str.trim().equals("");
    }

    public static boolean isNotNull() {


        return isNull() == false;
    }
}
