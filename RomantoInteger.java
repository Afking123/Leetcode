public class RomantoInteger {
public static void main(String[] args) {
    System.out.println(romanToInt("MLXXIV"));
}
public static int romanToInt(String roman) {
    char[] roman1={'I','X','C','M'};
    char[] roman5={'V','L','D',' '};
    int romanmax=roman.length();
    int level=0;
    int xten=1;
    int ans = 0;
    for(int i=romanmax-1;i>=0;i--){
        //System.out.println("level:"+level);
        char word =roman.charAt(i);
        //System.out.println(word);
        //System.out.println(i);
        //System.out.println(roman1[level]);
        //System.out.println(roman5[level]);
        if(word==roman5[level]){//如果為V開頭
            int k;
            if(i==0){k=5;}else{k=(roman.charAt(i-1)==roman1[level]) ? 4:5;}//如果還有下一位，判斷下一位是否為I,y:4,n:5
            ans+=k*xten;
            i=(k==4) ? i-1:i;
            
        }else if (word==roman1[level]) {//如果為I開頭
            int right=i;
            for(int j=1;j<=3;j++){
                i--;
                //System.out.println(i);
                if(i<0){
                    ans+=(j)*xten;
                    i++;
                    break;
                }
                if(roman.charAt(i)==roman5[level]){
                    //System.out.println("here+"+(5+j)*xten);
                    ans+=(5+j)*xten;
                    break;
                }else if(roman.charAt(i)!=word){
                    ans+=(j)*xten;
                    i++;
                    break;
                }
            }
        }else if (word==roman1[level+1]&&i==0) {//如果為X開頭且是最後一位
            ans+=10*xten;
        }else if (word==roman1[level+1]&&roman.charAt(i-1)==roman1[level]) {//如果為X開頭
            ans+=9*xten;
            i--;
        }else{i++;}
        //System.out.println(i);
        xten*=10;
        level++;
    }
    return ans;
}
}//System.out.println("here");