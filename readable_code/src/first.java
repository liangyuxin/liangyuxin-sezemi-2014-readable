import java.io.*;


public class first {
	public static void main(String args[]) {
		//System.out.println("オムライス");

		// レシピデータのファイルを読み込み、文字を1文字ずつintで読み込む
		
		try{
		      File recipeFile = new File("recipe-data.txt");
		      FileReader recipeObject = new FileReader(recipeFile);

		      int character;
		      while((character = recipeObject.read()) != -1){
		        System.out.print((char)character);
		      }

		      recipeObject.close();
		    }catch(FileNotFoundException e){
		      System.out.println("FileNotFoundException");
		    }catch(IOException e){
		      System.out.println("IOException");
		    }
		  }
}

