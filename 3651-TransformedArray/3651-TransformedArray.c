// Last updated: 2/22/2026, 1:54:19 PM
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* constructTransformedArray(int* nums, int numsSize, int* returnSize) {
    *returnSize = numsSize;
    int *result = (int*)malloc(2*numsSize*sizeof(int));
    for(int track = 0 ; track < numsSize ; track++)
    {
        int steps = nums[track]%numsSize;
        int newindex = (track+steps)%numsSize;
        if(newindex < 0) newindex+=numsSize;
        result[track] = nums[newindex];
    }
    return result;
}