public class Main {
    public static void main(String[] args) {

        //6 mükemmel sayı 1+2+3 = 6

        int number=5;
        int total=0;
        for(int i=1;i<number;i++){
            if( number%i==0){
                total=total+i;
            }
        }
        if(total==number){

            System.out.println("mükemmel sayı");

        }
        else {
            System.out.println("mükemmel sayı değil");
        }
    }

}