package Core.Исключения.PZ426;

public interface BankWorker {
    boolean checkClientForCredit(BankClient client) throws BadCreditHistoryException, ProblemWithLawException;

}
