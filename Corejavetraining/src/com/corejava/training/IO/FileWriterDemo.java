package com.corejava.training.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

public static void main(String[] args) {
        
        FileWriter fw = null;
        BufferedWriter bw = null;        
        try {            
            fw = new FileWriter("sample.txt",true);
            bw = new BufferedWriter(fw);            
            String data = "dfkd dkjdkf dfjdkfjdkf dkjfdkf";            
            bw.write(data);
            System.out.println("done");                
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bw.close();
                fw.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
