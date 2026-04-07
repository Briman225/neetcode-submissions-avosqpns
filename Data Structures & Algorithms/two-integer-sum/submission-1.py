class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mappy = {}

        for i in range(len(nums)):
            if target - nums[i] in mappy:
                return [mappy[target - nums[i]], i]
            else:
                mappy[nums[i]] = i