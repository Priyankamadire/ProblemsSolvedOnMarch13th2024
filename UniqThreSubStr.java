/*A string is good if there are no repeated characters.

Given a string s, return the number of good substrings of length three in s.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.

input =xyzzaz
output =1
Explanation: 
There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".

input =aababcabc
output = 4
Explanation: 
There are 7 substrings of size 3: 
"aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".
 */
import java.util.*;
public class  UniqThreSubStr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(solve(s));
    }
    public static int solve(String s){
        int n = s.length();
        int cnt =0;
        for(int i=0;i<=n-3;i++){
            String k = s.substring(i,i+3);
            if(isDup(k)){
                cnt++;
            }
            
        }
        
        return cnt;
        
    }
    public static Boolean isDup(String s){
        HashSet<Character> h = new HashSet<>();
        for(char c:s.toCharArray()){
            if(h.contains(c)){
                return false;
            }
            
            h.add(c);
        }
        return true;
    }
}