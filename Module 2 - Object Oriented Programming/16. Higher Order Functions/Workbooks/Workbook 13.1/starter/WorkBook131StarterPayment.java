import java.time.LocalDate;

public class WorkBook131StarterPayment {
    private LocalDate date;
    private double amount;
  
    public WorkBook131StarterPayment(LocalDate date, double amount) {
      this.date = date;
      this.amount = amount;
    }
  
    public LocalDate getDate() {
      return date;
    }
  
    public double getAmount() {
      return amount;
    }
  }
  
