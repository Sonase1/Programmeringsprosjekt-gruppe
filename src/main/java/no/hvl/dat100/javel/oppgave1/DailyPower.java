package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        for (int i = 0; i < prices.length; i++){
            System.out.print(prices[i] + " NOK ");
        }
        System.out.println("\n");
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        for (int i = 0; i < usage.length; i++){
            System.out.print(usage[i] + " kWh. " );
        }
        System.out.println("\n");
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        for (int i = 0; i < usage.length; i++){
            sum += usage[i];
        }

        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;
        for (int i = 0; i<usage.length; i++){
            price += usage [i] * prices[i];
        }
        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    public static double getSupport(double usage, double price) {

        double support = 0;

        if (price > THRESHOLD){
            support = (price - THRESHOLD) * PERCENTAGE;
        }

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;
        for (int i = 0 ; i<usage.length; i++){
            support += getSupport(usage[i], prices[i]);
        }
        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;
        for (int i = 0; i<usage.length; i++){
            price += usage[i] * NORGESPRIS_KWH;
        }
        return price;
    }

    // h) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = usage[0];

        for (int i = 0; i < usage.length - 1; i++){
            if (usage[i] < usage[i+1]){
                temp_max = usage[i+1];
            }
        }
        return temp_max;
    }
    // i) Gjennomsnitt strømforbruk for a day
    public static double findAvgPower(double[] usage) {

        double average = (computePowerUsage(usage))/(usage.length+1);
        return average;
    }
}