class Solution:
    def isPalindrome(self, s: str) -> bool:
        stack = []
        lower = s.lower()

        for c in lower:
            if c.isalnum():
                stack.append(c)

        print(stack)
        pal = ""
        while len(stack) > 0:
            pal += stack.pop()

        stripped = ""
        for c in lower:
            if c.isalnum():
                stripped += c

        print("Pal: " + pal)
        print("Stripped: " + stripped)
        return pal == stripped