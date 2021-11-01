public class Main {
    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz")); // true
        System.out.println(xyzThere("abc.xyz")); // false
        System.out.println(xyzThere("xyz.abc")); // true
    }
  
public static boolean xyzThere(String str) {
      boolean result = false;
      for (int i = 0; i <= str.length()-3; i++){
        if (str.substring(i, i+3).equals("xyz")&& (i == 0 || !(str.substring(i-1,i).equals(".")))){
          result = true;
        }

      }
      return result;
    }
}
