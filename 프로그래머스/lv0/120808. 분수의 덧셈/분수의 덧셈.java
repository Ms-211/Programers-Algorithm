class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int[] answer = new int[2];
        int bunmo = denom1 * denom2;
        int bunza = numer1 * denom2 + numer2 * denom1;
        
        int a = bunmo;
        int b = bunza;
        
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