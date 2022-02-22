package lessons11and12;

public class lessons11and12 {

	public static void main(String[] args) {
		
		
		
		int i = 0, j = 0;
		while(i <= 3) 
		{
			for(j = 0; j <=2; j++) 
			{
				System.out.print(i + "," + j + "    ");
			} 
			i++;
		}

		
		
		//while loop
		int v = 8;// integer holding a value
		while(v<=15){//that value has to be greater than or less than what ever other number u use
			System.out.println(v);// Any code that is inside of the curly brackets will run
			v++;// this adds one to the variable and also ends the loop
		}
		System.out.print("\n\n");
	//converting while loop to for
		int x;//holds integer
		for(x=10;x<=20;x++){//gives the integer a value; says it less than or greater ; adds one and ends loop
			System.out.println(x);// anything in the curly brackets executes
		}

	}
}

// 1. 5  is printed
// 2.7 is printed
//3.56 is printed
//4.won’t compile….j is undefined outside the loop.
//5.won’t compile since the scope of b is limited to inside the loop 
//6./101.01…d++ is not inside the loop. Notice, no braces.
/*7.
for (n = 3; n <= 24; n = n* 2)
{
	 System.out.println(n);
}
	 */
/*8.for (n = 24; n >= 3; n = n / 2)
{
	 System.out.println(n);
	} 
*/
//9. 5 is printed
//10.The control expression 
//11.  5, 10, 15, 20, 25, 30, 35, 40, 45, 50
//12.  16
//13.  Causing it to be an endless loop 
//14.  137 

// for-loop... contest type problems
//1-b
//2-c
//3-a
//4-e
//5-d
//6-a
//7-d

//LESSON12 NUMBER 3
/*3.	Implement the following for-loop as a while loop. 
	int m;
	for (m = 97; m <= 195; m++) 
	{
	        k = k * k + 3 * m; 
	        p = p + m +1;
	}
	int m = 97;
	while (m <= 195)
	{
		k = k * k + 3 * m;
		p = p + m + 1;
		m++;
	}
*/
/*4.

*          int v = 2;
*          while(m<+195) {
*          k=k*k+3*v;
*          q = Math.sqrt(q+v+1)
*          v*=3; }
*/
//5
//6
//7
//8
//9
//10


// lesson 12 contest 
//1.A and B
//2.infinte
//3.A
//4.A
//5. a
//6. E
