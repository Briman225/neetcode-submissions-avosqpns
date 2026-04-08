class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = 0
        sell = 0
        maxProfit = 0

        while buy < len(prices) - 1:
            sell = buy + 1
            while sell < len(prices):
                if prices[sell] - prices[buy] > maxProfit:
                    maxProfit = prices[sell] - prices[buy]
                sell += 1
            buy += 1

        return maxProfit