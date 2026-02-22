// Last updated: 2/22/2026, 1:54:56 PM
void moveZeroes(int* nums, int numsSize) {
    int left = 0,temp = 0;
    for(int right = 0 ; right < numsSize ; right++)
    {
        if(nums[right]!=0)
        {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
        }
    }
}