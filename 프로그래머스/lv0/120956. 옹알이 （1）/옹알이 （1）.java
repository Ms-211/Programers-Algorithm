class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String speak[] = {"aya","ye","woo","ma"};
        
        for(int i=0; i<babbling.length; i++){
            for(String changeWord : speak){
                babbling[i] = babbling[i].replace(changeWord,"0");
            }
            
            if(babbling[i].replaceAll("0","").equals("")) answer++ ; 
        }
            
        return answer;
    }
}