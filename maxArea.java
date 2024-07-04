

class maxArea {
    public static void main(String[] args) {
        maxArea solution = new maxArea();
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(heights));
    }
    public int maxArea(int[] height) {
        int highmax=height.length;
        int box;
        int ans=0;
        int number;
        for(int i=0;i<highmax;i++){
            //System.out.println("i:"+i+",height[i]:"+height[i]);
            for(int j=0;j<highmax-i;j++){
                //System.out.println("i:"+height[i]+",j:"+j);
                int k=i+j;
                if (height[i]<height[k]){
                    number=height[i];
                }else{
                    number=height[k];
                }
                box=number*j;
                if (box<0){box*=-1;}
                //System.out.println(number+"x"+(j));
                ans=(box>ans)? box:ans;
            }
            //System.out.println("---");
        }
        return ans;
    }
}