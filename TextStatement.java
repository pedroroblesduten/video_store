public class TextStatement extends Statement {
  
String getResultText(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() + "\n";
  }

String getResultMovie(Rental rental) {
    
    return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
  }

String addFooter(Customer aCustomer) {
    
    String result = "";
    result += "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
    result += "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
    return result;
  }
}