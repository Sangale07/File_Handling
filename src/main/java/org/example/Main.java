package org.example;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    File file = new File("C:\\Users\\rushi\\Downloads\\firstProject\\File_handling\\test.txt");
    try{
       if(file.createNewFile()){
           System.out.println("Created new file:" + file.getName());
       }
       else{
           System.out.println("file exist" + file.getName());
       }
    }
    catch(IOException e){
        System.out.println();
        e.printStackTrace();
    }
    }
}