
package io;

import java.io.File;
import java.io.IOException;

public class CreateFileExample2 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ahamm\\java2");
            
            if (file.createNewFile()) {
                System.out.println("File is created.");
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
