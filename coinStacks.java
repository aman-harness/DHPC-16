import java.io.*;
import java.util.StringTokenizer;


public class coinStacks {
	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			int m=Integer.parseInt(st.nextToken());
			int n=Integer.parseInt(st.nextToken());
			int s[][]=new int[m+1][n+1];
			for(int i=1;i<=m;i++)
			{
				st=new StringTokenizer(br.readLine());
				for(int j=0;j<=n;j++)
				{
					if(i==0)
						s[i][j]=0;
					else if(j==0)
						s[i][j]=0;
					else
					s[i][j]=Integer.parseInt(st.nextToken())+s[i-1][j];
					//System.out.print(s[i][j]+" ");
				}
				//System.out.println();
			}
			int dp[][]=new int[n+1][m+1];
			for(int i=1;i<dp.length;i++)
			{
				for(int j=0;j<dp[0].length;j++)
				{
					if(j==0)
						dp[i][j]=0;
					else
					for(int k=0;k<=j;k++)
					{
						dp[i][j]=Math.max(dp[i][j], dp[i-1][k]+s[j-k][i]);
					}
					//System.out.print(dp[i][j]+" ");
				}
				//System.out.println();
			}
			System.out.println(dp[n][m]);
		}
	}

}
