// Last updated: 2/22/2026, 1:54:15 PM
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashMap<Integer,Integer> countarr = new HashMap<>();
        ArrayList<Integer> values = new ArrayList<Integer>();
        for(int bulb: bulbs)
        {
            countarr.put(bulb,countarr.getOrDefault(bulb,0)+1);    
        }
        for(int key: countarr.keySet())
        {
            if(countarr.get(key)%2!=0) values.add(key);
        }
        Collections.sort(values);
        return values;
    }
}