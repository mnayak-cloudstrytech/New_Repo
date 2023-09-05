
class GFG
{
  static int N = 100;
    static void pre_process(boolean dp[][], char[] s)
    {
        int n = s.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                dp[i][j] = false;
            }
        }
        for (int j = 1; j <= n; j++)
        {
            for (int i = 0; i <= n - j; i++)
            {
                if (j <= 2)
                {
                    if (s[i] == s[i + j - 1])
                    {
                        dp[i][i + j - 1] = true;
                    }
                }
                else if (s[i] == s[i + j - 1])
                {
                    dp[i][i + j - 1] = dp[i + 1][i + j - 2];
                }
            }
        }
    }
    static int countPairs(String s)
    {
        boolean dp[][] = new boolean[N][N];
        pre_process(dp, s.toCharArray());
        int n = s.length();
        int left[] = new int[n];
        int right[] = new int[n];
             left[0] = 1;
         for (int i = 1; i < n; i++)
        {
 
            for (int j = 0; j <= i; j++)
            {
 
                if (dp[j][i] == true)
                {
                    left[i]++;
                }
            }
        }
 
    
        right[n - 1] = 1;
 

        for (int i = n - 2; i >= 0; i--)
        {
 
            right[i] = right[i + 1];
 
            for (int j = n - 1; j >= i; j--)
            {
 
                if (dp[i][j] == true)
                {
                    right[i]++;
                }
            }
        }
 
        int ans = 0;
 
       
        for (int i = 0; i < n - 1; i++)
        {
            ans += left[i] * right[i + 1];
        }
 
        return ans;
    }
 
    
    public static void main(String[] args)
    {
        String s = "abacaba";
        System.out.println (countPairs(s)); 
        
    }
}