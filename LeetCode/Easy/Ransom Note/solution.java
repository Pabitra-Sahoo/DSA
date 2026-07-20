class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] RN=ransomNote.toCharArray();
        char[] mag=magazine.toCharArray();
        // HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        // for(char a:RN){
        //     if(map1.containsKey(a)){
        //         map1.put(a,map1.get(a)+1);
        //     }
        //     else{
        //         map1.put(a,1)
        //     }
        // }
        for(char a:mag){
            if(map2.containsKey(a)){
                map2.put(a,map2.get(a)+1);
            }
            else{
                map2.put(a,1);
            }
        }
        
        for(char a:RN){
            if(map2.getOrDefault(a,0)<=0){
                return false;
            }
            else{
                map2.put(a,map2.get(a)-1);
            }
        }
        return true;
    }
}