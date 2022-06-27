package week1.day1;

public class Primenumber {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=13;
		int flag=1;
		if(input==0 ||input==1);{
			System.out.println("it is not a prime number");

		}


		for(int i= 5; i<=input; i++){
			if(input%1==0) {
				System.out.println("not a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("it is a prime number");

		}
	}
}
