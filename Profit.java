/*
 * class Profit {
 * public static int totalRevenue;
 * public static int totalCost;
 * public static int currentProfit;
 * public static int previousProfit;
 * public static String sharePriceIncrease;
 * public static Boolean profitable;
 * public static int percent;
 * 
 * public static int calculateProfit(int totalRevenue, int totalCost){
 * currentProfit = totalRevenue - totalCost;
 * return currentProfit;
 * }
 * 
 * public static Boolean madeProfit(int calculateProfit){
 * if(calculateProfit > 0){
 * profitable = true;
 * } else {
 * profitable = false;
 * }
 * return profitable;
 * }
 * 
 * public static String percentageIncrease(int currentProfit, int
 * previousProfit){
 * percent = (int)((previousProfit / currentProfit) * 100);
 * String percentString = Integer.toString(percent);
 * return (percentString + "%");
 * }
 * 
 * public static void main(String[] args){
 * System.out.println(calculateProfit(10000, 2500));
 * }
 * }
 */