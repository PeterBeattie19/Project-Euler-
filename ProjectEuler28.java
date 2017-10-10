public class ProjectEuler28 {
  public static void main(String[] args) {
    System.out.println(sum(500)); 
  }

  public static int sum(int n){
    if(n==0) return 1;

    else {
      return ((4*((2*n + 1)*(2*n + 1))) - 12*n) + sum(n-1);
    }
  }
}
