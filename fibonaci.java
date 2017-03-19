//print Fibonaci numbers
class fibonaci{
	static long fibonaci(int n){
		if (n==0||n==1) return 1;
		else return fibonaci(n-1) + fibonaci(n-2);
	}
	public static void main(String[] args){
		int sequence = 10;
		for (int i=1;i<=sequence;i++){
			System.out.printf(" %d",fibonaci(i));
		}
		System.out.println();
	}
}