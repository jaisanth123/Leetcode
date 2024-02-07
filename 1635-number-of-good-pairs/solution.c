int numIdenticalPairs(int* nums, int numsSize) {
    int goodPairs = 0;

    // Iterate through each pair of elements in the array
    for (int i = 0; i < numsSize - 1; i++) {
        for (int j = i + 1; j < numsSize; j++) {
            // Check if the pair is good
            if (nums[i] == nums[j]) {
                goodPairs++;
            }
        }
    }

    return goodPairs;
}

