/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author vipvl
 */
public abstract class LabelBase extends JLabel implements KeyListener, MouseListener, MouseMotionListener{

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LabelBase(String text, Icon icon, int horizontalAlignment) {
        super(text, icon, horizontalAlignment);
        initView();
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LabelBase(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LabelBase(String text) {
        super(text);
        initView();
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LabelBase(Icon image, int horizontalAlignment) {
        super(image, horizontalAlignment);
        initView();
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LabelBase(Icon image) {
        super(image);
        initView();
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LabelBase() {
        initView();
    }
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LabelBase(String text, Icon icon, int horizontalAlignment, int width, int height, int locX, int locY) {
        super(text, icon, horizontalAlignment);
        this.setBounds(locX, locY, width, height);
        initView();
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LabelBase(String text, int horizontalAlignment, int width, int height, int locX, int locY) {
        super(text, horizontalAlignment);
        this.setBounds(locX, locY, width, height);
        initView();
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LabelBase(String text, int width, int height, int locX, int locY) {
        super(text);
        this.setBounds(locX, locY, width, height);
        initView();
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LabelBase(Icon image, int horizontalAlignment, int width, int height, int locX, int locY) {
        super(image, horizontalAlignment);
        this.setBounds(locX, locY, width, height);
        initView();
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LabelBase(Icon image, int width, int height, int locX, int locY) {
        super(image);
        this.setBounds(locX, locY, width, height);
        initView();
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LabelBase(int width, int height, int locX, int locY) {
        this.setBounds(locX, locY, width, height);
        initView();
    }
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    protected void initView(){
    }

    @Override
    public void setLayout(LayoutManager mgr) {
        super.setLayout(mgr); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
