// Last updated: 3/9/2026, 11:33:35 AM
/*
 * Interesting Math Problem.
 * Basically, the process can be understood by using 
 * Example: 1
 * 4 _ x -> Required Number, _ -> distance == 2*t
 * 4 needs to take t steps and x takes t steps so they meet and we can find the maximum achievable number.
 * 4 + 2 * 1 = 6
 * if 4 takes t (1) step and 6 takes t(1) step we get 5 on both sides so they meet. and the maximum number is 6.
*/

class Solution {
public:
    int theMaximumAchievableX(int num, int t) {
        return num+2*t;
    }
};