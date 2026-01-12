
package io;

import java.io.File;

public class deleteFileExample {
    public static void main(String[] args) {
        try {
            File dFile = new File("C:\\Users\\ahamm\\jalal_new.txt");
            if (dFile.delete()) {
                System.out.println("File delete succesful.");
            } else {
                System.out.println("Delete operation is failed");
            }
        } catch (Exception e) {
            e.printStackTrace();        }
    }
}
