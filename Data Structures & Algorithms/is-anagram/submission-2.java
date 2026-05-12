class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> firstFrequencies = new HashMap();
        Map<Character, Integer> secondFrequencies = new HashMap();

        for(char c : s.toCharArray()) {
            firstFrequencies.put(c, firstFrequencies.getOrDefault(c, 0) +1);
        }

        for (char c : t.toCharArray()) {
            secondFrequencies.put(c, secondFrequencies.getOrDefault(c, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : firstFrequencies.entrySet()) {
            if(!entry.getValue().equals(secondFrequencies.get(entry.getKey()))) {
                return false;
            }
        }

        return true;        

    }

}
