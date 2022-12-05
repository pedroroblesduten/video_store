import java.util.Enumeration;

public abstract class Statement {
  abstract String getResultText(Customer aCustomer);

  abstract String getResultMovie(Rental rental);

  abstract String addFooter(Customer aCustomer);

  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = getResultText(aCustomer);
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      // show figures for each rental
      result += getResultMovie(each);
    }
    // add footer lines
    result += addFooter(aCustomer);
    return result;
  }
}