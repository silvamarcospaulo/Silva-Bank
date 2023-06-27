import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private int accountNumber;
    private String cardholder;//Nome do Portador do Cartão

    private String cpf;

    private String birthDay;

    private double limit;
    private double balance = 0;//Saldo da conta.
    private List <Credit> credit;

    public CreditCard (String cardholder, String cpf, String birthDay){
        this.cardholder = cardholder;
        this.cpf = cpf;
        this.birthDay = birthDay;
        this.limit = 500;
        this.balance = limit;
        this.accountNumber = this.setAccountNumber();
        this.credit = new ArrayList<>();
    }

    private int setAccountNumber() {//Para gerar um número aleatório entre 1 e 10.
        Random generator = new Random();
        this.accountNumber = generator.nextInt(10)+1;
        return this.accountNumber;
    }

    //Método para cadastrar uma compra.
    public boolean addCredit(Credit credit){
        if (this.balance >= credit.getValue()){
            this.balance -= credit.getValue();
            this.credit.add(credit);
            return true;
        }
        return false;
    }

    //Métodos Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCardholder() {
        return cardholder;
    }

    public double getBalance() {
        return balance;
    }

    public List<Credit> getCredit() {
        return credit;
    }
}