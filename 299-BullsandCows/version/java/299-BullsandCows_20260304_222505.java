// Last updated: 3/4/2026, 10:25:05 PM
/*
 * HOPE Webinar Problem.
 * HashMap Basics.
 * Track common count -> Common digits but not in the right position
 * Track bulls -> Common digits in the right position
 * Cows -> Common - Bulls.
*/

1class Solution {
2    public String getHint(String secret, String guess) {
3        HashMap<Character,Integer> secretmap = new HashMap<>();
4        HashMap<Character,Integer> guessmap = new HashMap<>();
5        char[] secretarr = secret.toCharArray();
6        char[] guessarr = guess.toCharArray();
7        for(char ch : secretarr) secretmap.put(ch, secretmap.getOrDefault(ch,0)+1);
8        for(char ch : guessarr) guessmap.put(ch, guessmap.getOrDefault(ch,0)+1);
9
10        int bulls = 0;
11        int common = 0;
12        for(int i = 0 ; i < secret.length() ; i++){
13            if(secretarr[i]==guessarr[i]) bulls++;
14        }
15        for(char ch : secretmap.keySet()){
16            if(guessmap.containsKey(ch)) common+=Math.min(secretmap.get(ch),guessmap.get(ch));
17        }
18        System.out.println(common - bulls);
19        return ""+bulls+"A"+(common-bulls)+"B";
20    }
21}