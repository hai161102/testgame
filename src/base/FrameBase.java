/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.awt.LayoutManager;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author vipvl
 */
public abstract class FrameBase extends JFrame implements KeyListener, MouseListener, MouseMotionListener{

    protected int mWidth;
    protected int mHeight;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FrameBase() {
        initView();
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FrameBase(int width, int height) {
        this.setSize(width, height);
        this.mWidth = width;
        this.mHeight = height;
        initView();
    }
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FrameBase(String title){
        super(title);
        initView();
    }
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FrameBase(String title, int width, int height){
        super(title);
        this.setSize(width, height);
        this.mWidth = width;
        this.mHeight = height;
        initView();
    }
    
    protected void initView(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public void setLayout(LayoutManager manager) {
        super.setLayout(manager); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void setWidth(int width){
        this.setSize(width, this.getHeight());
        this.mWidth = width;
    }
    
    public void setHeight(int height){
        this.setSize(this.getWidth(), height);
        this.mHeight = height;

    }
    
}
