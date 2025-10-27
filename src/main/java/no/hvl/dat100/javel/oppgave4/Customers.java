package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {
        this.customers = new Customer[size];
    }

    // b) count number of non-null references
    public int countNonNull() {


        int count = 0;

        for (Customer c : this.customers) {
            if (c != null) {
                count++;
            }
        }
        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        /*Customer c = null;
        for (Customer d : customers){
            if ( d != null && d.getCustomer_id()==customer_id){
                c = d;
            }
        }
        return c;
        */

        boolean funnet = false;
        Customer c = null;
        while (!funnet ){

        }

    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        // TODO

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;

        // TODO

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] customers = null;

        // TODO

        return customers;
    }
}