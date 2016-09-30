package terning;

//Niklas Thielemann var her d. 30. September kl. 12.34

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
//		float d1=(float)Math.random();     // 0-1
//		float d2=d1*5;                     // 0-5
//		int d3=Math.round(d2);             // 0-5 integer
//		return d3 + 1;                     // 1-6
		return (int)(Math.random()*6) +1;  // dette er indsat
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) { 
		for (int i=0; i<n; i++) { //i er rettet til 0
			System.out.print(roll() + " ");
		}		
	}
}
