// Last updated: 3/17/2026, 5:30:55 AM
class Solution {
public:
    vector<int> stableMountains(vector<int>& height, int threshold) {
        vector<int> result;
        int n = height.size();
        for(int index = 1 ; index < n ; index++){
            if(height[index-1]>threshold) result.push_back(index);
        }
        return result;
    }
};