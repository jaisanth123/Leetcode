double findMedianSortedArrays(int* nums1, int nums1size, int* nums2, int nums2size) {
    int totalsize = nums1size + nums2size;
    int merged[totalsize];

    int i=0, j = 0, k=0;
    while (i < nums1size && j < nums2size) {
        if (nums1[i] < nums2[j]) {
            merged[k++] = nums1[i++];
        } else {
            merged[k++] = nums2[j++];
        }
    }

    while (i < nums1size) {
        merged[k++] = nums1[i++];
    }
    while (j < nums2size) {
        merged[k++] = nums2[j++];
    }

    if (totalsize % 2 != 0) {
        return (double)merged[totalsize / 2];
    } else {
        return (double)(merged[totalsize / 2 - 1] + merged[totalsize / 2]) / 2;
    }
}


