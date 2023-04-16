package inleveropdrachten;


public class Calculator { 

		
		
		
		
		/*
		 * Werk de onderstaande methodes uit.
		 * 
		 * Gebruik enkel de optelling als expressie.
		 * 
		 * Maak gebruik van de nodige control flow structures om de bewerking te vervolledigen
		 * 
		 * Maak gebruik van gehele getallen.
		 */
		
		public static int add(int number1, int number2) {
			

			return (number1 + number2);
			
		}

		public static int subtract(int number1, int number2) {
			
			
			return (number1 - number2);
		}


		public static int multiply(int number1, int number2)   
		{  

		if (number2 == 0)  
		 
		return 0;  

		if (number2 > 0)  

		return (number1 + multiply(number1, number2 - 1));  
		 
		if (number2 < 0)  
		return -multiply(number1, -number2);  
		return -1;  		
		}
	{  
	     }  

		    public static int devide(int number1, int number2)
		    {
		        if (number1 == 0)
		            return 0;
		        if (number2 == 0)
		            return Integer.MAX_VALUE;
		         
		        boolean Result = false;

		        if (number1 < 0)
		        {
		            number1 = -number1 ;
		            if (number2 < 0)
		                number2 = - number2 ;
		            else
		                Result = true;
		        }
		        else if (number2 < 0)
		        {
		            number2 = - number2 ;
		            Result = true;
		        }

		        int quotient = 0;
		        while (number1 >= number2)
		        {
		            number1 = number1 - number2 ;
		            quotient++ ;
		        }

		        if (Result)
		                quotient = - quotient ;
		        return quotient ; }
		    
			
		
					
		/*
		 * Methode hieronder is voor een tweede machtsverheffing
		 */
		
		public static int square(int number1) {
			return 0;		
		}

		/*
		 * Methode hieronder is voor de verheffing van het grondgetal 'number1' tot een willekeurige macht, het exponent 'number2'
		 */
		
		public static int exponentiation(int number1, int number2) {
			// HINT: multiply???
			return 0; }
		
 

		
		public static void main(String[] args) {
			
			System.out.println("De optelling is: " + add(20, 50));
			System.out.println("De aftelling is " + subtract(100, 20));
			System.out.println("De vermedevuldiging is: " + multiply(10, 9)); 
	        System.out.println("De deling is: " + devide(12, 2));
	       
		}
		


	
	

		
	}

	
	

