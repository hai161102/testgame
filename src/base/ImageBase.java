/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

/**
 *
 * @author vipvl
 */
public abstract class ImageBase extends Image {
    protected int id;
    protected String name;

    public ImageBase(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ImageBase() {
    }

    @Override
    @SuppressWarnings("InfiniteRecursion")
    public int getWidth(ImageObserver observer) {
        return this.getWidth(observer);
    }

    @Override
    @SuppressWarnings("InfiniteRecursion")
    public int getHeight(ImageObserver observer) {
        return this.getHeight(observer);
    }

    @Override
    @SuppressWarnings("InfiniteRecursion")
    public ImageProducer getSource() {
        return this.getSource();
    }

    @Override
    @SuppressWarnings("InfiniteRecursion")
    public Graphics getGraphics() {
        return getGraphics();
    }

    @Override
    @SuppressWarnings("InfiniteRecursion")
    public Object getProperty(String string, ImageObserver io) {
        return getProperty(string, io);
    }
    
    
}
