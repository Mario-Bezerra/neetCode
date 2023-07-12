class Solution {
    public boolean isAnagram(String s, String t) {
        String tAfterReplace = t;

        for(int i = 0 ; i < s.length() ; i++){
            if(!t.contains(String.valueOf(s.charAt(i))))
                return false;
            if(tAfterReplace.isEmpty())
                return false;

            tAfterReplace = tAfterReplace.replaceFirst(String.valueOf(s.charAt(i)), "");
        }

        if (tAfterReplace.length() == 0 && !tAfterReplace.equals(t))
            return true;

        return false;
    }
}