import java.util.Enumeration;

public class HtmlStatement extends Statement {
  
String getResultText(Customer aCustomer) {
    return "<H1>Rentals for <EM>" + aCustomer.getName() +
        "</EM></H1><P>\n";
  }

String getResultMovie(Rental rental) {
    return rental.getMovie().getTitle() + ": " +
        String.valueOf(rental.getCharge()) + "<BR>\n";
  }

String addFooter(Customer aCustomer) {
    String result = "";
    result += "<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    result += "On this rental you earned <EM>" +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
    return result;
  }
}