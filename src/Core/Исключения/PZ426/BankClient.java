package Core.Исключения.PZ426;

public class BankClient {
    private String creditHistory;

    public BankClient(String creditHistory){
        this.creditHistory = creditHistory;
    }

    public String getCreditHistory(){
        return creditHistory;
    }
}
