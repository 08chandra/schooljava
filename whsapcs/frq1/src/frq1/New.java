package frq1;

public class New {
	import javax.swing.*;
	public static void main(String[] args)
	{
	  int totA, totB;
	  int[] a = new int[7];
	  int[] b = new int[7];
	  getData(a, b);
	  totA = getTotal(a);
	  totB = getTotal(b);
	  System.out.println(totA + " " + totB);
	  dispLrg(a, b);
	}
	public static void getData(int[] a, int[] b)
	{
	  String input;	
	  int i;
	  for (i = 0; i < a.length; i++)
	  {
		 input = JOptionPane.showInputDialog("enter first array’s number");
	    a[i]= Integer.parseInt(input);
	    input = JOptionPane.showInputDialog("enter second array’s number");
	    b[i]= Integer.parseInt(input);
	  } 
	}
	public static int getTotal(int[] array)
	{
	  int temp = 0;
	  for (int i = array.length - 1; i >= 0; i--)
	  {
	    temp += array[i];
	  }
	  return temp;
	}
	public static void dispLrg(int[] a, int[] b)
	{
	  for (int i = 0; i < a.length; i++)
	  {
	    if (a[i] > b[i]) 
	        System.out.println(a[i]);
	    else 
	        System.out.println(b[i]);
	  }
	}

}
