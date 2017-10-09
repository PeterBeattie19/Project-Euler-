public class ProjectEuler10 {
  public static void main(String[] args) {

     System.out.println(primeSum(2000000));
  }

  public static long primeSum(int limit){
    long sum = 2;
    boolean isPrime = true;

    for(int i = 3; i<limit; i++){
      isPrime = true;
      for(int j = 2; j<=Math.sqrt(i); j++){
        if(i%j==0) {
          isPrime = false;
          j = i*2;
        }
      }

      if(isPrime==true) sum += i;
    }

    return sum; 
  }
}
