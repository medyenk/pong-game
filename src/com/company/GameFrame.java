package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class GameFrame extends JFrame {

    GamePanel panel = new GamePanel();

    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
