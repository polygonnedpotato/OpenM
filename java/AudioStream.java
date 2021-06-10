import javax.sound.sampled.*;
import java.util.Scanner;
import java.util.ArrayList;
public class AudioStream{
  static String currentCodec;
  static String mediaProgress;
  static String mediaState;
  static File audioStreamData;
  static class OpenM{
    static File chan0samp;
    static File chan1samp;
    static File chan2samp;
    static File chan3samp;
    static File chan4samp;
    static File chan5samp;
    static File chan6samp;
    ArrayList<String> openmfiledata=new ArrayList<String>();
    public static void playSample(String Inst, String Scale, int chan){
      System.out.println(Resc.esChs.bold+Resc.esChs.greenText+"Playing Sample "+Inst+" with scale "+Scale+" in Channel "+chan+Resc.esChs.clear)
    }
    //public static void readCSVData(String csvFile){
      //try (Scanner scanner=new Scanner(Paths.get(csvFile).toFile())) {
        //String DELIMITER=",";
        //scanner.useDelimiter(DELIMITER);
        //int csvscanner=0;
        //while(scanner.hasNext()){
          //openmfiledata.add();
        //}

      //} catch (IOException ex) {
        //ex.printStackTrace();
      //}
    //}
  }
}