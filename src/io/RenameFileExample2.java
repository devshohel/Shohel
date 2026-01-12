
package io;

import java.io.File;

public class RenameFileExample2 {
    public static void main(String[] args) {
        try {
            File oldFile = new File("C:\\Users\\ahamm\\java2");
            File newFile = new File("C:\\Users\\ahamm\\java2.txt");
            oldFile.renameTo(newFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
