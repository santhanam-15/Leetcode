class Solution:
    def isGood(self, nums: List[int]) -> bool:
        n = max(nums)
        freq = Counter(nums)
        for i in range(1, n):
            if freq[i] != 1:  return False
        return freq[n] == 2