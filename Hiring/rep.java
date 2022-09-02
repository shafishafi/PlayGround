import java.io.*;
import java.util.Scanner;
class rep {


static String censor(String text, String word) 
{ 

    String[] word_list = text.split("\\s+");
    String result = ""; 
    String stars = "";
    for (int i = 0; i < word.length(); i++)
        stars += '*';
    int index = 0;
    for (String i : word_list) 
    {
        if (i.compareTo(word) == 0)
            word_list[index] = stars;
        index++;
    }
    
    // join the words
    for (String i : word_list)
        result += i + ' ';

    return result;
}
    
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the File path");
		String filePath = scanner.next();
		StringBuffer buffer = new StringBuffer();

		
		File file = new File(filePath);

		Scanner scannerFile = null;

		try {
			
			scannerFile = new Scanner(file);

			while (scannerFile.hasNext())
			{
				
				buffer.append(scannerFile.nextLine()+System.lineSeparator());
				//System.out.println(scannerFile.next()+System.lineSeparator());
				String extract = buffer.toString();
				System.out.println("Enter SearchPharse: ");
                                String ser= scanner.nextLine();

    				System.out.println(censor(extract, ser));
    			}

				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

}
