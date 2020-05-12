package com.devhwang1312.filemanager;

import android.util.Log;

import java.io.File;

public class Utils {

    public static void get(){
        double size = new File("/data").getTotalSpace() / (1024.0 * 1024 * 1024);

        double sizesystem = new File("/system").getTotalSpace() / (1024.0 * 1024 * 1024);

        double sizedev = new File("/dev").getTotalSpace() / (1024.0 * 1024 * 1024);

        double sizecache = new File("/cache").getTotalSpace() / (1024.0 * 1024 * 1024);

        double sizemnt = new File("/mnt").getTotalSpace() / (1024.0 * 1024 * 1024);

        double sizevendor = new File("/vendor").getTotalSpace() / (1024.0 * 1024 * 1024);

        float total = (float) (sizemnt + sizedev + sizesystem + size + sizevendor + sizecache);
        Log.e("total111", String.valueOf(total));


    }

    public static void runShellCommand(String command) throws Exception {
        Log.e("HVV1312","run conde");
        Process process = Runtime.getRuntime().exec(command);
        process.waitFor();
        Log.e("HVV1312","run condend");
    }

}
