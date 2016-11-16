
public class BinaryStringsTests {
	public static void main(String[] args) {
		int t=10;				//Total test cases
		System.out.println(t);
		int maxN=10;			//Number of Strings in each test case
		int maxZ=100;			//Total no of zeros required
		int maxO=100;			//Total no of ones required
		int maxSl=10;			//Max String length
		while(t-->0)
		{
			int n=1+(int)(Math.random()*maxN);
			int z=1+(int)(Math.random()*maxZ);
			int o=1+(int)(Math.random()*maxO);
			System.out.println(n);
			System.out.println(z+" "+o);
			String s="";
			for(int i=0;i<n;i++)
			{
				int sL=maxSl;
				s="";
				for(int j=0;j<sL;j++)
				s+=Integer.toString((int)(Math.random()*2));
				System.out.println(s);
			}
			
		}
	}

}
