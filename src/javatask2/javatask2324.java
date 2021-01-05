package javatask2;

public class javatask2324 {

	public static void main(String[] args) {
		int x = (int)(Math.random()*13);
        int y = (int)(Math.random()*4);
        String[] X = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] Y = {"Clubs","Diamonds","Hearts","Spades"};
        System.out.println("The card you picked is "+X[x]+" of "+Y[y]);
	}

}
