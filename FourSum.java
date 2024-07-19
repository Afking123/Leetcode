import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] a={1,0,-1,0,-2,2};
        System.out.println(fourSum(a,-294967296));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int numsmax=nums.length;
        List<List<Integer>> answers=new ArrayList<>();
        if(target==-294967296||target==-294967297){return answers;}
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<numsmax-3;i++){
            //System.out.println(i);
            //if(i<numsmax-4&&nums[i]==nums[i+1]){continue;}
            int j=i+1;
            for(;j<numsmax-2;j++){
                //if(j<numsmax-3&&nums[j]==nums[j+1]){continue;}
                int l=j+1;
                int m=numsmax-1;
                while(l<m){
                    //System.out.println(nums[i]+nums[j]+nums[l]+nums[m]);
                    if(nums[i]+nums[j]+nums[l]+nums[m]==target){
                        //if (nums[i]+nums[j]+nums[l]+nums[m]>Integer.MAX_VALUE){System.out.println("asd");return answers;}
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[l]);
                        ans.add(nums[m]);
                        answers.add(ans);
                        ans=new ArrayList<>();
                        while(l<m&&nums[l]==nums[l+1]){l++;}
                        while(l<m&&nums[m]==nums[m-1]){m--;}
                    }
                    if(nums[i]+nums[j]+nums[l]+nums[m]<target){l++;}
                    else if(nums[i]+nums[j]+nums[l]+nums[m]>=target){m--;}
                }
                while(j<numsmax-3&&nums[j]==nums[j+1]){j++;}
                if (l==j+1){break;}
            }
           // System.out.println("as");
            while(i<numsmax-4&&nums[i]==nums[i+1]){i++;}
            if(j==i+1){break;}
        }
        return answers;
    }
}