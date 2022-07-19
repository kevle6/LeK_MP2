/**
 * Full name: Kevin Le
 * Student ID: 2406054
 * Chapman email: kevle@chapman.edu
 * Course number and section: CPSC 231-04
 * Mastery Project 2: (Pizza) More Classes
*/

/*
Description: A program to create an order of Pizza objects
             and calculating the total with a receipt
*/

/**
 * The PizzaDriver class simulates a Pizza Order being made, utilizing the PizzaOrder and Pizza classes
 * @author Kevin Le
 * @version 1.0
 * @see PizzaDriver
*/

public class PizzaDriver {
  public static void main(String[] args) {
    Pizza pizza1 = new Pizza("small", 1, 0, 1); // Creating a small pizza, 1 cheese, 1 veggie
    Pizza pizza2 = new Pizza("large", 2, 2, 0); // Creating a large pizza, 2 cheese, 2 pepperoni
    Pizza pizza3 = new Pizza(pizza2); // Same as pizza 2, used copy constructor
    Pizza pizza4 = new Pizza(pizza1); // Same as pizza 1, used copy constructor

    Pizza pizza5 = new Pizza("large", 1, 1, 2); // test pizza to make sure it costs $22
    System.out.println("\n"+pizza5);

    PizzaOrder testOrder = new PizzaOrder(); // test the PizzaOrder Default Constructor
    System.out.println(testOrder);

    PizzaOrder order = new PizzaOrder(3); // Create an order of THREE pizzas

    System.out.println(order.addPizza(pizza1)); // Add pizza1 to the order
    System.out.println(order.addPizza(pizza2)); // Add pizza2 to the order
    System.out.println(order.addPizza(pizza3)); // Add pizza3 to the order
    System.out.println(order.addPizza(pizza4)+"\n"); // Add pizza4 to the order – does not add pizza4

    System.out.println(pizza1.equals(pizza3)); // Checks to see if pizza3 is the same as pizza1
    System.out.println(pizza1.equals(pizza4)+"\n"); // Checks to see if pizza4 is the same as pizza1

    System.out.println(order); // Outputs receipt

  }
}
