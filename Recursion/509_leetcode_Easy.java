class Solution { 
    // recursion
    public int funct(int n){
        if(n==0 || n==1){ //Base case
            return n;
        }
        return funct(n-1)+funct(n-2);
    }
    public int fib(int n) {
      // Note: this question also solve by using dp
        return funct(n);
        
    }
}
