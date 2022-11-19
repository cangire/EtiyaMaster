package Canliders;

import java.util.ArrayList;

public class Main {//pascal case
//Solid
    public static void main(String[] args) {
       // CreditManager creditManager=new CreditManager();
     //   creditManager.add();
        //creditManager.calculate();
        mortgageManager mortgageManager=new mortgageManager();
    //    mortgageManager.add();
        CreditManager[] credits=new CreditManager[2];
        credits[0]=new mortgageManager();
        credits[1]=new VehicleManager();
        for(int i=0;i<credits.length;i++){
            credits[i].calculate();
        }
        ArrayList<CreditManager> credits1=new ArrayList<>();
        credits1.add(new mortgageManager());
        credits1.add(new VehicleManager());
        credits1.add(new VehicleManager());
        credits1.add(new mortgageManager());

        for (CreditManager credit :credits1){
            credit.calculate();
        }
    }



}
