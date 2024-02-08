int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int* result = (int*)malloc(2 * sizeof(int));
    int numToIndex[numsSize][2];

    for (int i = 0; i < numsSize; ++i) {
        int complement = target - nums[i];
        for (int j = 0; j < i; ++j) {
            if (numToIndex[j][0] == complement) {
                result[0] = j;
                result[1] = i;
                *returnSize = 2;
                return result;
            }
        }
        numToIndex[i][0] = nums[i];
        numToIndex[i][1] = i;
    }
    
    return result;
}

