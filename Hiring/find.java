import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class find {
   public static void main(String args[]) throws IOException {
      //Instantiating the File class
      //String filePath = "sam.txt";
      Scanner sca= new Scanner(System.in);
      System.out.print("Enter FilePath: ");  
      String filePath= sca.nextLine(); 
      //Instantiating the Scanner class to read the file
      Scanner sc = new Scanner(new File(filePath));
      //instantiating the StringBuffer class
      StringBuffer buffer = new StringBuffer();
      //Reading lines of the file and appending them to StringBuffer
      while (sc.hasNextLine()) {
         buffer.append(sc.nextLine()+System.lineSeparator());
      }
      String fileContents = buffer.toString();
      System.out.println("Contents of the file: "+fileContents);
      //closing the Scanner object
      sc.close();
      System.out.println("Enter SearchPharse: ");
        String ser= sc.nextLine(); 
      String oldLine = ser;
      String newLine = "####";
      //Replacing the old line with new line
      fileContents = fileContents.replaceAll(oldLine, newLine);
      //instantiating the FileWriter class
      FileWriter writer = new FileWriter(filePath);
      System.out.println("");
      System.out.println("new data: "+fileContents);
      writer.append(fileContents);
      writer.flush();
   }
}
