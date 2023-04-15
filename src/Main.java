public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("I love Atul");
        System.out.println("I love you too my bhalu!");

        Account devinaAccount = new Account(); //instantiation
        devinaAccount.accountNumber = 3634673;
        devinaAccount.setAccountHolderName("Devina");
        devinaAccount.accountBalance = 35366;

        Account atulAccount = new Account();
        atulAccount.setAccountHolderName("Atul");
        atulAccount.accountNumber = 243636;

        devinaAccount.setPassword("happypascode");

        /**atulAccount, devinaAccount are objects of Account type.
        * the process of creating objects of a class is called instantiation.
        * */

        System.out.println(devinaAccount.getAccountHolderName() + "'s balance is : " + devinaAccount.checkAccountBalance());
        System.out.println(atulAccount.getAccountHolderName() +  "'s balance is : " +  atulAccount.checkAccountBalance());
        System.out.println(atulAccount.getAccountHolderName() + " balance status : " + atulAccount.balanceStatus());

        System.out.println(devinaAccount.getPassword());

    }
}