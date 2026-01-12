
package io;

import java.io.File;

public class DeleteFileExample2 {
    public static void main(String[] args) {
        try {
            File dFile = new File("C:\\Users\\ahamm\\java.text");
            dFile.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
