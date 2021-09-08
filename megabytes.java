public class megabytes {
        public static  void printMegaBytesAndKiloBytes(int KiloBytes){
            int megabytes,remaining_Kilobytes;
            if(KiloBytes<0){
                System.out.println("Invalid Value");
            }
            else{
                megabytes=(int)KiloBytes/1024;
                remaining_Kilobytes=KiloBytes%1024;
                System.out.println(KiloBytes+" KB = "+megabytes+"MB and "+remaining_Kilobytes+" KB");
                System.out.println(((561600)/(365*60*24)));
                System.out.println(((561600%525600)));
                System.out.println((36000)/(60*24));
                System.out.println();
            }
        }
        public static void main(String[] args){
            printMegaBytesAndKiloBytes(5000);
    }
}
