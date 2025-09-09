import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int seats[][]={
		    {0,0,0,0,0},
		    {0,0,0,0,0},
		    {0,0,0,0,0},
		    {0,0,0,0,0},
		    {0,0,0,0,0}};
		    
		System.out.println("Available Seats:");
		for(int i=0;i<5;i++)
		{
		    for(int j=0;j<5;j++)
    		{
    		    System.out.print(seats[i][j]+"\t");
    		}
    		System.out.println();
		}
		int r,c;
		System.out.println("How many seats do you want:");
		int no=sc.nextInt();
		for (int i=0;i<no;i++)
		{
    		System.out.println("Enter the row and column of seat "+(i+1)+" do you want:");
    		r=sc.nextInt();
    		c=sc.nextInt();
    		
    		int row=r-1;
    		int col=c-1;
    		
    		seats[row][col]=1;
		}
		System.out.println("Booked Seats:");
		for(int i=0;i<5;i++)
		{
		    for(int j=0;j<5;j++)
    		{
    		    System.out.print(seats[i][j]+"\t");
    		}
    		System.out.println();
		}
	}
}