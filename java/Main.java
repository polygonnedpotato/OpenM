public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    switch(args[0]){
      case"-h":
        System.out.println("-h passed");
        FileOps.GetFileContent()
        break;
    };
  }
}