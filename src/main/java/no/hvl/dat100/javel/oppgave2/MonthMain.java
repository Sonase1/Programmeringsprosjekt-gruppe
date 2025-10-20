package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;
import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();



        System.out.println("Oppgave a:");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println("\n");

        System.out.println("Oppgave b: ");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println("\n");

        System.out.println("Oppgave c: ");
        double stromforbruk = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.printf("totalt strømforbruk en dag er %.2f %n%n", stromforbruk);

        System.out.println("Oppgave d: ");
        double grense = 1000;
        boolean overgrense = MonthlyPower.exceedThreshold(power_prices_month, grense);
        System.out.println(overgrense + "\n");

        System.out.println("Oppgave e: ");
        double spotprice = MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month);
        System.out.printf("du må betale %.2f kr i måneden %n%n",  spotprice);

        System.out.println("Oppgave f: ");
        double powerSupport = MonthlyPower.computePowerSupport(power_usage_month, power_prices_month);
        System.out.printf("%.2f kr støtte denne månaden .%n%n", powerSupport);

        System.out.println("Oppgave g: ");
        double norgesPris = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.printf("Du må betale %.2f kr pga norgespris denne månaden %n%n", norgesPris);



         /*

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also check that you get the expected results
         */

    }
}