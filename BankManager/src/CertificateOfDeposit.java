import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class CertificateOfDeposit extends BankAccount {
    private LocalDate expiry;

    public CertificateOfDeposit(String account, double balance, LocalDate expiry) {
        super(account, balance);
        this.expiry = expiry;
    }

    public LocalDate getExpiry() {
        return expiry;
    }

    public void setExpiry(LocalDate expiry) {
        LocalDate today = LocalDate.now();
        LocalDate next4Week = today.plus(4, ChronoUnit.WEEKS);
        if(expiry.isAfter(next4Week)){
            this.expiry = expiry;
        }else {
            System.out.println("Expiry must be greater than: " + next4Week);
        }
    }
}
