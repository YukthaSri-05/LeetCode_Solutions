// Last updated: 9/15/2025, 8:38:58 PM
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int a=0,b=1,c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}