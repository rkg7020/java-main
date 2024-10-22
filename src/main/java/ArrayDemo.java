import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayDemo {
    public static void main(String[] args) {
    //  int[]  nums = [2,7,11,15], target = 9
      //  twoSum( [2,7,11,15],9);
       ;
      //  System.out.println(Arrays.toString(twoSum(new int[]{3,1}, 6)));
        System.out.println(lengthOfLongestSubstring(" "));
    }
    public static int[] twoSum(int[] nums, int target) {
        //nums.length
                for (int i=1 ; i< nums.length; i++){
                    if(target==nums[i-1]+nums[i]){
                        return new int[] {i-1,i};
                    }
                }
                return null;

    }
    public static int lengthOfLongestSubstring(String s) {
        int maxlength=0;
        int start=0;
       // int end=0;
        Set <Character> characters=new HashSet<>();
        String longWord="";
        int length=0;
        if(s.length()==0){ return 0;}
        for(int end= 0; end< s.length(); end++){
          if( characters.add(s.charAt(end))) {
              length++;
            //
          }else{
        if((maxlength < length)){
            maxlength=length;
        } length=1;


             // start=end;
          }
        }
return  Integer.max(length,maxlength) ;
    }
}
