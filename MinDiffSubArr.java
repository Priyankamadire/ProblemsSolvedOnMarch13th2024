/*Write a JAVA Program to find Subarrays with K Different integers 
Given an array A of positive integers, call a (contiguous, not necessarily distinct) 
subarray of A 
good if the number of different integers in that subarray is exactly K. 
(For example, [1,2,3,1,2] has 
3 different integers: 1, 2, and 3.) 
Return the number of good subarrays of A. 
Example 1: 
Input: A = [1,2,1,2,3], K = 2 
Output: 7 
Explanation: Subarrays formed with exactly 2 different integers: 
[1,2], [2,1], [1,2], [2,3], [1,2,1], 
[2,1,2], [1,2,1,2] 
Example 2: 
Input: A = [1,2,1,3,4], K = 3 
Output: 3 
Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], 
[1,3,4].

TESTCASES:
-------------------------------
case=1
input=5
2
1
2
1
2
3
output=7

case=2
input=4
3
3
2
4
3
output=3*/
import java.util.*;
public class MinDiffSubArr{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     int arr[] = new int[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
    //  int k = sc.nextInt();
     System.out.print(solve(n,arr,k));
    }
    public static int solve(int n,int arr[],int k){
        return help(n,arr,k)-help(n,arr,k-1); 
    }
    public static int help(int n,int arr[], int k) {
       int i=0;
       int cnt=0;
       HashMap<Integer,Integer> hm = new HashMap<>();
       for(int j=0;j<n;j++){
           if(hm.getOrDefault(arr[j],0)==0){
               k--;
           }
           hm.put(arr[j],hm.getOrDefault(arr[j],0)+1);
           while(k<0){
               hm.put(arr[i],hm.get(arr[i])-1);
               if(hm.get(arr[i])==0){
                   
                   k++;
               }
               i++;
           }
           
           cnt+=j-i+1;
           
       }
       return cnt;
        
    }

    
}
