import java.util.*;
import javax.swing.*;
import java.awt.*;

public class ATM {
    double WithdrawnAmount;
    double DepositedAmount;
    double balance = 10000.00;

    public void Withdraw() {
        Scanner sc = new Scanner(System.in);
        WithdrawnAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount you want to withdraw"));
        if (WithdrawnAmount > balance) {
            JOptionPane.showMessageDialog(null, "Insufficient balance");
        } else {
            balance -= WithdrawnAmount;
            JOptionPane.showMessageDialog(null, "Your balance after withdrawal is: " + balance);
        }
    }

    public void Deposit() {
        Scanner sc = new Scanner(System.in);
        DepositedAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount you want to deposit"));
        balance += DepositedAmount;
        JOptionPane.showMessageDialog(null, "Your balance after deposition is: " + balance);
    }

    public void CheckBalance() {
        JOptionPane.showMessageDialog(null, "Available balance: " + balance);
    }

    public void exit() {
        JOptionPane.showMessageDialog(null, "Closed");
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        userAccount user = atm.new userAccount();
        Font font=new Font("Arial", Font.BOLD | Font.ITALIC, 18);
        JLabel label = new JLabel("WELCOME TO OUR ATM!!");
        label.setFont(font);
        JOptionPane.showMessageDialog(null, label);
        Scanner sc = new Scanner(System.in);
        int n = JOptionPane.showOptionDialog(null, "Click suitable button!!", "ATM Options",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
        new Object[] { "Withdraw Money", "Deposit Money", "Check Balance", "Exit" }, null);
        
        JFrame f = new JFrame("My ATM");
        UIManager.put("OptionPane.minimumSize", new java.awt.Dimension(400, 200));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        switch (n) {
            case 0:
                atm.Withdraw();
                user.userBalance(atm.WithdrawnAmount);
                break;
            case 1:
                atm.Deposit();
                user.userBalance(atm.DepositedAmount);
                break;
            case 2:
                atm.CheckBalance();
                break;
            case 3:
                atm.exit();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please select a valid option");
        }

        JOptionPane.showMessageDialog(null, "Thanks for using our ATM!!...See you Again... :)");
    }

    class userAccount extends ATM {
        public void userBalance(double amount) {
            double userBalance;
        }
    }
}
