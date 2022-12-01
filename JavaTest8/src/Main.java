// lsy
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame {
    public Main() {
        ArrayList<JTextField> jtfs = new ArrayList<>();// 用于保存文本框
        Container c = this.getContentPane();
        JPanel jp = new JPanel();
        int row = 9;// 行数
        int col = 2;// 列数
        int[] array = new int[8];
        jp.setLayout(new GridLayout(row, col, 5, 5));
        JLabel jtf1 = new JLabel("排序前数值序列");
        JLabel jtf2 = new JLabel("排序后数值序列");
        jp.add(jtf1);
        jp.add(jtf2);
        for (int i = 0; i < 16; i++) {
            JTextField jtf = new JTextField("");
            jtf.setEditable(false);// 不允许编辑表格
            jtfs.add(jtf);
            jp.add(jtf);
        }
        c.add(jp);

        JPanel jp1 = new JPanel();
        final JButton jb = new JButton("随机生成");
        final JButton jbOut = new JButton("排序");
        Dimension preferredSize = new Dimension(150, 30); // 设置尺寸
        jb.setPreferredSize(preferredSize);
        jbOut.setPreferredSize(preferredSize);
        jp1.add(jb);
        jp1.add(jbOut);
        c.add(jp1, BorderLayout.SOUTH);

        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();// 创建随机数对象
                for (int i = 0; i < array.length; i++) {// 初始化数组元素
                    array[i] = random.nextInt(50);// 生成50以内的随机数
                }
                int i = 0;// 将i重置为0
                for (int a = 0; a < jtfs.size(); a++) {
                    if (a % 2 == 0) {
                        jtfs.get(a).setText(array[i] + "");
                        i++;

                    }

                }

            }
        });

        jbOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int temp;
                // 根据角标进行比较，
                for (int i = 0; i < array.length; i++) {
                    // j是数组的最后一个角标
                    for (int j = array.length - 1; j > i; j--) {
                        if (array[j] < array[j - 1]) {
                            // 从后往前进行比较，小数往前，一轮之后最小数就在最前面了
                            temp = array[j - 1];
                            array[j - 1] = array[j];
                            array[j] = temp;
                        }
                    }
                }
                int i = 0;// 将i重置为0
                for (int a = 0; a < jtfs.size(); a++) {
                    if (a % 2 != 0) {
                        jtfs.get(a).setText(array[i] + "");
                        i++;
                    }

                }
            }
        });
        this.setBounds(160, 250, 330, 350);
        this.setTitle("主窗体");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
