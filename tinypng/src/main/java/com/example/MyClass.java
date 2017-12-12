package com.example;

import com.hearglobal.multi.Starter;

public class MyClass {
    public static final String KEY = "/Users/zhangyanrong/AndroidStudioProjects/TinyPngCompress/tinypng/src/main/java/com/example/key_shuai";
    public static final String LOG = "/log.pic";
    public static final String SRC = "/Users/zhangyanrong/AndroidStudioProjects/TinyPngCompress/tinypng/src/main/java/com/example/src";
    public static final String DEST = "/Users/zhangyanrong/AndroidStudioProjects/TinyPngCompress/tinypng/src/main/java/com/example/dest";

    public static void main(String string[]) throws Exception {
        Starter compress = new Starter();
        Starter.setApi_key_location(KEY);
        Starter.setPic_log_location(LOG);
        compress.compress(SRC, DEST, 5);
    }
}
