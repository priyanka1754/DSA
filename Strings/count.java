https://leetcode.com/problems/count-items-matching-a-rule/description/

1773. Count Items Matching a Rule

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i;
        if(ruleKey.equals("type")){
            i=0;
        }else if(ruleKey.equals("color")){
            i=1;
        }else{
            i=2;
        }
        int c=0;
        for(List<String> item:items){
            if(item.get(i).equals(ruleValue)){
                c++;
            }
        }
        return c;
    }
}