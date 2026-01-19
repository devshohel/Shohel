
package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\ahamm\\test.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            
//            String line;
//
//            while ((line = br.readLine()) != null) {                
//                System.out.println(line);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
