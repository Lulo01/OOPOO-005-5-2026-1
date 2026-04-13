package bank;

public class Bank {

  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;
  private CheckingAccount accountThree;
  private CheckingAccount accountFour;
  
  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
    accountThree = new CheckingAccount("Ares", 2800, "3");
    accountFour = new CheckingAccount("Hera", 900, "4");
  }

        
  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println("Nombre\tID\tBalance");
    System.out.println(bankOfGods.accountOne.getName()+"\t"+bankOfGods.accountOne.getId()+"\t"+bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountTwo.getName()+"\t"+bankOfGods.accountTwo.getId()+"\t"+bankOfGods.accountTwo.getBalance());
    System.out.println(bankOfGods.accountThree.getName()+"\t"+bankOfGods.accountThree.getId()+"\t"+bankOfGods.accountThree.getBalance());
    System.out.println(bankOfGods.accountFour.getName()+"\t"+bankOfGods.accountFour.getId()+"\t"+bankOfGods.accountFour.getBalance());
    
  }
}