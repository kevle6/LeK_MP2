/**
 * Full name: Kevin Le
 * Student ID: 2406054
 * Chapman email: kevle@chapman.edu
 * Course number and section: CPSC 231-04
 * Mastery Project 2: (Pizza) More Classes
*/

/**
 * The PizzaOrder class stores pizzas in a pizza order and calculates the total cost
 * @author Kevin Le
 * @version 1.0
 * @see PizzaOrder
*/
public class PizzaOrder {
  /** Pizza array representation of the list of Pizza orders */
  private Pizza[] m_order;
  /** int representation of the number of pizzas currently on the list */
  private int m_numPizzas;

  /**
   * Default Constructor for PizzaOrder object
  */
  public PizzaOrder() {
    m_numPizzas = 1;
    m_order = new Pizza[1];
    m_order[0] = new Pizza(); // Default Constructor for Pizza is a small cheese pizza
  }
  /**
   * Overloaded Constructor for PizzaOrder object
   * @param numPizzas the number of Pizzas that will be in the order
  */
  public PizzaOrder(int numPizzas) {
    m_order = new Pizza[numPizzas]; // numPizzas is the length of the array
    m_numPizzas = 0; // m_numPizzas is the current number of pizzas in array
  }

  /**
   * Adds a pizza to the PizzaOrder instance
   * @param pizza The Pizza object being added
   * @return 1 if pizza added successfully, -1 otherwise
  */
  public int addPizza(Pizza pizza) {
    if (m_numPizzas < m_order.length) {
      m_order[m_numPizzas] = pizza;
      ++m_numPizzas;
      return 1;
    }
    return -1;
  }
  /**
   * Calculates the total price of all the pizzas
   * @return total The total price of the entire order
  */
  public double calcTotal() {
    double total = 0.0;
    for (int i = 0; i < m_numPizzas; ++i) {
      total += m_order[i].calcCost(); // Iterates and adds cost of each pizza to total variable
    }
    return total;
  }
  /**
   * Pretty Prints the receipt, the entire order with pizza specifications
   * @return s The receipt as a String
  */
  public String toString() {
    String s = "";
    s += "Total Order: $" + this.calcTotal() + "\n\n";

    for (int i = 0; i < m_numPizzas; ++i) {
      s += m_order[i].toString(); // Iterates and adds each pizza order to Receipt
    }

    return s;
  }

}
