public class Amstrong {
  public  static void main(String[] args) {
      int n = 153;
      System.out.println(isAmstrong(n));

    }
    static boolean isAmstrong(int n) {
      int orginal = n;
      int sum =0;
      while(n>0){
          int rem = n%10;
          n =n/10;
          sum = sum + rem*rem*rem;
      }
      if(sum == orginal){
          return true;
      }else {
          return false;
      }

    }
}
