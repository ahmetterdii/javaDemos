package workingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//createFile();
		//getFileInfo();
		readFile();
		writeFile();
		readFile();
	}
	
	public static void createFile() {
		File file = new File("C:\\javademos\\files\\students.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("Dosya oluþturuldu.");
			}else {
				System.out.println("Dosya zaten mevcut.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Dosya bilgilerinin okunmasý
	public static void getFileInfo() {
		File file = new File("C:\\javademos\\files\\students.txt");
		if(file.exists()) {
			System.out.println("Dosya adý : " + file.getName());
			System.out.println("Dosya yolu : " + file.getAbsolutePath());
			System.out.println("Dosya yazýlabilir mi? : " + file.canWrite());
			System.out.println("Dosya okunabilir mi? : " + file.canRead());
			System.out.println("Dosya boyutu (byte) : " + file.length());
		}
	}
	
	//Dosyalarýn okunmasý
	public static void readFile() {
		File file = new File("C:\\javademos\\files\\students.txt");
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close(); //döngüden çýkýldýktan sonra kapatma iþlemi yapýlmalýdýr.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt",true));
			//true yazýlmasýnýn sebebi dosyanýn üzerine yazýlmasýný engellemektir.
			writer.newLine(); //Yeni satýr oluþtur.
			writer.write("Ahmet");
			System.out.println("Dosyaya yazýldý.");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
