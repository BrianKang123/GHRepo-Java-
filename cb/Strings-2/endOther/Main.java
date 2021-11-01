public class Main {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc")); // true
        System.out.println(endOther("AbC", "HiaBc")); // true
        System.out.println(endOther("abc", "abXabc")); // true
    }

public static boolean endOther(String a, String b) {
      a = a.toLowerCase();
      b = b.toLowerCase();

      if (a.length() > b.length()){
        return a.substring(a.length()-b.length()).equals(b);
      }
      else{
        return b.substring(b.length()-a.length()).equals(a);
      }
    }
}
