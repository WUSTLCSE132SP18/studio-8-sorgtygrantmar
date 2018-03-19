package studio8;

// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountSteps {
	
	public static void main(String[] args) {
		
		String countSteps = "H:\\Desktop\\accvalues.csv";
		BufferedReader br = null;
		String line = "";
		String splitBy = ",";
		
		try {
			br = new BufferedReader (new FileReader(countSteps));
			while((line = br.readLine()) != null) {
				String[] values = line.split(splitBy);
				
				System.out.println( values[0] + " " + values[1] + " " + values[2]);
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 	
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}