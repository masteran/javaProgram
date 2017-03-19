class multiplication{
	public static void main(String[] args){
		int i =2;
		do{
			System.out.println("multiplication of " + i);
			int number = i;
			for(int j=1;j<=10;j++){
			//System.out.println("3 * " + i + " = " + number*i);
				System.out.printf("%d * %d = %d \n", number, j, number*j);
			}
			i++;
		} while (i<=8);
	}
}