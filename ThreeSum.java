import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int numsmax=nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numsmax;i++){
            //System.out.println("level:"+1);
            for(int j=i+1;j<numsmax;j++){
                //System.out.println("level:"+2);
                for(int k=j+1;k<numsmax;k++){
                    //System.out.println("level:"+3);
                    if(nums[i]+nums[j]+nums[k]==0){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                    System.out.println(nums[i]+","+nums[j]+","+nums[k]);
                }
            }
        }
        return ans;
    }
}
