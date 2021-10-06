// TNPG: Orion(Brian Kang and Ryan Lau)
// APCS
// HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
// 2021-10-05

/* 
DISCOVERIES

UNRESOLVED QUESTIONS
1. Why does the prepoerty helloMsg need to be static in BigSib.java?
2. If a property doesn't have a public or private signature, then what signature does it have?

*/

public class BigSib {
    static String helloMsg;

	public static String greet(String name) {
		return helloMsg + " " + name;
	}

    public static void setHelloMsg(String newHelloMsg) {
        helloMsg = newHelloMsg;
    }
}
