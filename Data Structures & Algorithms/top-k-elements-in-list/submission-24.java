class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> m= new HashMap<>();
        for ( int i =0 ; i<nums.length; i++){
            if( !m.containsKey(nums[i])){
                    m.put(nums[i],1);
            }else{
                m.put(nums[i],m.get(nums[i])+1);
            }
        } 
        
        List <Integer> keys= new ArrayList<>(m.keySet());
    
        keys.sort((a,b)->Integer.compare(m.get(a),m.get(b)));

        int[] result = new int [k];
        int n=m.size();
        for (int i=0 ; i< k ; i++){
            result[i]=keys.get(n-i-1);
        }
        return result;


       
}}
