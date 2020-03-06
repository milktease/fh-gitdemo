import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ex5 implements ActionListener {
    private JFrame jf = new JFrame();
    private JPanel jp = new JPanel();
    private JLabel lbl = new JLabel("Enter an Integer" );
    private JTextField txt = new JTextField();
    private JButton btn1 = new JButton( "Check" );
    private JButton btn2 = new JButton( "Reset");

    private JButton btn00 = new JButton( "0" );    
    private JButton btn01 = new JButton( "1" );
    private JButton btn02 = new JButton( "2" );
    private JButton btn03 = new JButton( "3" );    
    private JButton btn04 = new JButton( "4" );    
    private JButton btn05 = new JButton( "5" );
    private JButton btn06 = new JButton( "6" );
    private JButton btn07 = new JButton( "7" );
    private JButton btn08 = new JButton( "8" );
    private JButton btn09 = new JButton( "9" );

    
    public Ex5(){
    jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    jf.setTitle( "Ex 5. Labels" );
    jp.setBackground( Color.YELLOW );
    jp.setPreferredSize( new Dimension( 250, 170 ) ); // width by length in pixels
    jp.setLayout( null ); // allows us to specify the exact location of each component
    // setting the layout to null is not recommended but we’ll do it anyway

    lbl1.setBounds( 10, 10, 100, 30 );
    txt1.setBounds( 120, 10, 70, 30 );
    lbl2.setBounds( 10, 50, 100, 30);
    txt2.setBounds( 120, 50, 70, 30 );
    
    btn1.setBounds( 10, 90, 110, 30 );
    btn2.setBounds( 125, 90, 110, 30 );
    lbls.setBounds( 10, 120, 110, 30 );
    
    jp.add( lbl );
    jp.add( txt );

    jp.add( btn1 );
    jp.add( btn2 );
    btn1.addActionListener( this ); // discussed on the next page
    btn2.addActionListener( this );
    jf.getContentPane().add( jp ); // add the JPanel object to the JFrame object
    jf. pack(); // size the JFrame object around the JPanel object
}

public void actionPerformed(ActionEvent e) {
    String tt1 = txt1.getText(); // returns what is in the text field
    String tt2 = txt2.getText(); 
    int t1 = Integer.parseInt(tt1);
    int t2 = Integer.parseInt(tt2);
    if (e.g etSource().equals(btn1) ) {
        int sum = t1 + t2;
        lbls.setText( t1 + " + " + t2 + " = " + sum);
    } else {
        int diff = t1 - t2;
        lbls.setText( t1 + " - " + t2 + " = " + diff);
    }
}
public void display() {
    EventQueue.invokeLater(new Runnable() {
        public void run() {
            jf.setVisible(true);
        }
} );
}
}
