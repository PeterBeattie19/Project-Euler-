public class ProjectEuler12 {
  public static void main(String[] args) {

    int n = 3;
    int arr[] = new int[1000000];
    boolean check = false;

    while(check==false){
            //System.out.println(n);
      int value = sigma(n,arr);


      if(countFactor(value)>=500) {
        System.out.println(value);
        check = true;
      }

      else {
        n++;
      }
    }
  }


  public static int sigma(int n, int arr[]){
    if(arr[n]>0){

      return arr[n];
    }

    else {
      if(n==1) return 1;

    else  arr[n] = n + sigma(n-1, arr);
    }

    return arr[n];

  }

  public static int countFactor(int n){
    int count = 0;
    int root = (int)Math.sqrt(n);

    for(int i = 1; i<=root; i++){
      if(n%i==0) count += 2; //We add two because if there is a number below the root that is a factor then there is a number above the root that is a factor 
    }

    if((root*root) == n){
      count--;
    }

    return count;
  }
}
