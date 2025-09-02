package numbersystem;

public class CountEvenDigit {
	
	static int evenDigit(int num) {
	
		int count=0;
		while(num>0) {
			int tem = num%10;
			if (tem%2==0) {
				count++;
			}
			num/=10;
		}
		
		
		return count;
		
	}
public static void main(String[] args) {
	int count = evenDigit(21548);
	System.out.println(count);
}
}
