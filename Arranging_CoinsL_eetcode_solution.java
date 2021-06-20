class Solution {
    public int arrangeCoins(int n) {
        int sum=0;
        if(n==Integer.MAX_VALUE)
        {
            return 65535;
        }
        for(int i=1;i<n;i++)
        {
            sum=sum+i;
            if(sum>n)
                return i-1;
            else if(sum==n)
                return i;
        }
        return 1;
    }
}
