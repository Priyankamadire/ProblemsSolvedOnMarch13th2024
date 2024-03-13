/*2485. Find the Pivot Integer
Solved
Easy
Topics
Companies
Hint
Given a positive integer n, find the pivot integer x such that:

The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.

 

Example 1:

Input: n = 8
Output: 6
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
Example 2:

Input: n = 1
Output: 1
Explanation: 1 is the pivot integer since: 1 = 1.
Example 3:

Input: n = 4
Output: -1
Explanation: It can be proved that no such integer exist.
 

Constraints:

1 <= n <= 1000 */
class POTD {
    public int pivotInteger(int n) {
        int ans = n*(n+1)/2;
        double k = Math.sqrt(ans);

        if(k==(int)k){
            return (int)k;
        }
        return -1;
    }
}
/**logic of problem is that pivoit elemnts lies in both halfs
 x*(x+1)/2  = n*(n+1)/2-x*(x+1)/2+x
 x*(x+1) = n(n+1)/2-x

 x*x = n(n+1)/2
 x=root(n(n+1)/2)
 */