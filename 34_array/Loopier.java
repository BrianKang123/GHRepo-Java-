// TNPG: All Brians: Brian Kang, Brian Wang, Ryan Lau
// APCS
// HW34 - A Pirate's Life for Me
// 2021-11-12
// Time Spent: 2 hrs


public class Loopier{
  public static int[] fillArray(int[] arr){
    for(int i = 0 ; i < arr.length ; i += 1){
      arr[i] = (int)(Math.random() * 100); 
    }
    return arr;
  }
 public static void main(String[] arghmemateys){
    int[] argh = new int[10]; 
    fillArray(argh);
    System.out.println(argh.toString());
 }
}

