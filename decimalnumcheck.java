public class decimalnumcheck {
     boolean jjdfj(double i,double j){
       int temp1=(int)(i*1000)/10;
       int temp2=(int)(j*1000)/10;
       int c=1;
        while(c<=10000){
            if(temp1%c==temp2%c){
                c=c*10;
            }
            else{
                break;
            }
        }
        if(c==100000){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        decimalnumcheck d=new decimalnumcheck();
        boolean k;
        k=d.jjdfj(4.0,5.0);
        if(k){
            System.out.println("three decimal points are equal");
        }
        else{
            System.out.println("no");
        }

    }
}
