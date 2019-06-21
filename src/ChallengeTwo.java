import java.util.Random;

import java.util.ArrayList;

public class ChallengeTwo {

    public static void main(String[] args) {

        Random r1 = new Random();

        int itemC = 0;
        //String userResponse = "";


        ArrayList<ArrayList<String>> myL = new ArrayList<ArrayList<String>>(11);
        ArrayList<String> salsa = new ArrayList<String>();
        salsa.add("Mild");
        salsa.add("Medium");
        salsa.add("Hot");
        salsa.add("No salsa");

        ArrayList<String> meat = new ArrayList<String>();
        meat.add("Chicken");
        meat.add("Steak");
        meat.add("Carnidas");
        meat.add("Chorizo");
        meat.add("Sofritas");
        meat.add("Veggies");

        ArrayList<String> beans = new ArrayList<String>();
        beans.add("Pinto beans");
        beans.add("Black beans");
        beans.add("No beans");


        ArrayList<String> rice = new ArrayList<String>();
        rice.add("White rice");
        rice.add("Brown rice");
        rice.add("No rice");


        ArrayList<String> veggies = new ArrayList<String>();
        veggies.add("Lettuce");
        veggies.add("Fajita veggies");
        veggies.add("No veggies");


        myL.add(salsa);

        myL.add(beans);

        myL.add(meat);

        myL.add(rice);

        myL.add(veggies);

        //    int index = salsa.size();
      //      int index2 = meat.size();
       //     int index3 = beans.size();
        //   int index4 = rice.size();
       //    int index5 = veggies.size();
       //     do {
        //       int salsaIndex = r1.nextInt(index);
         //       String randomsalsa = salsa.get(salsaIndex);

          //      int meatIndex = r1.nextInt(index2);
          //      String randommeat = meat.get(meatIndex);

             //   int beansIndex = r1.nextInt(index3);
             //   String randombeans = beans.get(beansIndex);

             //   int riceIndex = r1.nextInt(index4);
             //   String randomrice = rice.get(riceIndex);

             //   int veggiesIndex = r1.nextInt(index5);
             //   String randomveggies = veggies.get(veggiesIndex);

             //   System.out.println();
        //  }
         //   while (!userResponse.equalsIgnoreCase("n"));
      //  r1.close();




        for (int x = 1; x < 11; x++) {
            ArrayList<String> myO = new ArrayList<String>();



            myO.add(myL.get(0).get(r1.nextInt(salsa.size()))+

                   "," + myL.get(1).get(r1.nextInt(beans.size())) +

                    "," + myL.get(2).get(r1.nextInt(meat.size()))+

                   "," + myL.get(3).get(r1.nextInt(rice.size()))+

                    "," + myL.get(4).get(r1.nextInt(veggies.size())));

            for(String ing1:myO){

               if (ing1.contains("no")){

                   itemC=+1;
              }
              System.out.println("Burrito " + x + " : " + ing1 );

            }

       }

    }

}


