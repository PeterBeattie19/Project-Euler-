public class ProjectEuler37{
  public static void main(String[] args) {
    int arr[] = new int[739399];

    long n = 10;
    long sum = 0;

  //  System.out.println(rightToLeft(3797,arr));
  long start = System.currentTimeMillis();
    while(n<739398){
      if(leftToRight(n,arr) && rightToLeft(n,arr)){
        //  System.out.println(n);
          sum += n;
        }
      //System.out.println(n);
      n++;
    }

    long end = System.currentTimeMillis();
    System.out.println(sum);
    System.out.print("That took " +(end-start));

  }

  public static boolean leftToRight(long n, int arr[]){
    String s = String.valueOf(n);

    for(int i = 0; i<s.length(); i++){
    //  System.out.print(s.substring(i,s.length()) +" ");
      if(!(isPrime(Long.parseLong(s.substring(i,s.length())),arr))) {
      //  System.out.print(s.substring(i,s.length()) +" ");
      return false;

      }
    }

    //System.out.println();
    return true;


  }

  public static boolean rightToLeft(long n, int arr[]){
    String s = String.valueOf(n);

    for(int i = s.length(); i>0; i--){

    //  System.out.print(s.substring(0,i) +" ");

      if(!(isPrime(Long.parseLong(s.substring(0,i)), arr))){
        return false;
      }
    }


    return true;
  }

  public static boolean isPrime(long n, int arr[]){

    if(n==1) return false;

  /*  if(arr[(int)n]==2){
      //System.out.println("I am working");
       return true;
     }

    else if(arr[(int)n]==1) {
    //  System.out.println("I am working");
      return false;
    } */

    else {

    for(long i = 2; i<=(long)Math.sqrt(n); i++){
      if(n%i==0){
      //  arr[(int)n] = 1;
         return false;
       }
    }
  //  arr[(int)n] = 2;
    return true;
  }
 }
}
