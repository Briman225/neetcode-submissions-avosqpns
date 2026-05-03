class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        d = {}
        r = [0] * k
        for x in nums:
            d[x] = d.get(x, 0) + 1
        
        i = k
        while i > 0 :
            r[i-1] = max(d, key=d.get)
            del d[max(d, key=d.get)]
            i -= 1

        return r