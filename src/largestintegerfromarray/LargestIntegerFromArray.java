/*

Given a list of non negative integers, arrange them such that they form the 
largest number.

For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an 
integer.

 */
package largestintegerfromarray;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author ali_hassan_syed
 */
public class LargestIntegerFromArray 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
    }
    
    public String largestNumber(int[] nums) 
    {
        if (nums == null || nums.length == 0)
            return "0";
        
        //convert integer nums array into string array
        String[] numsStr = new String[nums.length - 1];
        for (int i=0; i<nums.length; i++)
        {
            numsStr[i] = String.valueOf(nums[i]);
        }
        
        Comparator<String> comp = new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2) 
            {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        };
        
        Arrays.sort(numsStr, comp);
        
        if (numsStr[0].charAt(0) == '0')
            return "0";
        
        StringBuilder sb = new StringBuilder();
        for (String s : numsStr)
            sb.append(s);
        
        return sb.toString();
        
        
    }
    
}
