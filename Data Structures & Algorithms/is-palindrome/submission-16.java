class Solution {
    public boolean isPalindrome(String s) {
        char [] arr=s.toCharArray();
        List <Character> l = new ArrayList();
         for (int i =0 ; i<arr.length;i++){
             if (Character.isLetterOrDigit(arr[i])){
                arr[i] = Character.toLowerCase(arr[i]);
                l.add(arr[i]);
            
             }

        }
         int m =l.size();
        for (int i =0 ; i<m ;i++){
             if ( l.get(i)!=l.get(m-1-i)){
                return false ;
             }

        }
        return true;
    }
}
