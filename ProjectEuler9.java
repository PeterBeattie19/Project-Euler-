public class ProjectEuler9 {
  public static void main(String[] args) {

    long start = System.currentTimeMillis();
    for(int i = 1; i<1000; i++){ //List of a
      for(int j = 1; j<1000-i; j++){ //list of b
        int c = genC(i,j);

        if(isPythag(i,j,c)) {
          if((i+j+c)==1000) {
            System.out.println(i*j*c);
            i = 1000;
            j = 1000; //We have found the answer so stop looping
          }
        }
      }
    }
    long end = System.currentTimeMillis();

    System.out.println(end-start); 
  }

  public static boolean isPythag(int a , int b, int c){
    if(sqr(c)==(sqr(a)+sqr(b))){
      return true;
    }

    return false;
  }

  public static int sqr(int a){
    return a*a;
  }

  public static int genC(int a, int b){
    return (int)Math.sqrt((sqr(a)+sqr(b)));
  }
}
