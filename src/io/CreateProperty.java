
package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class CreateProperty {
    public static void main(String[] args) {
        Properties prop = new Properties();
        FileOutputStream output = null;
        
        try {
            output = new FileOutputStream("config.properties");
            prop.setProperty("database", "localhost");
            prop.setProperty("dbuser", "user");
            prop.setProperty("dbpassword", "123");
            
            prop.store(output, "database configaration");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(output != null){
                try{
                output.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
