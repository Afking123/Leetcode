public class InttoRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }
    public static String intToRoman(int number) {
        int i=1;
        int j=0;
        StringBuilder ans=new StringBuilder();
        while(number/10>0){
            j=number%10*i;
            //System.out.println(j);
            ans.insert(0,trantoRoman(j));
            number/=10;
            i*=10;
        }
        ans.insert(0,trantoRoman(number*i));
        return ans.toString();
    }
    public static StringBuilder trantoRoman(int num){
        System.out.println(num);
        String[] Value5={"V","L","D"};
        String[] Value={"I","X","C","M"};
        int k=0;
        StringBuilder str=new StringBuilder();
        while(num/10>0){
            k++;
            num/=10;
        }
        System.out.println(num);
        if (k==3){
            for(int l=num;l>0;l--){
                str.append("M");
            }
        }else{//需要引用Value[]的值
            switch (num) {
                case 9 -> str.append(Value[k]+Value[k+1]);
                case 5 -> str.append(Value5[k]);
                case 4 -> str.append(Value[k]+Value5[k]);
                default -> {
                    if(num>5){
                        str.append(Value5[k]);
                        num-=5;
                        for(;num>0;num--){str.append(Value[k]);}
                    }else{
                        for(;num>0;num--){str.append(Value[k]);}
                    }
                }
            }
        }
        
        System.out.println(str);
        return str;
    }
}
