package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();



        Customer c1 = new Customer("sondre", "sondre@email", 1001, PowerAgreementType.SPOTPRICE );

        System.out.println("name: " + c1.getName());
        System.out.println("email: " + c1.getEmail());
        System.out.println("customer_id: " + c1.getCustomer_id());
        System.out.println("agreement: " + c1.getAgreement() + "\n");

        c1.setEmail("sondrea@email");
        System.out.println("email: " + c1.getEmail() + "\n");

        System.out.println("Full utskrift: \n" + c1.toString());

        /*
         Write code that creates a Customer object and teste the methods implemented in the class

        */
    }
}
