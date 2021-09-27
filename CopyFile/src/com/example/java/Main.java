package com.example.java;
//author:Micheal honey Namitha Canuteraj
import java.io.*;

public class Main {

    public static void main(String[] args) {
    		
    		String inputFile="CopyFile/files/myFile.txt";
    		String outputFile="CopyFile/files/copiedFile.txt";
    		
    		try(
    				FileReader fileRead=new FileReader(inputFile);
    				BufferedReader bufferRead=new BufferedReader(fileRead);
    				FileWriter writeLine=new FileWriter(outputFile);
    				){
    			String line;
    			while((line=bufferRead.readLine())!=null){
    				writeLine.write(line+"\n");
    				System.out.println(line);
    				}
    			bufferRead.close();
    			writeLine.close();
    			System.out.println("Copied SuccessFully!");
    			
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    	}

}
