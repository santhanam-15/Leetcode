class Solution:
    def isGood(self, nums: List[int]) -> bool:
        seen=set()
        l=max(nums)
        i=1
        if(nums.count(l)!=2):
            return False
        while i<l:
            if i not in nums or nums.count(i)>1:
                return False
            i+=1
        return True
        
            
            
