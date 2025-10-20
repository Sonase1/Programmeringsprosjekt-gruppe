package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        System.out.println("Oppgave a:");
        DailyPower.printPowerPrices(DayPowerData.powerprices_day);


        System.out.println("Oppgave b: ");
        DailyPower.printPowerUsage(DayPowerData.powerusage_day);


        System.out.println("Oppgave c: ");
        double stromforbruk = DailyPower.computePowerUsage(DayPowerData.powerusage_day);
        System.out.println("totalt strømforbruk en dag er " + stromforbruk + "\n");

        System.out.println("Oppgave d: ");
        double dagsutgift = DailyPower.computeSpotPrice(DayPowerData.powerusage_day, DayPowerData.powerprices_day);
        System.out.printf( "Totalkostnad for strøm denne dagen er: %.2f kr%n", dagsutgift);
        System.out.println();

        System.out.println("Oppgave e: ");
        for (int i = 0; i<DayPowerData.powerusage_day.length; i++){
            double support = DailyPower.getSupport(DayPowerData.powerusage_day[i], DayPowerData.powerprices_day[i]);
            support = Math.round(support * 100.0) / 100.0;
            System.out.println("Du får " + support + "kr i støtte kl: " + i + ":00 \n");
        }

        System.out.println("Oppgave f: ");
        double powerSupport = DailyPower.computePowerSupport(DayPowerData.powerusage_day, DayPowerData.powerprices_day);
        System.out.printf("%.2f kr støtte i dag.%n%n", powerSupport);

        System.out.println("Oppgave g: ");
        double norgesPris = DailyPower.computeNorgesPrice(DayPowerData.powerusage_day);
        System.out.println("Du må betale " + norgesPris + "kr pga norgespris i dag \n");

        System.out.println("Oppgave h: ");
        double maxUsage = DailyPower.findPeakUsage(DayPowerData.powerusage_day);
        System.out.print("Den timen du brukte mest straum, brukte du: " + maxUsage + " kWh \n");

        System.out.println("Oppgave i: ");
        double gForbruk = DailyPower.findAvgPower(DayPowerData.powerusage_day);
        System.out.println("gjennomsnittleg strømforbruk i dag er " + gForbruk + " kWh \n");



        /*

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}
