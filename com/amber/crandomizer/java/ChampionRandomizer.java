package com.amber.crandomizer.java;

// Created By Andrés Cava


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;


public class ChampionRandomizer {
    private JButton exit;
    private JPanel panel1;
    private JButton randomizeButton;
    private JLabel champ2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;

    Random Randomizer = new Random();

    public static void main(String... args) {




        JFrame frame = new JFrame("Champion Randomizer");
        frame.setContentPane(new ChampionRandomizer().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

     //   String c1 = ChampionList.get(x);
     //   System.out.println(c1+" Top");
    }
    public ChampionRandomizer() {
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        randomizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChampionListClass obj1 = new ChampionListClass();
                List<String> ChampionList = obj1.getList();
                int x1 = Randomizer.nextInt(147);
                int x2 = Randomizer.nextInt(147);
                int x3 = Randomizer.nextInt(147);
                int x4 = Randomizer.nextInt(147);
                int x5 = Randomizer.nextInt(147);
                String c1 = ChampionList.get(x1);
                String c2 = ChampionList.get(x2);
                String c3 = ChampionList.get(x3);
                String c4 = ChampionList.get(x4);
                String c5 = ChampionList.get(x5);

                label1.setText(c1);
                label2.setText(c2);
                label3.setText(c3);
                label4.setText(c4);
                label5.setText(c5);
                if(c1 == "Renekton"){
                    System.out.println("a");

                }
            }
        });
    }

    private void createUIComponents() {
        champ2 = new JLabel(new ImageIcon("champ2"));
    }
}