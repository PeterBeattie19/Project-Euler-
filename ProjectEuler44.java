import java.util.Arrays;
public class ProjectEuler44 {
  public static void main(String[] args) {
    int value = 10000;
    long arr[] = new long[value+1];

     arr[1] = 1;

     long answer = 0;

     for(int i = 2; i<=value; i++){
       arr[i] = pent(i);
     }

     for(int i = 1; i<=value; i++){

       for(int j = i+1; j<=value; j++){

             long difference = (long)Math.abs(arr[i] - arr[j]);
             long sum = arr[i] + arr[j];

             if((Arrays.binarySearch(arr, 0, value, difference)>=0) && (Arrays.binarySearch(arr, 0, value, sum)>=0)){
               System.out.println("Found it ");
               answer = difference;
               i = 1000001;
               j = 1000001;
             }
       }
     }





     System.out.println(answer);
}

  public static long pent(int n){
    return ((n*(3*n - 1))/2);
  }
}
