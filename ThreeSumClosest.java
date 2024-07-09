import java.util.Arrays;
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] list={2,3,8,9,10};
        System.out.println(threeSumClosest(list,16));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int numsmax =nums.length;
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        int ansdis=ans-target;
        ansdis *=(ansdis<0) ? -1:1;
        for(int i=0;i<numsmax-2;i++){
            if(i>0){if(nums[i-1]==nums[i]){continue;}}
            int j=i+1;
            int k=numsmax-1;
            //System.out.println("-------");
           // System.out.println("i:"+i+"j:"+j+"k:"+k);
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==target){return target;}
                int l =nums[i]+nums[j]+nums[k];
                if (l>target){
                    k--;
                }else{
                    j++;
                }
                int ldis=(l-target);
                if(ldis<0){ldis*=-1;}//取目前迴圈答案與target的距離
                if(ansdis>ldis){
                    ans=l;
                    ansdis=ldis;
                }

            }
            }
            return ans;
        }
    }
