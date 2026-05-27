class Solution:
    def minimumSwaps(self, nums: list[int]) -> int:
        z=nums.count(0)
        if z==0:
            return 0
        return sum(1 for x in nums[-z:] if x!=0)