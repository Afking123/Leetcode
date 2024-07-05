public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] cars = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(cars));
    }
    public static String longestCommonPrefix(String[] strs) {
        int strsmax = strs.length;
        String ans="";
        char a;
        int k=0;
        int shortest=strs[0].length();
        for(int i=0;i<strsmax;i++){//取得單字最短長度
           shortest=(shortest>strs[i].length()) ? strs[i].length():shortest;
        }
        for(int i=0;i<shortest;i++){//從前到後印出來，邊印邊比較，若!=就跳出
            a=strs[0].charAt(i);
            for(int j=0;j<strsmax;j++){
                a=(a==strs[j].charAt(i)) ? a:0;
            }
            if (a==0){break;}
            else{ans+=a;};
        }
        return ans;
    }
}
