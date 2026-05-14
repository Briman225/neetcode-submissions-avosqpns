class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num_set = set()
        for num in nums:
            num_set.add(num)

        i, max_i = 1, 0
        for num in nums:
            if (num-1) not in num_set:
                i = 1
                while num + i in num_set:
                    i += 1
                max_i = max(i, max_i)


        return max_i