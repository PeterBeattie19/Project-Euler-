import java.math.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProjectEuler13 {
  public static void main(String[] args) {

    BigInteger sum = new BigInteger("0");


    		BufferedReader br = null;
    		FileReader fr = null;
        String sCurrentLine = null;
        String s = "";

    		try {

    			//br = new BufferedReader(new FileReader(FILENAME));
    			fr = new FileReader("input.txt");
    			br = new BufferedReader(fr);



           while((sCurrentLine = br.readLine())!=null){
             s = s + sCurrentLine;
           }

        }

        catch (IOException e){
          System.out.print(e);
        }



    for(int i = 0; i<s.length(); i+=50){

      BigInteger temp = new BigInteger(s.substring(i,i+50));
      sum = sum.add(temp);
    }

    System.out.println(sum.toString());
    System.out.println(count);
  }
}
