import java.util.ArrayList;
import java.util.List;


public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }
    public static  List<String> letterCombinations(String digits) {
        String[][] letter={{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
        List<String> ans=new ArrayList<>();
        List<String> first=new ArrayList<>();
        List<Integer> num=new ArrayList<>();
        if (digits.length()==0||digits==null){return ans;}
        int number=Integer.parseInt(digits);
        while(number/10>0){
            num.add(number%10);
            number/=10;
        }
        //num.add(number);
        for(String x:letter[number-2]){//設定第一個數字
            first.add(x);
        }
        if(digits.length()==1){return first;}//如果只有一個字，返回first
        int firstmax=first.size();
        int nummax=num.size();//num是裝了所有數字的list,nummax是num的長度
        for(int i=nummax-1;i>=0;i--){//
            for(String j:letter[num.get(i)-2]){
                for(int k=0;k<firstmax;k++){
                    ans.add(first.get(k)+j);
                }
            }
            first=ans;
            firstmax=first.size();
            ans=new ArrayList<>();
        }
        return first;
    }
}
