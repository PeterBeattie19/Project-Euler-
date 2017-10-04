public class ProjectEuler34{
  public static void main(String[] args) {
    long sum = 0;
    long n = 3;

    while(n<2540161){
      if(isSum(n)){
        sum += n;
      }

        n = n + 1;
    }

    System.out.println(sum);
  }

  public static long factorial(int n){
    long arr[] = {1,1,2,6,24,120,720,5040,40320,362880}; //first 9 factorials
    return arr[n];
  }

  public static boolean isSum(long n){
  String s = String.valueOf(n);
  long sum = 0;

    for(int i = 0; i<s.length(); i++){
    sum += factorial((int)Long.parseLong(s.substring(i,i+1)));
    }


  if(sum==n) return true;

  else return false;


}

}
