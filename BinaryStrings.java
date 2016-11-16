import java.io.*;
import java.util.StringTokenizer;


public class BinaryStrings {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n=Integer.parseInt(br.readLine());
			int z[]=new int[n],o[]=new int[n];
			StringTokenizer st=new StringTokenizer(br.readLine());
			int x0=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			for(int i=0;i<z.length;i++)
			{
				String s=br.readLine();
				for(int j=0;j<s.length();j++)
				{
					if(s.charAt(j)=='0')
						z[i]++;
					else
						o[i]++;
				}
			}
			int dp[][][]=new int[n+1][x0+1][y1+1];
			for(int i=0;i<dp.length;i++)
			{
				for(int j=0;j<dp[0].length;j++)
				{
					for(int k=0;k<dp[0][0].length;k++)
					{
						if(i==0)
							{
							dp[i][j][k]=0;
							continue;
							}
						if(j>=z[i-1]&&k>=o[i-1])
							dp[i][j][k]=Math.max(dp[i-1][j][k],
									1+dp[i-1][j-z[i-1]][k-o[i-1]]);
						else
							dp[i][j][k]=dp[i-1][j][k];
						
					}
				}
			}
			System.out.println(dp[n][x0][y1]);
		}
	}

}
