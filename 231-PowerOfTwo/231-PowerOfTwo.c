// Last updated: 2/22/2026, 1:54:57 PM
bool isPowerOfTwo(int n) {
    if(n<=0) return 0;
    if((n&(n-1))==0) return true;
    else return false;
}