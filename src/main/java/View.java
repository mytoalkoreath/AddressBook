import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View implements ActionListener {
    private Controller c;
    private JFrame frame;
    private JPanel panel;
    private JPanel nPanel;
    private JPanel cPanel;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextArea tA;




    public View(Controller c){
        this.c=c;

    }
//    public View(){
//
//    }

    public void init(){
        //Creating the Frame
        frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);



        //Creating the panel at bottom and adding components
        panel = new JPanel(); // the panel is not visible in output
        JLabel Name = new JLabel("Name:");
        tf1 = new JTextField(10); // accepts upto 10 characters
        JLabel pNumber = new JLabel("Phone Number:");
        tf2 = new JTextField(10); // accepts upto 10 characters
        JButton add = new JButton("Add");
        add.addActionListener(this);

        panel.add(Name); // Components Added using Flow Layout
        panel.add(tf1);
        panel.add(pNumber); // Components Added using Flow Layout
        panel.add(tf2);
        panel.add(add);



        nPanel = new JPanel();
        JLabel Number = new JLabel("Name:");
        tf3 = new JTextField(10);
        JButton remove = new JButton("Remove");

        remove.addActionListener(this);
        nPanel.add(Number);
        nPanel.add(tf3);
        nPanel.add(remove);


        cPanel = new JPanel();
        tA = new JTextArea();
        cPanel.add(tA);



        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.NORTH, nPanel);
        frame.getContentPane().add(BorderLayout.CENTER, cPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.setVisible(true);
    }

    public static void main(String args[]){
        AddressBook a = new AddressBook("Book 1");
        Controller c = new Controller(a);
        View v = new View(c);


    }

    public void actionPerformed(ActionEvent a) {
        JButton button =(JButton)a.getSource();
        String action = button.getText();

        if(action.equals("Remove")){
//            System.out.println("Remove");
            String rName = tf3.getText();
            tf3.setText("");
            c.removeBuddy(rName);
            tA.setText(c.getText());
            frame.setVisible(true);


        }if(action.equals("Add")){
//            System.out.println("Add");
            String Name = tf1.getText();
            String Number = tf2.getText();
            tf1.setText("");
            tf2.setText("");
            c.addBuddy(Name, Number);
            tA.setText(c.getText());
            frame.setVisible(true);
        }


    }


}
