public class ErrorHan {
  static String[] ten;
  static String hidden;
  public static void throwError(String errC, String src, String ain) {
    switch(errC){
      case"00":
        ten=Resc.error.E00;
        break;
      case"01":
        ten=Resc.error.E01;
        break;
      case"02":
        ten=Resc.error.E02;
        break;
      default:
        ten=Resc.error.Ezz;
    };
    if(ain==null){hidden="";}else{hidden=" Other information: "+ain;}
    System.out.println(Resc.esChs.redText+Resc.esChs.bold+"[ERROR]["+errC+"("+ten[1]+")] "+ten[0]+Resc.esChs.rapidBlink+Resc.esChs.faint+" Source:"+src+hidden+Resc.esChs.clear);
  }
}