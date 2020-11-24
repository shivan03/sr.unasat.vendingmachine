package sr.unasat.vendingmachine.service;

public class VendingMachineService {


    public static class VendingmachineServices {

        private static String Beverage1="coca-cola";
        private static String Beverage2 = "sprite";
        private static int prijs1= 7;


        public static void Soft(int chosensoftdrink) {
            System.out.println("******************************************");
            System.out.println(Beverage2 +""+ " SRD" + prijs1);
            System.out.println(Beverage1 +""+ " SRD" + prijs1);
            System.out.println("******************************************");
            String message = " U heeft gekozen voor:";

            switch (chosensoftdrink){
                case 1:
                    message += Beverage1 + " " + prijs1 ;
                    break;
                case 2: message += Beverage2 + " " + prijs1 ;
                    break;
            }

            System.out.println(message);
        }
    }

}
