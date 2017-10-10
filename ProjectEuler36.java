public class ProjectEuler36 {
  public static void main(String[] args) {

    int arr[] = genPal(1000000);

    int i = 0;
    int sum = 0;

    while(arr[i]!=0){
      if(isPalindrome(Integer.toBinaryString(arr[i]))){
        sum += arr[i];
      }
      i++; 
    }

    System.out.println(sum);

  }

  public static int[] genPal(int limit){
    int arr[] = new int[limit];
    int index = 0;
    int value = 1;

    while(value<=limit){
      if(isPalindrome(String.valueOf(value))){
        arr[index] = value;
        index++;
      }
      value++;
    }

    return arr;

  }

  public static boolean isPalindrome(String s){
    if(s.length()==1) return true;

    else if(s.length()==2){
      if(s.charAt(0)==s.charAt(1)) return true;
      else return false;
    }

    else if(s.charAt(0)==s.charAt(s.length()-1)){
      return isPalindrome(s.substring(1,s.length()-1));
    }

    else {
      return false;
    }
  }
}
