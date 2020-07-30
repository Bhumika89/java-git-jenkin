
public class EnhancedForLoopDemo {
	public static void main(String[] args) {
		String [] names = {"Anshuman", "Jagriti", "Amit"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//enhanced for loop - array and collections
		System.out.println("--using enhanced for loop---------");
		for(String n : names) {
			System.out.println(n);
		}
	}

}

