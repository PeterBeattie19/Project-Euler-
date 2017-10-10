import java.util.*;
import java.math.*; 

public class ProjectEuler29 {
  public static void main(String[] args) {

    Set<BigInteger> set = new HashSet<BigInteger>();

    for(int a = 2; a<=100; a++){
      for(int b = 2; b<=100; b++){
        BigInteger temp = new BigInteger(String.valueOf(a));
        set.add(temp.pow(b));
      }
    }

    System.out.println(set.size());
  }

}
