import java.util.Enumeration;

public class HtmlStatement extends Statement {
  
  private String getResultText(Customer aCustomer) {
    return "<H1>Rentals for <EM>" + aCustomer.getName() +
        "</EM></H1><P>\n";
  }

  private String getResultMovie(Rental rental) {
    return rental.getMovie().getTitle() + ": " +
        String.valueOf(rental.getCharge()) + "<BR>\n";
  }

  private String addFooter(Customer aCustomer) {
    String result = "";
    result += "<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    result += "On this rental you earned <EM>" +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
    return result;
  }

 public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = getResultText(aCustomer);
    while (rentals.hasMoreElements()) {
       Rental each = (Rental) rentals.nextElement();
       //show figures for each rental
       result += getResultMovie(each);
    }
    //add footer lines
    result += addFooter(aCustomer);
    return result;
 }

}