package com.corejava.training.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		FileReader fr = null;
        BufferedReader br = null;        
        try {            
            fr = new FileReader("sample.txt");
            br = new BufferedReader(fr);
            
            String str = null;
            
            while((str=br.readLine()) !=null) {
                System.out.println(str);
                
                // store this data into database or collection
                
            }
                        
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
                fr.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }

	}

}
