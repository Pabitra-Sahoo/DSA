class Solution {
    public int firstUniqChar(String s) {
        char[] c=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:c){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(int i=0;i<c.length;i++){
            if(map.get(c[i])==1){
                return i;
            }
        }
        return -1;
    }
}