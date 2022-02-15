public int factorial(int n) {
  if(n > 0){
    return n * factorial(n - 1);
  }
  return 1;

}

public static void main(String[] args) {
    System.out.print(factorial(1) + " → \"1");
    System.out.print(factorial(2) + " → \"2");
    System.out.print(factorial(3) + " → \"6");

  }
}

//Not tree recursion
//Only one line of calls and returns
//A straight list of calls and return values of values multed to each other
