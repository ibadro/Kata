package Core.Исключения.PZ426;

public class Main {

        public static void main(String[] args) {
            BankClient client1 = new BankClient("Bad");
            BankClient client2 = new BankClient("Problem with law");
            BankClient client3 = new BankClient("Good history");
            BankWorker employee = new BankEmployee();

            System.out.println(getCreditForClient(employee, client1));
            System.out.println(getCreditForClient(employee, client2));
            System.out.println(getCreditForClient(employee, client3));
        }

        public static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {

            try {
                return (bankWorker.checkClientForCredit(bankClient));

            } catch (BadCreditHistoryException badCreditEx) {
                System.out.println("Проблемы с банковской историей");
                return false;
            } catch (ProblemWithLawException e) {
                return false;
            }
        }
    public static class BankEmployee implements BankWorker {
        @Override
        public boolean checkClientForCredit(BankClient client) throws BadCreditHistoryException, ProblemWithLawException{
            if (client.getCreditHistory().equalsIgnoreCase("bad"))
                throw new BadCreditHistoryException();
            else if (client.getCreditHistory().equalsIgnoreCase("problem with law"))
                throw new ProblemWithLawException();
            else return true;
        }
    }
}
