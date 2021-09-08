public class Diagonalstar {
    void star(int number){
        int i,j;
        for(i=1;i<=number;i++){
            for(j=1;j<=number;j++){
                if(i==j){
                    System.out.print("*");
                }
                else if(i==1||i==number||j==1||j==number){
                    System.out.print("*");
                }
                else if(j==(number-i+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Diagonalstar d=new Diagonalstar();
        d.star(5);
    }
}
