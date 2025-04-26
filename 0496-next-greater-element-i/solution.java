class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : nums1){
            int flag = -1;
            boolean found = false ;
            for(int j = 0 ; j < nums2.length; j++){
                if(i==nums2[j]){
                    found = true ;
                    for(int k = j+1 ; k<nums2.length ;k++){
                        if(nums2[k] > i){
                            flag = nums2[k];
                            break;}
                    }
                break;
                }
            }
            if(!found){
                flag = -1;
            }
            list.add(flag);
        }
        int [] res = new int[list.size()];
        for(int i = 0 ; i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}





// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for(int i : nums1){
//             int flag = -1;
//             boolean found = false;
//             for(int j = 0 ; j < nums2.length; j++){
//                 if(i==nums2[j]){
//                     found = true;
//                     for(int k = j+1 ; k<nums2.length ;k++){
//                         if(nums2[k] > i){
//                             flag = nums2[k];
//                             break;
//                         }
//                     }
//                     break;
//                 }
//             }
//             if(!found){
//                 flag = -1;
//             }
//             list.add(flag);
//         }
//         int [] res = new int[list.size()];
//         for(int i = 0 ; i<list.size();i++){
//             res[i] = list.get(i);
//         }
//         return res;
//     }
// }

