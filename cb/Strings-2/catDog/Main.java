public class Main {
    public static void main(String[] args) {
        System.out.println(catDog("catdog")); // true
        System.out.println(catDog("catcat")); // false
        System.out.println(catDog("1cat1cadodog")); // true
    }

 public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i =0; i <= str.length()-3; i++){
          if (str.substring(i, i+3).equals("cat")){
            catCount ++;
          }
          if (str.substring(i, i+3).equals("dog")){
            dogCount ++;
          }
        }
        return catCount == dogCount;
    }
}
