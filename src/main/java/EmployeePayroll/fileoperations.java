package EmployeePayroll;

import java.io.File;
import java.io.IOException;

public class fileoperations {

       public void checkFileExists(String filePath) {
           File file = new File(filePath);
           if (file.exists()) {
               System.out.println("File exists: " + file.getAbsolutePath());
           } else {
               System.out.println("File does not exist: " + file.getAbsolutePath());
           }
       }

       // Delete a file and check if it's deleted
       public void deleteFile(String filePath) {
           File file = new File(filePath);
           if (file.delete()) {
               System.out.println("File deleted successfully: " + filePath);
           } else {
               System.out.println("Failed to delete the file: " + filePath);
           }
       }

       // Create a directory
       public void createDirectory(String dirPath) {
           File dir = new File(dirPath);
           if (dir.mkdirs()) {
               System.out.println("Directory created: " + dirPath);
           } else {
               System.out.println("Directory already exists or failed to create: " + dirPath);
           }
       }

       // Create an empty file
       public void createEmptyFile(String filePath) {
           File file = new File(filePath);
           try {
               if (file.createNewFile()) {
                   System.out.println("Empty file created: " + filePath);
               } else {
                   System.out.println("File already exists: " + filePath);
               }
           } catch ( IOException e) {
               System.out.println("An error occurred while creating the file.");
               e.printStackTrace();
           }
       }

       // List files and directories
       public void listFilesAndDirectories(String dirPath) {
           File dir = new File(dirPath);
           if (dir.exists() && dir.isDirectory()) {
               String[] contents = dir.list();
               System.out.println("Contents of the directory: " + dirPath);
               for (String content : contents) {
                   System.out.println(content);
               }
           } else {
               System.out.println("The specified path is not a directory or does not exist.");
           }
       }

       // List files with a specific extension
       public void listFilesWithExtension(String dirPath, String extension) {
           File dir = new File(dirPath);
           if (dir.exists() && dir.isDirectory()) {
               File[] files = dir.listFiles((d, name) -> name.toLowerCase().endsWith(extension));
               System.out.println("Files with extension " + extension + " in directory: " + dirPath);
               for (File file : files) {
                   System.out.println(file.getName());
               }
           } else {
               System.out.println("The specified path is not a directory or does not exist.");
           }
       }

    public static void main(String[] args) {
        fileoperations fileOps = new fileoperations();
        String filePath = "test.txt";
        String dirPath = "testdir";

        fileOps.checkFileExists(filePath);
        fileOps.createDirectory(dirPath);
        fileOps.createEmptyFile(filePath);
        fileOps.listFilesAndDirectories(dirPath);
        fileOps.listFilesWithExtension(dirPath, ".txt");
        fileOps.deleteFile(filePath);
        fileOps.checkFileExists(filePath);
    }
   }

