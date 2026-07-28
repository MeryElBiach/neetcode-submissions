class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> group =new HashMap<>();
        for (int i=0 ; i<strs.length; i++){
             char[] chars = strs[i].toCharArray();
             Arrays.sort(chars);
             String key = new String(chars);
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
             if (!group.containsKey(key)){
                   group.put(key, list);     
             }else {
                group.get(key).add(strs[i]);
             }
             
        }
        ArrayList<List<String>> output= new ArrayList<>();
        for ( String key :group.keySet()){
            output.add(group.get(key));
        }
        return output;
        
    }
}   
