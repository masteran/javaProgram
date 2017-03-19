class factorial{
	//using loop
	public static void mainLoop(String [] args){
		int number =5;
		int factorial=1;
		for (int i=1; i<=number;i++){
			factorial=factorial*i;
		}
		System.out.println("Fatorial of " + number + " is " + factorial);
	}

	// using Recursion
	static int fact(int n){
		if (n==0||n==1) return 1;
		else return n*(fact(n-1));
	}
	public static void main(String [] args){
		int f = 1;
		int number = 10;
		f = fact(number);
		System.out.println("Fatorial of " + number + " is " + f);
	}
}