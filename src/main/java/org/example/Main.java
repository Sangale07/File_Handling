package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//    Main.getfileInfo();
        Main.writeFile();
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
    public static void writeFile(){
        File file =  new File("C:\\Users\\rushi\\Downloads\\firstProject\\File_handling\\test.txt");
        try{
            FileWriter fr = new FileWriter(file);
            String content = "Hii My Name is Rushikesh Sangale , I recently graduated from NMIET College in Computer Engineering";
            fr.write(content);
            fr.close();

        }
        catch(IOException e){
           e.printStackTrace();
        }
    }

}