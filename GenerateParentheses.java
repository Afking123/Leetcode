import java.util.ArrayList;
import java.util.List;
class GenerateParentheses{
    public static void main(String[] args) {
        int n=4;
        System.out.println(generateParenthesis(n));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        dfs(ans,"",0,0,n);
        return ans;
    }
    public static void dfs(List<String> ans,String back,int left,int right,int max){
        if(left<max){
            dfs(ans,back+"(",left+1,right,max);
        }
        if(right<left){
            dfs(ans,back+")",left,right+1,max);
        }
        if(left+right==max*2){
            ans.add(back);
        }
    }
}

