import java.util.Random;
import java.util.ArrayList;

public class ChipotleChallenge {

    public static void main(String [] args) {
        Random r1 = new Random();

        int numC = 0;

        String input = "";
        double pr1 = (double)0;

        ArrayList<ArrayList<String>> cItems = new ArrayList<ArrayList<String>>(9);

        ArrayList<String> Veggies = new ArrayList<String>();
        String[] veg1 = {"lettuce", "fajita veggies", "no veggies", "all veggies"};
        for (int x = 0; x < veg1.length; x++) {

            Veggies.add(veg1[x]);
        }

            ArrayList<String> Beans = new ArrayList<String>();
        String[] bea1 = {" Pinto ", " Black ", " No Beans "};
        for (int x=0; x< bea1.length; x=+1) {
            Beans.add(bea1[x]);
        }
        ArrayList<String> Rice = new ArrayList<String>();
        String[] ric1 = {" White ", " Brown "," No Rice "};
        for (int x=0; x< ric1.length; x=+1) {
            Rice.add(ric1[x]);
        }
        ArrayList<String> Meat = new ArrayList<String>();
        String[] mea1 = {" Chicken ", " Steak ", " Carnidas ", " Chorizo ", " Sofritas ", " Veggies "};
        for (int x=0; x<mea1.length; x=+1) {
            Meat.add(mea1[x]);
        }
        ArrayList<String> Salsa = new ArrayList<String>();
        String[] sas1 = {" Mild ", " Medium ", " Hot "," No Salsa "};
        for (int x=0; x<sas1.length; x=+1) {
            Salsa.add(sas1[x]);
        }
        cItems.add(Salsa);
        cItems.add(Beans);
        cItems.add(Meat);
        cItems.add(Rice);
        cItems.add(Veggies);

        //int count = 0;
        for (int x = 1;x < 26; x=+1) {
          int rNum = r1.nextInt(5)  ;
            ArrayList<String> order = new ArrayList<String>();



            order.add(cItems.get(0).get(r1.nextInt(Rice.size()))+

                    "," + cItems.get(1).get(r1.nextInt(Meat.size())) +

                    "," + cItems.get(2).get(r1.nextInt(Beans.size()))+

                    "," + cItems.get(3).get(r1.nextInt(Salsa.size()))+

                    "," + cItems.get(4).get(r1.nextInt(Veggies.size())));

            for(String eliminate:order){

                if (eliminate.contains("no")){
                    numC++;

                }

                int sizes =  (5 - numC);

                pr1 = 3 + (0.5 * sizes);

                System.out.println("Burito " + x + ":" + eliminate + "\n" + "at a price of $" + pr1);



            }

            numC = 0;



        }

    }


}
