import java.io.*;


public class first {
	public static void main(String args[]) {
		//System.out.println("ƒIƒ€ƒ‰ƒCƒX");

		// read omu-rice from file
		try{
		      File file = new File("recipe-data.txt");
		      FileReader filereader = new FileReader(file);

		      int ch;
		      while((ch = filereader.read()) != -1){
		        System.out.print((char)ch);
		      }

		      filereader.close();
		    }catch(FileNotFoundException e){
		      System.out.println(e);
		    }catch(IOException e){
		      System.out.println(e);
		    }
		  }
}

