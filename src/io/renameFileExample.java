
package io;

import java.io.File;


public class renameFileExample {
    public static void main(String[] args) {
        try {
            File oldFile = new File("C:\\Users\\ahamm\\jalal.text");
            File newFile = new File("C:\\Users\\ahamm\\jalal_new.txt");
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed succesful.");
            } else {
                System.out.println("File renamed failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
