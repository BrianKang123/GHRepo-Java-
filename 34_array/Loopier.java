// TNPG: All Brians: Brian Kang, Brian Wang, Ryan Lau
// APCS
// HW34 - A Pirate's Life for Me
// 2021-11-12
// Time Spent: 2 hrs


public class Loopier{
	public static int[] fillArray(int[] arr){
		for(int i = 0 ; i < arr.length ; i += 1){
			arr[i] = (int)(Math.random() *100); 
		}
		return arr;
	}

	public static String toString(int[] arr) {
		String res = "[";
		for (int element: arr) {
			res = res + element + ", ";
		}
		res = res.substring(0, res.length() - 2);
		res += "]";

		return res;
	}
	
	public static int linSearchI(int[] arr, int target){
		for(int i = 0 ; i < arr.length ; i+=1){
			if(arr[i] == target){
				return i;
			}
		}
		return -1;
	}
	// public static int linSearchR(int[] arr, int target){
		
	
	// }
	public static void main(String[] arghmemateys){
		int[] argh = new int[10]; 
		fillArray(argh);
		System.out.println(toString(argh));
		System.out.println(linSearchI(argh, 69));
	}
}

