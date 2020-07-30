
public class BreakandContinue {

	public static void main(String[] args) {
		
		

				System.out.println("----using break----");
				for(int i=0; i<10; i++) {
					
					if(i==5)
						break; // break the execution of inner loop
						//continue; // skip further code and continue with next iteration
					System.out.println(i);
				
				}
				
				System.out.println("----using continue----");
				
				for(int i=0; i<10; i++) {			
					if(i==5)
						
						continue; // skip further code and continue with next iteration
					System.out.println(i);
				}
			}

		


	}


