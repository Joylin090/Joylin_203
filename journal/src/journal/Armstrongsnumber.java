package journal;

public class Armstrongsnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Joylin D'Cunha RollNo: 203

		        int number = 371, originalNumber, remainder, result = 0, n = 0;

		        originalNumber = number;

		        for (;originalNumber != 0; originalNumber /= 10, ++n);

		        originalNumber = number;

		        for (;originalNumber != 0; originalNumber /= 10)
		        {
		            remainder = originalNumber % 10;
		            result += Math.pow(remainder, n);
		        }

		        if(result == number)
		            System.out.println(number + " is an Armstrong number.");
		        else
		            System.out.println(number + " is not an Armstrong number.");

	}

}
