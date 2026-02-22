// Last updated: 2/22/2026, 1:54:22 PM
int countPairs(int* nums, int numsSize, int target) {
    int count = 0;
    for(int slow = 0 ; slow<numsSize ; slow++)
    {
        for(int fast = slow+1 ; fast<numsSize ; fast++)
        {
            if(nums[slow] + nums[fast] < target) count++;
        }
    }
    return count;
}