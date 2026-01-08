
package io;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File file = new File();
            file.createNewFile("C:\\Shohel01.txt")
            if(file.createNewFile()){
                System.out.println("File is create");
            }else{
                System.out.println("File is not create");
            }
        } catch (Exception e) {
        }
            
    }
}
