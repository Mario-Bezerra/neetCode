import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> anagramList = new HashMap<>();

        for(int i = 0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String ch = String.valueOf(arr);
            if(anagramList.containsKey(ch)){
                List<String> s = anagramList.get(ch);
                s.add(strs[i]);
                anagramList.put(ch,s);
            }
            else{
                List<String> s = new ArrayList<String>();
                s.add(strs[i]);
                anagramList.put(ch,s);
            }

        }
        List<List<String>> solutionResult = new ArrayList<>();

        for (Map.Entry<String,List<String>> mapElement : anagramList.entrySet()) {


            solutionResult.add(mapElement.getValue());

        }
        return solutionResult;

    }
}