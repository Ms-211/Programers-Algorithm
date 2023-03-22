class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int[] answer = new int[2];
        int bunmo = denom1 * denom2;
        int bunza = numer1 * denom2 + numer2 * denom1;
        int a = 0;
        int b = 0;
        
        if(a > b){
          a = bunmo;
          b = bunza;
        }else{
          a = bunza;
          b = bunmo;
        }
        
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        int gcd = a;
        
        answer[0] = bunza / gcd;
        answer[1] = bunmo / gcd;
        
        return answer;
    }
}