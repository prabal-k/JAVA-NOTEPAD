import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForFrame implements ActionListener {
    JFrame frame=new JFrame();
    JTextArea textarea= new JTextArea();
    JButton button=new JButton();
   void  ForFramecalc()
    {
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);

        //for textAREA
        textarea.setSize(1000,670);
        textarea.setForeground(new Color(0));
        textarea.setFont(new Font("Ink free",Font.BOLD,20));
        frame.add(textarea);

        //for save button
        button.setBounds(460,680,130,70);
        button.setFont(new Font("Ink free",Font.BOLD,30));
        button.setText("SAVE");
        button.setForeground(Color.GREEN);
        frame.add(button);


        button.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            For_file file=new For_file();
            try {
                file.Calculation(this);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        JOptionPane.showMessageDialog(frame,"Save Sucessfully");
    }

}
