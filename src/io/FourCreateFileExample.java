
package io;

import java.io.File;
import java.io.IOException;


public class FourCreateFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\SHOHEL\\Desktop\\test.txt");
            if (file.createNewFile()) {
                System.out.println("File is created.");
            } else {
                System.out.println("File not created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
