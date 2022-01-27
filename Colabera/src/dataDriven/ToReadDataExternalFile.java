package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ToReadDataExternalFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testResources/Demo.txt");
		 int c = fis.read();
		 while(c!=-1)
		 {System.out.println((char)c);
		 c=fis.read();
		 }

	}

}
