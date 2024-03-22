package journal;

	public class countofDigits {
		//Joylin D'Cunha RollNo: 203


	    public static int countDigits(int num) {
	        int count = 0;
	        
	        // Convert negative number to positive for counting digits
	        if (num < 0) {
	            num = Math.abs(num);
	        }
	        
	        // Count digits
	        while (num != 0) {
	            num /= 10;
	            ++count;
	        }
	        
	        return count;
	    }
	}

