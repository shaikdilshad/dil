class D{
     void  numberToWords(int number){
        int num=0,dig=1,dif=0;
        if(number<0){
            System.out.println("Invalid Value");
        }
        else{
            num=reverse(number);
            while(num!=0){
                dig=num%10;
                switch(dig) {
                    case 0:
                        System.out.print("Zero" + " ");
                        break;
                    case 1:
                        System.out.print("One" + " ");
                        break;
                    case 2:
                        System.out.print("Two" + " ");
                        break;
                    case 3:
                        System.out.print("Three" + " ");
                        break;
                    case 4:
                        System.out.print("Four" + " ");
                        break;
                    case 5:
                        System.out.print("Five" + " ");
                        break;
                    case 6:
                        System.out.print("Six" + " ");
                        break;
                    case 7:
                        System.out.print("seven" + " ");
                        break;
                    case 8:
                        System.out.print("Eight" + " ");
                        break;
                    case 9:
                        System.out.print("Nine" + " ");
                        break;
                    default:
                        System.out.print("Invalid Value" + " ");
                }
                num=num/10;
            }
            dif=getDigitCount(number)-getDigitCount(num);
            if(dif!=0){
                for(int i=1;i<dif;i++){
                    System.out.print("Zero");
                }
            }
        }
    }
    int reverse(int number){
        int dig=1,rev=0;
        while(number!=0){
            dig=number%10;
            rev=dig+rev*10;
            number=number/10;
        }
        return rev;
    }
    int getDigitCount(int number){
        int count=0;
        while(number>0){
            count++;
            number=number/10;
        }
        return count;
    }
}
public class N {
    public static void main(String[] args){
        D d=new D();
        d.numberToWords(100);
    }

}
