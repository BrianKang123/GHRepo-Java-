public int bunnyEars2(int bunnies) {
  if(bunnies > 0){
    if(bunnies % 2 == 0){
      return 3 + bunnyEars2(bunnies-1);
    }

    else{
      return 2 + bunnyEars2(bunnies-1);
    }
  }
  else{
   return 0;
  }
}

  public static void main(String[] args) {
    System.out.print(bunnyEars2(0) + " → \"0");
    System.out.print(bunnyEars2(1) + " → \"2");
    System.out.print(bunnyEars2(2) + " → \"5");

  }
}

//Not tree recursion
//Only one line of calls and returns
//A straight list of calls and return values of bunnies and ears
