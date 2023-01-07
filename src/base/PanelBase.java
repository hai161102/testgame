/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import object_model.Player;

/**
 *
 * @author vipvl
 */
public abstract class PanelBase extends JPanel implements KeyListener, MouseListener, MouseMotionListener, Runnable{
    
    protected Thread appThread;
    protected boolean isUp, isDown, isRight, isLeft;
    protected Player player;
    protected final int FPS = 60;
    protected int numAnimator = 0;
    protected int animationCount = 0;

    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelBase(LayoutManager layout) {
        super(layout);
        initView();
    }
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelBase() {
        initView();
    }
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelBase(LayoutManager layout, int width, int height) {
        super(layout);
        this.setPreferredSize(new Dimension(width, height));
        initView();
    }
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelBase(int width, int height) {
        this.setPreferredSize(new Dimension(width, height));
        initView();
    }
    
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelBase(LayoutManager layout, int width, int height, int locX, int locY) {
        super(layout);
        this.setPreferredSize(new Dimension(width, height));
        this.setLocation(locX, locY);
        initView();
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelBase(int width, int height, int locX, int locY) {
        this.setPreferredSize(new Dimension(width, height));
        this.setLocation(locX, locY);
        initView();
    }
    

    @Override
    public void setLayout(LayoutManager mgr) {
        super.setLayout(mgr); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    protected void initView(){
        initBaseView();
        setDefautPlayer();

    }
    public void startApp(){
        
        appThread = new Thread(this);
        appThread.start();
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D graphics2D = (Graphics2D) g;
        drawView(graphics2D);
        graphics2D.dispose();
    }

    

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37 -> isLeft = true;
            case 38 -> isUp = true;
            case 39 -> isRight = true;
            case 40 -> isDown = true;
        }
        //System.out.println("press isUp = " + isUp + ", isDown = " + isDown + ", isLeft = " + isLeft + ", isRight = " + isRight);

    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        switch (e.getKeyCode()) {
            case 37 -> isLeft = false;
            case 38 -> isUp = false;
            case 39 -> isRight = false;
            case 40 -> isDown = false;
        }

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

    @Override
    @SuppressWarnings({"UseSpecificCatch", "SleepWhileInLoop"})
    public void run() {
        
        double drawInterval = 1000000000 / FPS;
        double nextTime = System.nanoTime() + drawInterval;
        
        while (this.appThread != null) {            
            updateUIApp();
            
            repaint();
            
            numAnimator++;
                if (numAnimator == animationCount) {
                    numAnimator = 0;
                }
            try {
                double remainTime = nextTime - System.nanoTime();
                remainTime /= 1000000;
                if (remainTime < 0) {
                    remainTime = 0;
                }
                
                Thread.sleep((long) remainTime);
                nextTime += drawInterval;
                
            } catch (Exception e) {
            }
            
        }
    }

    protected void updateUIApp() {
        var speed = this.player.getSpeed();
        if (isUp || isDown || isLeft || isRight) {
            if (isUp) {
                this.player.setyLoc(this.player.getyLoc() - speed);
            }
            if (isDown) {
                this.player.setyLoc(this.player.getyLoc() + speed);
            }
            if (isLeft) {
                this.player.setxLoc(this.player.getxLoc() - speed);
            }
            if (isRight) {
                this.player.setxLoc(this.player.getxLoc() + speed);
            }
        }
    }

    private void initBaseView() {
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(this);
        this.setFocusable(true);
    }

    public void setDefautPlayer() {
        isUp = isDown = isLeft = isRight = false;
        if (player == null) {
            player = new Player();
            player.setxLoc(0);
            player.setyLoc(0);
            player.setPlayerWidth(50);
            player.setPlayerHeight(50);
            player.setSpeed(5);
        }
        
    }
    
    protected abstract void drawView(Graphics2D graphics2D);
}
