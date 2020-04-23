package machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeMachine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int waterLeft = 400;
        int milkLeft = 540;
        int beansLeft = 120;
        int cupsLeft = 9;
        int moneyLeft = 550;
        int water1 = 250;
        int milk1 = 0;
        int beans1 = 16;
        int cups1 = 1;
        int money1 = 4;
        int water2 = 350;
        int milk2 = 75;
        int beans2 = 20;
        int cups2 = 1;
        int money2 = 7;
        int water3 = 200;
        int milk3 = 100;
        int beans3 = 12;
        int cups3 = 1;
        int money3 = 6;
        String action = "null";
        while (action != "exit") {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = reader.readLine();
            if (action.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String coffeNum = reader.readLine();
                if (coffeNum.equals("back")) {

                } else if (Integer.parseInt(coffeNum) == 1) {
                    if (waterLeft < water1) {
                        System.out.println("Sorry, not enough water!");
                    } else if (milkLeft < milk1) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (beansLeft < beans1) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (cupsLeft < cups1) {
                        System.out.println("Sorry, not enough cups!");
                    } else if (waterLeft >= water1 & milkLeft >= milk1 & beansLeft >= beans1 & cupsLeft >= cups1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        waterLeft -= water1;
                        milkLeft -= milk1;
                        beansLeft -= beans1;
                        cupsLeft -= cups1;
                        moneyLeft += money1;
                    }
                } else if (Integer.parseInt(coffeNum) == 2) {
                    if (waterLeft < water2) {
                        System.out.println("Sorry, not enough water!");
                    } else if (milkLeft < milk2) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (beansLeft < beans2) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (cupsLeft < cups2) {
                        System.out.println("Sorry, not enough cups!");
                    } else if (waterLeft >= water2 & milkLeft >= milk2 & beansLeft >= beans2 & cupsLeft >= cups2) {
                        System.out.println("I have enough resources, making you a coffee!");
                        waterLeft -= water2;
                        milkLeft -= milk2;
                        beansLeft -= beans2;
                        cupsLeft -= cups2;
                        moneyLeft += money2;
                    }
                } else if (Integer.parseInt(coffeNum) == 3) {
                    if (waterLeft < water3) {
                        System.out.println("Sorry, not enough water!");
                    } else if (milkLeft < milk3) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (beansLeft < beans3) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (cupsLeft < cups3) {
                        System.out.println("Sorry, not enough cups!");
                    } else if (waterLeft >= water3 & milkLeft >= milk3 & beansLeft >= beans3 & cupsLeft >= cups3) {
                        System.out.println("I have enough resources, making you a coffee!");
                        waterLeft -= water3;
                        milkLeft -= milk3;
                        beansLeft -= beans3;
                        cupsLeft -= cups3;
                        moneyLeft += money3;
                    }
                }
            } else if (action.equals("fill")) {
                System.out.println("Write how many ml of water do you want to add:");
                waterLeft += Integer.parseInt(reader.readLine());
                System.out.println("Write how many ml of milk do you want to add: ");
                milkLeft += Integer.parseInt(reader.readLine());
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                beansLeft += Integer.parseInt(reader.readLine());
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                cupsLeft += Integer.parseInt(reader.readLine());
            } else if (action.equals("take")) {
                System.out.println("I gave you $" + moneyLeft);
                moneyLeft = 0;
            } else if (action.equals("remaining")) {
                System.out.println("The coffee machine has:\n" +
                        waterLeft + " of water\n" +
                        milkLeft + " of milk\n" +
                        beansLeft + " of coffee beans\n" +
                        cupsLeft + " of disposable cups\n" +
                        moneyLeft + " of money\n");
            }else if (action.equals("exit")){
                break;
            }
        }
        /*System.out.println("Write how many ml of water the coffee machine has: ");
        int waterMl = Integer.parseInt(reader.readLine());
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkMl = Integer.parseInt(reader.readLine());
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beansGr = Integer.parseInt(reader.readLine());
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsNum = Integer.parseInt(reader.readLine());
        int waterMlReq = cupsNum * 200;
        int milkMlReq = cupsNum * 50;
        int beansGrReq = cupsNum * 15;
        int cupsbyWater = waterMl / 200;
        int cupsbyMilk = milkMl / 50;
        int cupsbyBeans = beansGr / 15;
        int maxCups = Math.min(Math.min(cupsbyBeans, cupsbyMilk), cupsbyWater);
        if (maxCups == cupsNum) {
            System.out.println("Yes, I can make that amount of coffee ");
        } else if (maxCups > cupsNum) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (maxCups - cupsNum) + " more than that)");
        } else if (maxCups < cupsNum) {
            System.out.println("No, I can make only " + maxCups + " cup(s) of coffee");
        }

         /*
        System.out.println("For " + cupsNum + " cups of coffee you will need:\n" +
                200 * cupsNum + " ml of water\n" +
                50 * cupsNum + " ml of milk\n" +
                15 * cupsNum + " g of coffee beans");

       System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");

    }

    public static void coffee(int waterLeft, int milkLeft,int beansLeft,int cupsLeft,int water,int milk,int beans,int cups) {
        if (waterLeft < water & milkLeft < milk & beansLeft < beans & cupsLeft < cups){
            System.out.println("Sorry, not enough water, milk, beans and cups!");
        }else if (waterLeft < water & milkLeft < milk & beansLeft < beans ){
            System.out.println("Sorry, not enough water, milk and beans !");
        }else if (waterLeft < water & milkLeft < milk ){
            System.out.println("Sorry, not enough water and milk!");
        }else if (waterLeft < water){
            System.out.println("Sorry, not enough water!");
        }else if (milkLeft < milk){
            System.out.println("Sorry, not enough milk!");
        }else if (beansLeft < beans){
            System.out.println("Sorry, not enough coffee beans!");
        }else if (cupsLeft < cups){
            System.out.println("Sorry, not enough cups!");
        }else if (waterLeft >= water & milkLeft >= milk & beansLeft >= beans & cupsLeft >= cups){
            System.out.println("I have enough resources, making you a coffee!");
            waterLeft -= water;
            milkLeft -= milk;
            beansLeft -= beans;
            cupsLeft -= cups;
            moneyLeft += money;
        }*/
    }
}
