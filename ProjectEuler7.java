public class ProjectEuler7{
  public static void main(String[] args) {
    int count = 0;
    int i = 1;

    while(count<=10001){
      if(isPrime(i)) count++;

      i++;
    }

    System.out.println(i-1);
  }

  public static boolean isPrime(long n){

    if(n==1 || n==2) return true; 

    for(long i = 2; i<=(long)Math.sqrt(n); i++){
      if(n%i==0){
         return false;
       }
    }

    return true;
  }
}
