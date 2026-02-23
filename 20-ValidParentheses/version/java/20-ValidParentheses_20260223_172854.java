// Last updated: 2/23/2026, 5:28:54 PM
/*
 * Simple Stack Problem.
 * If opening bracket --> push no problem
 * If closing bracket ---> Check peek for opening bracket.
 * Stack should be empty if valid parantheses.
*/

1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        for(char ch: s.toCharArray()){
5            switch(ch){
6                case '(' : 
7                    stack.push(ch);
8                    break;
9                case '[' : 
10                    stack.push(ch);
11                    break;
12                case '{':
13                    stack.push(ch);
14                    break;
15                case ')':
16                    if(!stack.isEmpty() && stack.peek()=='(') stack.pop();
17                    else return false;
18                    break;
19                case ']':
20                    if(!stack.isEmpty() && stack.peek()=='[') stack.pop();
21                    else return false;
22                    break;
23                case '}':
24                    if(!stack.isEmpty() && stack.peek()=='{') stack.pop();
25                    else return false;
26                    break;
27                default:
28                    return false;
29            }
30        }
31        return stack.isEmpty();
32    }
33}