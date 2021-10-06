// Brian Kang
// APCS
// HW08 -- Refactor Freshie Zero
// 2021-09-30

public class Greet {
    public static void main(String[] args) {
        greet("Gordon Ramsay");
        greet("George Washington");
        greet("Abraham Lincoln");
    }
    
    public static void greet(String name) {
    	System.out.println("Why, hello there, " + name + ". How do you do?");
    }
}
