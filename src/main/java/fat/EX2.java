package fat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class OnClickActions implements ActionListener
{
    JTextField inputArea; JTextField outputArea; JFrame parentFrame;
    OnClickActions(JTextField inputTextArea, JTextField outputTextArea, JFrame myFrame)
    { inputArea = inputTextArea; outputArea = outputTextArea; parentFrame = myFrame; }
    @Override
        public void actionPerformed(ActionEvent myAction)
    {
        float dirham, euro;
        try { euro = Float.parseFloat(inputArea.getText()); }
        catch (Exception e)
        { JOptionPane.showMessageDialog(parentFrame, "Wrong type !!");
            return; }
        dirham = Euro2Dirham(euro); outputArea.setText(Float.toString(dirham)); }
        private float Euro2Dirham(float Euro){ return (float) (Euro * 10.95); } }
public class EX2 {
    JFrame myFrame;
    JPanel inputPanel, outputPanel, buttonPanel;
    JTextField inputTextField, outputTextField;
    JLabel inputLabel, outputLabel;
    JButton ConvertButton;
    public EX2(){ outputPanel = new JPanel();
        outputLabel = new JLabel("Dirham");
        outputTextField = new JTextField(20);
        outputTextField.setEditable(false);
        outputPanel.add(outputLabel);
        outputPanel.add(outputTextField);
        inputPanel = new JPanel();
        inputLabel = new JLabel("Euro");
        inputTextField = new JTextField(20);
        inputPanel.add(inputLabel);
        inputPanel.add(inputTextField);
        buttonPanel = new JPanel();
        ConvertButton = new JButton("Convert");
        ConvertButton.addActionListener(new OnClickActions(inputTextField, outputTextField, myFrame));
        buttonPanel.add(ConvertButton);
        myFrame = new JFrame("Currency Converter");
        myFrame.add(inputPanel, BorderLayout.NORTH);
        myFrame.add(outputPanel, BorderLayout.CENTER);
        myFrame.add(buttonPanel, BorderLayout.SOUTH);
        myFrame.setSize(400, 150);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true); }



    public static void main(String[] args)
    { EX2 test = new EX2();
    }
}
