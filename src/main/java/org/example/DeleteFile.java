package org.example;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {

    try
    {
        File f= new File("C:\\Users\\Admin\\IdeaProjects\\Learning\\test.txt");
        if(f.delete()) //returns Boolean value
        {
            System.out.println(f.getName() + " deleted"); //getting and printing the file name
        }

        else
        {
// System.out.println("failed");
            throw new Exception("file is allready deleted");
        }
    }
catch(Exception e)
    {
        System.out.println(e);
    }
    }
}
