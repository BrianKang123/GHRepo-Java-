public class Main {
    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho")); // 1
        System.out.println(countHi("ABChi hi")); // 2
        System.out.println(countHi("hihi")); // 2

  public static int countHi(String str) {
        int counter = 0;
        for (int i = 0; i <= str.length()-2; i++){
          //System.out.println(str.substring(i, i+2));
          if (str.substring(i, i+2).equals("hi")){
            //System.out.println("match");
            counter += 1;
          }
        }
        return counter;
    }
}
