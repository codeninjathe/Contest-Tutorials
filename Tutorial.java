import java.util.*; //This has Scanner and ArrayList
import java.io.*; //Has the file input/output, 

public class Tutorial{
  public static void main(String[] args){
    Scanner sc = new Scanner(new File("filename.type")); //Scanner gets input from a source, and the File is the source, "filename.type" is the file name + type
    int loops = sc.nextInt(); //runs the number of times
    
    for(int w = 0; w < loops; w++){
      //do stuff  
    }
    
  }
}
