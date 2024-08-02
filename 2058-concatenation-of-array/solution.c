int* getConcatenation(int* nums, int numsSize, int* returnSize) {
    int* xyz = malloc(sizeof(int) * numsSize * 2);
    for (int i =0 ; i <numsSize; i++){
        xyz[i]=nums[i];
        xyz[i+numsSize]=nums[i];
    }
    *returnSize = numsSize * 2;
    return xyz;
    }
