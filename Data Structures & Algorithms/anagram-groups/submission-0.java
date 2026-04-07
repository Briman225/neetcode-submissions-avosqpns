class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        int uniqueWords = 0;
        for(int i = 0; i < strs.length; i++)
        {
            if (strs[i] != null)
            {
                anagrams.add(new ArrayList<String>());
                anagrams.get(uniqueWords).add(strs[i]);
                for (int j = i + 1; j < strs.length; j++)
                {
                    if (strs[j] != null && isAnagram(strs[i], strs[j]))
                    {
                        anagrams.get(uniqueWords).add(strs[j]);
                        strs[j] = null;
                    }
                }
                uniqueWords++;
                strs[i] = null;
            }
        }
        return anagrams;
    }

    public boolean isAnagram(String str1, String str2)
    {
        if (str1.length() != str2.length())
            return false;
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
