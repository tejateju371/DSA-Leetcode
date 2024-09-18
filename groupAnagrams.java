class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap();
        for(String words :strs){
            char ch[]=words.toCharArray();
            Arrays.sort(ch);
            String ang=new String(ch);
            if(!map.containsKey(ang))
            map.put(ang,new ArrayList<>());
            map.get(ang).add(words);

        }
       return new ArrayList<>(map.values());
    }
}