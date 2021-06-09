import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileOps {
  static String data;
  static String GetFileContent(String fle){
    try {
      File myObj = new File(fle);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        data += myReader.nextLine();
      };
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      data = "file-failed";
    }
    return data;
  }
}
