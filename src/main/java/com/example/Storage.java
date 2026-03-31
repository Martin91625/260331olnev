package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
    
    public static ArrayList<NameDict> readContent() {
        try {
            return tryReadContent();
        } catch (FileNotFoundException event) {
            System.err.println(event.getMessage());
            return null;
        }
        
    }
    private static ArrayList<NameDict> tryReadContent() throws FileNotFoundException {
        ArrayList<NameDict> nameDictList = new ArrayList<>();
        String fileName = Prop.getFileName();
        File file = new File(fileName);
        try(Scanner sc = new Scanner(file, "utf8")) {
            sc.nextLine();
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
        return nameDictList;
    }
}
