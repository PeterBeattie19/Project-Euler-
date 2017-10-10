public class ProjectEuler21 {
  public static void main(String[] args) {

    int sum = 0;

    for(int i = 1; i<=10000; i++){
      int a = i;
      int da = d(a);
      int b = da;
      int db = d(b);

      if(db==a) {
        if(b<10000 && a!=b){
          System.out.println(a+" " +b);
          sum += (b+a);
        }
      }
    }

    System.out.println(sum/2);
  }

    public static int d(int n){
      int sum = 0;


      for(int i = 1; i<=n/2; i++){
        if(n%i==0) sum += i;
      }


      return sum;
    }

}
