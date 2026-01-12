
package io;

import java.io.File;
import java.io.IOException;

public class CreateFileExample3 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ahamm\\test.txt");
            if (file.createNewFile()) {
                System.out.println("File is created.");
            } else {
                System.out.println("File alreadey exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
