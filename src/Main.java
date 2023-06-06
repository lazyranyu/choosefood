import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] foods = new String[12];
        foods[0]="瓦香鸡";
        foods[1]="烤盘饭";
        foods[2]="麻辣拌";
        foods[3]="石锅饭";
        foods[4]="饺子";
        foods[5]="汉堡";
        foods[6]="铁板鸡排饭";
        foods[7]="鸡扒饭";
        foods[8]="水煮饭";
        foods[9]="外卖";
        foods[10]="面";
        foods[11]="烤鸭饭";
        Random random=new Random();
        int choice= random.nextInt(12);
        //System.out.println(foods[choice]);
        JFrame jFrame=new JFrame("饭之选择");
        jFrame.setSize(400,400);
        JPanel jPanel=new JPanel(null);
        jPanel.setBounds(0,0,400,400);
        JButton jButton1=new JButton("让吉祥决定吃什么吧！！！");
        jButton1.setBounds(50,10,300,50);
        Font font=new Font("宋体",Font.BOLD,20);
        jButton1.setFont(font);
        Border border1=BorderFactory.createLineBorder(Color.PINK,10,true);
        jButton1.setBorder(border1);
        JTextArea jTextArea=new JTextArea(3,1);
        jTextArea.setLineWrap(true);
        jTextArea.setBounds(100,100,200,200);
        jTextArea.setFont(font);
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result="";
                result="吉祥今天建议你吃："+foods[choice]+"!";
                jTextArea.setText(result);
            }
        });
        jPanel.add(jButton1);
        jPanel.add(jTextArea);
        jFrame.setContentPane(jPanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}