class Solution:
    def search(self, nums: List[int], target: int) -> int:
       left=0
       right=len(nums)-1
       while left <= right :
         mil= (left + right) // 2
         if target == nums[mil]:
            return mil
         elif target < nums[mil] :
            right = mil-1
         else :
            left = mil+1
       return -1 
