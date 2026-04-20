package com.tenco.callback.ch02;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements IButtonCallback {

    private int count = 0;
    private JLabel label;


    public MainFrame() {
        setSize(300, 200);
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("현재 숫자 : " + count);
        label.setFont(new Font("맑은 고딕", Font.BOLD, 25 ));

        add(label);
        setVisible(true);

        SubFrame subFrame = new SubFrame(this::clickPlusButton);
    }

    @Override
    public void clickPlusButton() {
        count++;
        label.setText("현재 숫자 : " + count);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
