package com.corejava.training.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {

public static void main(String[] args) {
        
        Employee emp = new Employee(101,"raj",50000);
        
        FileOutputStream fos = null;
        ObjectOutputStream oos= null;
        
        try {
            fos = new FileOutputStream("emp.ser");
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(emp);
            System.out.println("done");
            
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                oos.close();
                fos.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }            
        }    
    }
	
}
