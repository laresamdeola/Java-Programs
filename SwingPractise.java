import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// ActionListener Class
/*
public class MyFrame extends JFrame implements ActionListener{
  
  JButton button;
  
  MyFrame(){

    button = new JButton();
    button.setBounds(200, 100, 100, 50);
    button.addActionListener(this);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(500,500);
    this.setVisible(true);
    this.add(button);
  }
  
  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == button){
      System.out.println("Button pressed");
    }
  }
  
}
*/

//Lambda Expressions

public class MyFrame extends JFrame {

  JButton button;

  MyFrame() {

    ImageIcon icon = new ImageIcon("");

    button = new JButton();
    button.setBounds(200, 100, 100, 50);
    button.setBackground(Color.yellow);
    button.setText("Pay");
    button.setFocusable(false);
    button.setIcon(icon);
    button.addActionListener(e -> System.out.println("Shorter Version"));
    button.setHorizontalAlignment(JButton.CENTER);
    button.setVerticalAlignment(JButton.BOTTOM);
    button.setFont(new Font("Comic Sans", Font.BOLD, 25));
    button.setIconTextGap(-15);
    button.setForeground(Color.cyan);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(500, 500);
    this.setVisible(true);
    this.add(button);
  }
}