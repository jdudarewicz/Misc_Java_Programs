import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankAccountFrame extends JFrame
{
    private BankAccount account;

    private JTextField inputField;
    private JButton withdrawButton;
    private JButton depositButton;
    private JLabel amountLabel;
    private JLabel balanceLabel;

    public BankAccountFrame()
    {
        account = new BankAccount();
        amountLabel = new JLabel("Amount: ");
        balanceLabel = new JLabel("Balance: " + String.format("%.2f", account.getBalance()));
        createTextField();
        createDepositButton();
        createWithdrawButton();
        createPanel();
    }

    private void createTextField()
    {
        inputField = new JTextField("0.00", 20);
    }

    private void createDepositButton()
    {
        depositButton = new JButton("Deposit");

        class AddDepositListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                double textboxAmount = Double.parseDouble(inputField.getText());
                account.deposit(textboxAmount);
                balanceLabel.setText("Balance: " + String.format("%.2f", account.getBalance()));
            }
        }

        ActionListener depositListener = new AddDepositListener();
        depositButton.addActionListener(depositListener);
    }


    private void createWithdrawButton()
    {
        withdrawButton = new JButton("Withdraw");

        class AddWithdrawListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                double textboxAmount = Double.parseDouble(inputField.getText());
                account.withdraw(textboxAmount);
                balanceLabel.setText("Balance: " + String.format("%.2f", account.getBalance()));
            }
        }

        ActionListener withdrawListener = new AddWithdrawListener();
        withdrawButton.addActionListener(withdrawListener);
    }

    private void createPanel()
    {
        JPanel panel = new JPanel();
        panel.add(amountLabel);
        panel.add(inputField);
        panel.add(depositButton);
        panel.add(withdrawButton);
        
        add(panel, BorderLayout.NORTH);
        add(balanceLabel, BorderLayout.CENTER);
    }
}