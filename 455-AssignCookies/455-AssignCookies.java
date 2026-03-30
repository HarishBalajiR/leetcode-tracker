// Last updated: 3/30/2026, 8:43:24 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int childcount = 0;
        int gptr = 0, sptr = 0;
        while(gptr < g.length && sptr < s.length){
            //Check if the child want the cookei or not
            if(s[sptr]>=g[gptr]){
                childcount++;
                gptr++;
            }
            sptr++;
        }
        return gptr;
    }
}