package org.opentutorials.javatutorials.method;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileStreamDemo {
    public static void main(String[] args){
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write("1234");
            out.close();
        }
        catch(IOException e){
        }
    }
}
