public class Resc{
  final static String copyrightInfo="©2021 Brendan Berger";
  static class error{
    final static String[] E00={"No valid arguments were passed.","noValidCliEnter"};
    final static String[] E01={"OpenM was started without context.","nonContextualStart"};
    final static String[] E02={"Application resources might be corrupted.","rescCorrupted"};
    final static String[] Ezz={"An unknown error occurred.","unknownError"};
  }static class esChs{
    final static String clear="\033[0m";
    final static String bold="\033[1m";
    final static String faint="\033[2m";
    final static String italic="\033[3m";
    final static String underline="\033[4m";
    final static String slowBlink="\033[5m";
    final static String rapidBlink="\033[6m";
    final static String inverted="\033[7m";
    final static String hide="\033[8m";
    final static String defaultText="\033[9m";
    final static String blackText="\033[30m";
    final static String redText="\033[31m";
    final static String greenText="\033[32m";
    final static String yellowText="\033[33m";
    final static String blueText="\033[34m";
    final static String magentaText="\033[35m";
    final static String cyanText="\033[36m";
    final static String whiteext="\033[37m";
  }
  final static String asciiart=" ██████╗ ██████╗ ███████╗███╗   ██╗███╗   ███╗\n██╔═══██╗██╔══██╗██╔════╝████╗  ██║████╗ ████║\n██║   ██║██████╔╝█████╗  ██╔██╗ ██║██╔████╔██║\n██║   ██║██╔═══╝ ██╔══╝  ██║╚██╗██║██║╚██╔╝██║\n╚██████╔╝██║     ███████╗██║ ╚████║██║ ╚═╝ ██║\n ╚═════╝ ╚═╝     ╚══════╝╚═╝  ╚═══╝╚═╝     ╚═╝";
  final static String openmversion="0.0.0";
  final static String cliStartText="OpenM "+openmversion+"\nDeveloped by: Brendan Berger";
  final static String[][] commands={{"-h","Shows this help text."},{"--error","Throws an error."}};
  public static void printHelpText(){
    System.out.println(asciiart+"\n\n"+cliStartText+"\n\nCommands:\n");
    for(int a=0;a<=commands.length-1;a=a+1){
      System.out.print("\t"+commands[a][0]+"\t\t"+commands[a][1]+"\n");
    }
    System.out.println("\nErrors:\n");
    System.out.print("\t"+error.E00[1]+":\t\t"+error.E00[0]+"\n");
    System.out.print("\t"+error.E01[1]+":\t\t"+error.E01[0]+"\n");
    System.out.print("\t"+error.E02[1]+":\t\t"+error.E02[0]+"\n");
    System.out.print("\t"+error.Ezz[1]+":\t\t"+error.Ezz[0]+"\n");
    System.out.println("\n"+copyrightInfo+"\n");
  }
}