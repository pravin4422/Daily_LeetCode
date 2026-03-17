class Solution {
    public String frequencySort(String s) {

        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
      
        for(char i : s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());

        StringBuilder sc = new StringBuilder();
        for(Map.Entry<Character,Integer> i : list){
            int value = i.getValue();
            for(int j =0;j<value;j++){
                sc.append(i.getKey());
            }
        }
        
        return sc.toString();
    }
}