
public class coinStacksTest {
	public static void main(String[] args) {
		int t=10;								// Total test cases
		int maxM=100;							// Max number of stacks
		int maxN=100;							// Max number of coins that can be taken
		int coins[]={1,2,5,10,20,100,500,2000};	// domain of coin values
		System.out.println(t);
		while(t-->0)
		{
			int n=1+(int)(Math.random()*maxM);
			int m=1+(int)(Math.random()*maxN);
			System.out.println(m+" "+n);
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
					System.out.print(coins[(int)(Math.random()*coins.length)]+" ");
				System.out.println();
			}
		}
	}

}
