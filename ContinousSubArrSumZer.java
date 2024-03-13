/*You are given a list of N integers List[], list contains both +ve and -ve integers.
Your task is to findout, the Highest Product possible,
Where the product is the product of all the elements of contiguous sublist sList[],
and sub list should conatin atleast 1 integer.

Input Format:
-------------
Line-1: An integer N.
Line-2: N space separated integers, List[].

Output Format:
--------------
Print an integer output, the highest product.

Sample Input-1:
---------------
4
2 3 -2 4

Sample Output-1:
----------------
6

Explanation:
------------
Product of contiguous sub list [2,3].


Sample Input-2:
---------------
3
-2 0 -3

Sample Output-2:
----------------
0

Explanation:
------------
Product of sub list [0], where [-2,-3] is not a contiguous sublist
 */
import java.util.*;
public class ContinousSubArrSumZer{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(solve(n,arr));
    } 
    public static int solve(int n,int arr[]){
        // int cnt = 0;
        // int maxi = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int prod =1;
        //     for(int j=i+1;j<n;j++){
        //         prod=prod*arr[j];
        //     }
        //     maxi = Math.max(prod,maxi);
        // }
        // return maxi;
        
        if(n==1 || arr==null){
            return arr[0];
        }
        int maxi = arr[0];
        int mini = arr[0];
        int ans = arr[0];
        for(int i=1;i<n;i++){
            int tmax = Math.max(arr[i],Math.max(maxi*arr[i],mini*arr[i]));
            int tmini = Math.min(arr[i],Math.min(maxi*arr[i],mini*arr[i]));
            maxi=tmax;
            mini=tmini;
            ans=Math.max(ans,maxi);
        }
        return ans;
    }
}