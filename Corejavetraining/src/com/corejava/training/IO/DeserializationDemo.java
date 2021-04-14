package com.corejava.training.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
        ObjectInputStream ois= null;
        
        try {
            fis = new FileInputStream("emp.ser");
            ois = new ObjectInputStream(fis);
            
            Object obj = ois.readObject();            
            Employee emp = (Employee) obj;
            
            System.out.println("Employee Details");
            System.out.println(emp.getEmpno()+" "+emp.getName()+" "+emp.getSalary());
            
            
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                ois.close();
                fis.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }            
        } 

	}

}
