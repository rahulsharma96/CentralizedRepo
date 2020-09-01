import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Class {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\RAHUL\\Documents\\Dummy.txt");
	
		//To write something in a file 
		
	FileWriter fw = new FileWriter(f);
	fw.write("Welcome Mr.Rahul");
	fw.close(); //for saving & closing it
		
		
		
	//To read from a file 	
		//	FileReader fr = new FileReader(f);
	//	int a;
	//	while((a=fr.read())!=-1)
	//	{
	//		System.out.print((char)a);
		//}	
	}

}
