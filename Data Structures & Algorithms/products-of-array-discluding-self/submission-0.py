class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix = [0] * len(nums)
        prefix[0] = 1
        prefix[1] = nums[0]
        i = 2
        while i < len(nums):
            prefix[i] = nums[i-1] * prefix[i - 1]
            i += 1

        suffix = [0] * len(nums)
        suffix[len(nums) - 1] = 1
        suffix[len(nums) - 2] = nums[len(nums) - 1]
        i = len(nums) - 3
        while i >= 0:
            suffix[i] = nums[i+1]*suffix[i+1]
            i -= 1

        prods = [0] * len(nums)
        i = 0
        while i < len(nums):
            prods[i] = prefix[i] * suffix[i]
            i += 1

        return prods