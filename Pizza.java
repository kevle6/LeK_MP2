/**
 * Full name: Kevin Le
 * Student ID: 2406054
 * Chapman email: kevle@chapman.edu
 * Course number and section: CPSC 231-04
 * Mastery Project 2: (Pizza) More Classes
*/

/**
 * The Pizza class represents a pizza with a size, number of cheese toppings, number of pepperoni toppings, and number of veggie toppings
 * @author Kevin Le
 * @version 1.0
 * @see Pizza
*/

public class Pizza {
    /** a String representation of the size of the pizza */
    private String m_size;

    /** an integer representation of the number of cheese toppings */
    private int m_numCheese;

    /** an integer representation of the number of pepperoni toppings */
    private int m_numPepperoni;

    /** an integer representation of the number of veggie toppings */
    private int m_numVeggie;

    /**
     * The default constructor of the Pizza class, creating a small cheese pizza
    */
    public Pizza() {
      m_size = "small";
      m_numCheese = 1;
      m_numPepperoni = 0;
      m_numVeggie = 0;
    }

    /**
     * Create a Pizza instance with attributes specified
     * @param size The pizza's size
     * @param numCheese The pizza's number of cheese toppings
     * @param numPepperoni The pizza's number of pepperoni toppings
     * @param numVeggie The pizza's number of veggie toppings
    */
    public Pizza(String size, int numCheese, int numPepperoni, int numVeggie) {
        m_size = size;
        m_numCheese = numCheese;
        m_numPepperoni = numPepperoni;
        m_numVeggie = numVeggie;
    }
    /**
     * The Pizza copy constructor
     * @param p The pizza instance to be copied
    */
    public Pizza(Pizza p) {
        this.m_size = p.m_size;
        this.m_numCheese = p.m_numCheese;
        this.m_numPepperoni = p.m_numPepperoni;
        this.m_numVeggie = p.m_numVeggie;
    }

    /**
     * Accessor for m_size attribute
     * @return a String representing the pizza size
    */
    public String getSize() {
        return m_size;
    }

    /**
     * Accessor for m_numCheese attribute
     * @return an integer representing the pizza's number of cheese toppings
    */
    public int getNumCheese() {
        return m_numCheese;
    }

    /**
     * Accessor for m_numPepperoni attribute
     * @return an integer representing the pizza's number of pepperoni toppings
    */
    public int getNumPepperoni() {
        return m_numPepperoni;
    }

    /**
     * Accessor for m_numVeggie attribute
     * @return an integer representing the pizza's number of veggie toppings
    */
    public int getNumVeggie() {
      return m_numVeggie;
    }

    /**
     * Mutator for m_size attribute
     * @param size the pizza's new size
    */
    public void setSize(String size) {
      m_size = size;
    }

    /**
     * Mutator for m_numCheese attribute
     * @param numCheese the pizza's new number of cheese toppings
    */
    public void setNumCheese(int numCheese) {
      m_numCheese = numCheese;
    }

    /**
     * Mutator for m_numPepperoni attribute
     * @param numPepperoni the pizza's new number of pepperoni toppings
    */
    public void setNumPepperoni(int numPepperoni) {
      m_numPepperoni = numPepperoni;
    }

    /**
     * Mutator for m_numVeggie attribute
     * @param numVeggie the pizza's new number of veggie toppings
    */
    public void setNumVeggie(int numVeggie) {
      m_numVeggie = numVeggie;
    }
    /**
     * Calculates the cost of a pizza based on size and number of toppings
     * @return total the pizza's total price
    */
    public double calcCost() {
      double total = 0.0;
      if (m_size == "small") { // Small Pizza is $10
        total += 10.0;
      }
      else if (m_size == "medium") { // Medium Pizza is $12
        total += 12.0;
      }
      else if (m_size == "large") { // Large Pizza is $14
        total += 14.0;
      }

      // Add Up Number of Toppings
      int numToppings = this.getNumCheese() + this.getNumPepperoni() + this.getNumVeggie();
      double toppingTotal = 2.0 * numToppings; // Cost of All Toppings
      total += toppingTotal;
      return total;
    }
    /**
     * Pretty Prints the Pizza instance with Size, number of each topping, and total
     * @return rep The pizza attributes as a String
    */
    public String toString() { // Puts Pizza Specifications into Single String
      String rep = "";
      rep += "Pizza Size: " + m_size;
      rep += "\n" + m_numCheese + " cheese toppings.";
      rep += "\n" + m_numPepperoni + " pepperoni toppings.";
      rep += "\n" + m_numVeggie + " veggie toppings.";
      rep += "\nPizza cost: $" + calcCost() + "\n\n"; // Utilizes calcCost() for each pizza

      return rep;
    }
    /**
     * Determines if two Pizza objects are equal
     * @param o the Object being compared to
     * @return true if same memory address or same attribute values, false otherwise
    */
    public boolean equals(Object o) {
      if (this == o) { // if same memory address
        return true;
      }
      else if (!(o instanceof Pizza)) { // if not a Pizza instance
        return false;
      }
      Pizza p = (Pizza)o; // Cast Object o to Pizza
      return ((m_size.equals(p.m_size)) &&
              (m_numCheese == p.m_numCheese) &&
              (m_numPepperoni == p.m_numPepperoni) &&
              (m_numVeggie == p.m_numVeggie)); // attributes equal each other
    }
}
