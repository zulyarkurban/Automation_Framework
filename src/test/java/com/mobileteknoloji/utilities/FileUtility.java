package com.mobileteknoloji.utilities;

import org.testng.annotations.Test;

import java.io.File;

public class FileUtility {


    @Test
    public void test() {
        String home = System.getProperty("user.home");
        String directory = home + "/documents";

        System.out.println(getMostRecentFile(directory));
    }


    /**
     * returns the most recent file in the given directory
     *
     * @param directory
     * @return
     */
    public static String getMostRecentFile(String directory) {

        File dir = new File(directory);
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            return null;
        }

        File lastModifiedFile = files[0];
        for (int i = 1; i < files.length; i++) {

            if (lastModifiedFile.lastModified() < files[i].lastModified()) {
                lastModifiedFile = files[i];
            }
        }
        return lastModifiedFile.getAbsolutePath();
    }


    /**
     * Delete files in the given path and returns true if successfully deleted
     *
     * @param filePath
     * @return
     */
    public static boolean delete(String filePath) {
        File file = new File(filePath);
        return file.delete();

    }



}
