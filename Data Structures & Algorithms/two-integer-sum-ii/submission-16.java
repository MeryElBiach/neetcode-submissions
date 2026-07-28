class Solution {
    public int[] twoSum(int[] numbers, int target) {
         // on va utilise le fait que le tableau et trié
        int l=0;
        int r= numbers.length-1;
        while (l<r){
            if (numbers[l]+numbers[r]==target){
                return new int[]{l+1,r+1};
            }else if(numbers[l]+numbers[r]<target){
                     l++;
                       
            }else if(numbers[l] + numbers[r]>target){
                         r--;
            }
                       
            }
        return new int [0];
        }
        }
    

