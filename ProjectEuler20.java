import java.math.*;

public class ProjectEuler20 {
  public static void main(String[] args) {

    BigInteger fact = new BigInteger("1");

    for(int i = 1; i<=100; i++){
      BigInteger temp = new BigInteger(String.valueOf(i));

      fact = fact.multiply(temp);
    }

    String s = fact.toString();
    int sum = 0;

    for(int i = 0; i<s.length(); i++){
      sum += Integer.parseInt(s.substring(i,i+1));
    }

    System.out.println(sum);
    }


}
