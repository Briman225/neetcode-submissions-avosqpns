class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_list = list(s)
        t_list = list(t)

        s_list.sort()
        t_list.sort()

        if len(s_list) != len(t_list):
            return False

        for x in range(len(s_list)):
            if s_list[x] != t_list[x]:
                return False
        
        return True