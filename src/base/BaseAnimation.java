/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vipvl
 */
public class BaseAnimation extends PanelBase{

    protected List<Image> listImages;
    private int count = 0;
    protected int index = 0;


    @SuppressWarnings("OverridableMethodCallInConstructor")
    public BaseAnimation(List<Image> listImages, LayoutManager layout) {
        super(layout);
        this.listImages = listImages;
        init();
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public BaseAnimation(List<Image> listImages) {
        this.listImages = listImages;
    }
    

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public BaseAnimation(List<Image> listImages, LayoutManager layout, int width, int height) {
        super(layout, width, height);
        this.listImages = listImages;
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public BaseAnimation(List<Image> listImages, int width, int height) {
        super(width, height);
        this.listImages = listImages;
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public BaseAnimation(List<Image> listImages, LayoutManager layout, int width, int height, int locX, int locY) {
        super(layout, width, height, locX, locY);
        this.listImages = listImages;
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public BaseAnimation(List<Image> listImages, int width, int height, int locX, int locY) {
        super(width, height, locX, locY);
        this.listImages = listImages;
    }

    @Override
    protected void initView() {
        init(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    public List<Image> getListImages() {
        return listImages;
        
    }

    public void setListImages(List<Image> listImages) {
        this.listImages = listImages;
    }
    
    
    protected void init(){
        if (listImages == null) {
            listImages = new ArrayList<>();
        }
        count = listImages.size();
    }

    @Override
    @SuppressWarnings({"SleepWhileInLoop", "UseSpecificCatch"})
    public void run() {
        double drawInterval = 1000000000 / FPS;
        double nextTime = System.nanoTime() + drawInterval;
        while (this.appThread != null) {            
            //System.out.println("Game running");
            update(index);
            
            repaint();
            
            try {
                double remainTime = nextTime - System.nanoTime();
                remainTime /= 1000000;
                if (remainTime < 0) {
                    remainTime = 0;
                }
                
                Thread.sleep((long) remainTime);
                nextTime += drawInterval;
                index++;
                if (index == count) {
                    index = 0;
                }
            } catch (Exception e) {
            }
            
        }
    }
   
    protected void update(int index){
        
    }

    @Override
    protected void drawView(Graphics2D graphics2D) {
    }
    
}
