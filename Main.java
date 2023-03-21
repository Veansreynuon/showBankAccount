import java.util.*;

class Account{
   private int id;
   private String ownerName;
   private   double balance;
    Account(int id, String ownerName, double balance){
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public int getId(){
        return id;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return id+""+ownerName +" "+balance;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Account> acc = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        String n;
        int i;
        double b;
        int option;
        do{
            System.out.println("------Bank Account--------");
            System.out.println(" 1. Add account ");
            System.out.println(" 2. Remove account ");
            System.out.println(" 3. Edit account ");
            System.out.println(" 4. Show information ");
            System.out.println(" 5. Exit ");
            System.out.print(" Enter your choose ");
            option = input.nextInt();
            switch (option){
                case 1:{
                    System.out.println("===================================");
                    System.out.println("---------- Add Account ----------");
                    System.out.print(" Enter your id : ");
                    i = input.nextInt();
                    System.out.print("Enter your name : ");
                    n = input1.next();
                    System.out.print("Enter your balane: ");
                     b = input.nextDouble();

                    acc.add(new Account(i, n, b));
                    System.out.println("===================================");
                    break;
                }
                case 2:{
                    System.out.println("===================================");
                    boolean found = false;
                    System.out.print("Enter id account to remove : ");
                   i = input.nextInt();
                    System.out.println("---------- Remove Account ----------");
                    Iterator<Account> a = acc.iterator();
                    while (a.hasNext()) {
                        Account v = a.next();
                        if (v.getId() == i) {
                            a.remove();
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Account not found");
                    }
                    else {
                        System.out.println(" Account is removed successfuly!");
                    }
                    System.out.println("===================================");
                    break;
                }
                case 3:{
                    System.out.println("===================================");
                    boolean found = false;
                    System.out.print("Enter id to edit account : ");
                     i = input.nextInt();
                    System.out.println("---------- Edit Account ----------");
                    ListIterator<Account> h = acc.listIterator();
                    while (h.hasNext()){
                        Account v = h.next();
                        if(v.getId()== i){
                            System.out.println("Enter new id : ");
                            i = input.nextInt();
                            System.out.println("Enter new name : ");
                             n = input1.next();
                            System.out.println("Enter new balance: ");
                            b = input.nextInt();
                            h.set(new Account(i,n,b));
                            found = true;
                        }
                    }
                    System.out.println("===================================");
                    break;
                }
                case 4:{
                    System.out.println("===================================");
                    boolean found = false;
                    System.out.println("Enter id to search account : ");
                     i = input1.nextInt();
                    System.out.println("---------- Show Account Information ----------");
                    Iterator<Account> p = acc.iterator();
                    while (p.hasNext()){
                        Account v = p.next();
                        if(v.getId() == i){
                            System.out.println(v);
                            found = true;
                        }
                        else {
                            System.out.println("Information not fount !");
                        }
                    }
                    System.out.println("===================================");
                    break;
                }
                case 5:{
                    System.exit(0);
                }
            }
        }while (option !=5);
    }
}