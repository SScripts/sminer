package sminer;


import sminer.cons.Cons;
import sminer.framework.Master;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;


public class gui extends JFrame {
    private final JComboBox<Master> Location = new JComboBox<Master>(Master.values());
    private Master selectedEnum;

    public Master getSelectedEnum() {
        return selectedEnum;
    }
    public gui() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {

        if (e.getSource() ==button1) {

            selectedEnum = (Master) Location.getSelectedItem();

            String ore = comboBox2.getSelectedItem().toString();
            if (ore.equals("Tin")){

                Cons.ROCK = new int[]{11959, 11957, 11958, 11948, 11934, 11933};
            }else if (ore.equals("Iron")) {

                Cons.ROCK = new int[]{11954, 11956, 11955};
            }else if (ore.equals("Clay")) {

                Cons.ROCK = new int[]{15505, 15503};

            }else if (ore.equals("Coal")){

                Cons.ROCK = new int[]{11931,11932,11930};
            }else if (ore.equals("Silver")){

                Cons.ROCK = new int[]{11950, 11949, 11957, 11948};
            }else if (ore.equals("Gold")){

            }else {


            }



        }
        SMiner.startScript();
        this.dispose();



    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents

        label1 = new JLabel();
        final JComboBox<Master> Location = new JComboBox<Master>(Master.values());
        label2 = new JLabel();
        comboBox2 = new JComboBox<>();
        label3 = new JLabel();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("SMiner");
        label1.setForeground(Color.blue);
        label1.setFont(new Font("Source Code Pro", Font.PLAIN, 26));



        //---- label2 ----
        label2.setText("Select Location");

        //---- comboBox2 ----
        comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                "Tin",
                "Iron",
                "Silver",
                "Clay",
                "Coal",
                "Gold",
                "Mithril"
        }));

        //---- label3 ----
        label3.setText("Select the Ore");

        //---- button1 ----
        button1.setText("Start");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(label1, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addGap(31, 31, 31))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(comboBox1, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(comboBox2, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label3, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(button1, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label2, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label2)
                                .addGap(11, 11, 11)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(label3)
                                .addGap(18, 18, 18)
                                .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button1)
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Sebastian Poa
    private JLabel label1;
    private JComboBox<String> comboBox1;
    private JLabel label2;
    private JComboBox<String> comboBox2;
    private JLabel label3;
    private JButton button1;

    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
