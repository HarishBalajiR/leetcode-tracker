// Last updated: 2/22/2026, 1:54:23 PM
class Solution {
    public int captureForts(int[] forts) {
        int left = 0,count = 0;
        for(int right = 0 ; right < forts.length ; right++)
        {
            if(forts[right]!=0)
            {
                if((forts[left]==1 && forts[right]==-1) || (forts[left]==-1 && forts[right]==1))
                {
                    count = Math.max(count,right-left-1);
                }
                left = right;
            }
        }
        return count;
    }
}