public class Main {
  public static void main(String[] args) {
    System.out.println(Resc.cliStartText);
    try{
      switch(args[0]){
        case"-h":
          try{Resc.printHelpText();}catch(Exception e){ErrorHan.throwError("02","Resc",e.toString());}
          break;
        case"--error":
          ErrorHan.throwError(args[1],"User","Thrown by user");
          break;
        default:
          ErrorHan.throwError("00","Main",null);
      };
    }
    catch(Exception e){
      ErrorHan.throwError("00","Main",e.toString());
    }
  }
}