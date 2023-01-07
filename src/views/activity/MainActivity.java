/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.activity;

import base.FrameBase;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import views.activity.childs.MainPanel;
import views.activity.childs.ObjTest;

/**
 *
 * @author vipvl
 */
public class MainActivity extends FrameBase{
    
    private MainPanel mainPanel;

    public MainActivity() {
    }

    public MainActivity(int width, int height) {
        super(width, height);
    }

    public MainActivity(String title) {
        super(title);
    }

    public MainActivity(String title, int width, int height) {
        super(title, width, height);
    }

    @Override
    protected void initView(){
        super.initView();
        mainPanel = new MainPanel(mWidth, mHeight);
        this.add(mainPanel);
        mainPanel.startApp();
        this.setResizable(false);
    }
    

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    
}
