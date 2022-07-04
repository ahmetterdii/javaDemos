package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = null;
		int total = 0;
		//Dosyayý belleðe alan ve okunmasýný saðlayan class BufferedReader
		try {
			reader = new BufferedReader(new FileReader("C:\\javademos\\readingFileDemo\\src\\sayilar.txt"));
			String line = null;
			while((line = reader.readLine()) != null) {
				total += Integer.valueOf(line);
			}
			System.out.println("Toplam : " + total);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (Exception exception) {
				
			}
		}
	}

}
