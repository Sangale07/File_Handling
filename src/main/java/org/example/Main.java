package org.example;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    Main.getfileInfo();
    }
    public static void getfileInfo(){
        File file =  new File("C:\\Users\\rushi\\Downloads\\firstProject\\File_handling\\test.txt");
        if(file.exists()){
            System.out.println("File name :" + file.getName());
            System.out.println("Readable :" + file.canRead());
            System.out.println("Writable :" + file.canWrite());
            System.out.println("Executable :" + file.canExecute());
            System.out.println("Absolute Path :" + file.getAbsolutePath());
            System.out.println("Path :" + file.getPath());
            System.out.println("length" + file.length());
        }
        else{
            System.out.println("File not Exist");
        }
    }

}