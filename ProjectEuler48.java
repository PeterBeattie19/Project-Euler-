import java.math.*; 
public class ProjectEuler48 {
  public static void main(String[] args) {
    BigInteger sum = new BigInteger("1");
    int exponent = 2;
    BigInteger current = new BigInteger("2");

    while(exponent<=1000){
      current = current.pow(exponent);
      sum = sum.add(current);
      exponent++;
      current = new BigInteger(String.valueOf(exponent));
    }

    System.out.println(sum.toString());
  }
}
