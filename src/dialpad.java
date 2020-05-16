import javax.swing.*;
import java.awt.event.*;

public class dialpad {

    long time2=System.nanoTime();
    long time3=System.nanoTime();
    long time4=System.nanoTime();
    long time5=System.nanoTime();
    long time6=System.nanoTime();
    long time7=System.nanoTime();
    long time8=System.nanoTime();
    long time9=System.nanoTime();
    int index2=0;
    int index3=0;
    int index4=0;
    int index5=0;
    int index6=0;
    int index7=0;
    int index8=0;
    int index9=0;
    char a[][]= {{'2','a','b','c'},{'3','d','e','f'},{'4','g','h','i'},{'5','j','k','l'},{'6','m','n','o'},{'8','t','u','v'}};
    char b[][]={{'7','p','q','r','s'},{'9','w','x','y','z'}};
    private JTextArea t;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton clearButton;
    private JButton a0Button;
    private JButton button12;
    private  JPanel p;

    public dialpad() {

        a1Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                t.setText(t.getText()+1);
            }
        });
        a2Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                long temp=System.nanoTime();
                boolean ismulti=false;
                if(temp-time2<=300000000)
                {
                    index2++;
                    ismulti=true;
                    char c=a[0][index2%4];
                    t.setText(t.getText().substring(0,t.getText().length()-1)+c);
                    System.out.println(temp-time2);
                    time2=temp;
                }
                else
                {
                    index2=0;
                    ismulti=false;
                    t.setText(t.getText()+2);
                    System.out.println(temp-time2);
                    time2=temp;
                }

            }
        });
        a3Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                long temp=System.nanoTime();
                boolean ismulti=false;
                if(temp-time3<=300000000)
                {
                    index3++;
                    ismulti=true;
                    char c=a[1][index3%4];
                    t.setText(t.getText().substring(0,t.getText().length()-1)+c);
                    System.out.println(temp-time3);
                    time3=temp;
                }
                else
                {
                    index3=0;
                    ismulti=false;
                    t.setText(t.getText()+3);
                    System.out.println(temp-time3);
                    time3=temp;
                }
            }
        });
        a4Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                long temp=System.nanoTime();
                boolean ismulti=false;
                if(temp-time4<=300000000)
                {
                    index4++;
                    ismulti=true;
                    char c=a[2][index4%4];
                    t.setText(t.getText().substring(0,t.getText().length()-1)+c);
                    System.out.println(temp-time4);
                    time4=temp;
                }
                else
                {
                    index4=0;
                    ismulti=false;
                    t.setText(t.getText()+4);
                    System.out.println(temp-time4);
                    time4=temp;
                }
            }
        });
        a5Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                long temp=System.nanoTime();
                boolean ismulti=false;
                if(temp-time5<=300000000)
                {
                    index5++;
                    ismulti=true;
                    char c=a[3][index5%4];
                    t.setText(t.getText().substring(0,t.getText().length()-1)+c);
                    System.out.println(temp-time5);
                    time5=temp;
                }
                else
                {
                    index5=0;
                    ismulti=false;
                    t.setText(t.getText()+5);
                    System.out.println(temp-time5);
                    time5=temp;
                }
            }
        });
        a6Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                long temp=System.nanoTime();
                boolean ismulti=false;
                if(temp-time6<=300000000)
                {
                    index6++;
                    ismulti=true;
                    char c=a[4][index6%4];
                    t.setText(t.getText().substring(0,t.getText().length()-1)+c);
                    System.out.println(temp-time6);
                    time6=temp;
                }
                else
                {
                    index6=0;
                    ismulti=false;
                    t.setText(t.getText()+6);
                    System.out.println(temp-time6);
                    time6=temp;
                }
            }
        });
        a7Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                long temp=System.nanoTime();
                boolean ismulti=false;
                if(temp-time7<=300000000)
                {
                    index7++;
                    ismulti=true;
                    char c=b[0][index7%5];
                    t.setText(t.getText().substring(0,t.getText().length()-1)+c);
                    System.out.println(temp-time7);
                    time7=temp;
                }
                else
                {
                    index7=0;
                    ismulti=false;
                    t.setText(t.getText()+7);
                    System.out.println(temp-time7);
                    time7=temp;
                }
            }
        });
        a8Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                long temp=System.nanoTime();
                boolean ismulti=false;
                if(temp-time8<=300000000)
                {
                    index8++;
                    ismulti=true;
                    char c=a[5][index8%4];
                    t.setText(t.getText().substring(0,t.getText().length()-1)+c);
                    System.out.println(temp-time8);
                    time8=temp;
                }
                else
                {
                    index8=0;
                    ismulti=false;
                    t.setText(t.getText()+8);
                    System.out.println(temp-time8);
                    time8=temp;
                }
            }
        });
        a9Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                long temp=System.nanoTime();
                boolean ismulti=false;
                if(temp-time9<=300000000)
                {
                    index9++;
                    ismulti=true;
                    char c=b[1][index9%5];
                    t.setText(t.getText().substring(0,t.getText().length()-1)+c);
                    System.out.println(temp-time9);
                    time9=temp;
                }
                else
                {
                    index9=0;
                    ismulti=false;
                    t.setText(t.getText()+9);
                    System.out.println(temp-time9);
                    time9=temp;
                }
            }
        });
        clearButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                t.setText("");
            }
        });
        a0Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                t.setText(t.getText()+0);
            }
        });
        button12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(t.getText()!="")
                t.setText(t.getText().substring(0,t.getText().length()-1));
            }
        });
    }

    public static void main(String[] args) {
        JFrame f= new JFrame("dialpad");
        f.setContentPane(new dialpad().p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

}
