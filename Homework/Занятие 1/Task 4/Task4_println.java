package lesson2;

public class Task4_println {
	public static void main(String[] args)
	{
		int a = 10;
		short bS = 12;
		long cL = 10000;
		double d = 9.00;
		float eF = 9.99F;
		char f = 'm';
		boolean g = true;
		
		int result1 = a + bS;
		double result2 = cL - d;
		double result3 = d * eF;
		System.out.println("result1: " +  result1);
		System.out.println("result2: " +  result2);
		System.out.println("result3: " + result3);
	
		if (cL > d)	
		{
		System.out.println("result4: long > double");
		}
		else
		{
		System.out.println("result4: long <= double");
		}
		
		if (eF < a)	
		{
		System.out.println("result5: float < int");
		}
		else
		{
		System.out.println("result5: float >= int");
		}	
		if (a == bS)	
		{
		System.out.println("result6: a и b равны ");
		}
		else
		{
		System.out.println("result6: a и b не равны");
		}		
	}
}

