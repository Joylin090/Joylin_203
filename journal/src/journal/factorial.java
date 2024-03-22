package journal;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Joylin D'Cunha RollNo: 203
				int num = 10;
		        long factorial = 1;
		        for(int i = 1; i <= num; ++i)
		        {
		            // factorial = factorial * i;
		            factorial *= i;
		        }
		        System.out.printf("Factorial of %d = %d", num, factorial);

	}

}
