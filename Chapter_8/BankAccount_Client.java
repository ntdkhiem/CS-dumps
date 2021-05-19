public class BankAccount_Client {
    public static void main(){
        BankAccount ben = new BankAccount("Ben");
        ben.deposit(80.00);
        BankAccount hal = new BankAccount("Hal");
        hal.deposit(20.00);
        ben.transfer(hal, 20.00); // ben $55, hal $40 (ben -$25, hal +$20)
        System.out.println(ben + " " + hal);
        ben.transfer(hal, 10.00); // ben $40, hal $50 (ben -$15, hal +$10)
        System.out.println(ben + " " + hal);
        hal.transfer(ben, 60.00); // ben $85, hal $ 0 (ben +$45, hal -$50)
        System.out.println(ben + " " + hal);
    }
}