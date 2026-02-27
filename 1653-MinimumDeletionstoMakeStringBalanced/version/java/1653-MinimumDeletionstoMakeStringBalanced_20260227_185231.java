// Last updated: 2/27/2026, 6:52:31 PM
/*
 * Stack Basic Problem.
 * Push char from the end of the string
 * If 'b' then check peek -> if 'a' -> pop and count else push b
 * else push ch
 * return count
*/

1class Solution {
2    public int minimumDeletions(String s) {
3        Stack<Character> stack = new Stack<>();
4        int count = 0;
5        char[] arr = s.toCharArray();
6        for(int i = arr.length - 1 ; i >=0 ; i--){
7            if(arr[i]=='b'){
8                if(!stack.isEmpty() && stack.peek()=='a'){
9                    stack.pop();
10                    count++;
11                }
12                else stack.push(arr[i]);
13            }
14            else stack.push(arr[i]);
15        }
16        return count;
17    }
18}