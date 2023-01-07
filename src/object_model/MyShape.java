/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object_model;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author vipvl
 */
public class MyShape implements Shape{
    
    private int locX;
    private int locY;
    private int width;
    private int height;

    public MyShape(int locX, int locY, int width, int height) {
        this.locX = locX;
        this.locY = locY;
        this.width = width;
        this.height = height;
    }

    public MyShape() {
    }

    public int getLocX() {
        return locX;
    }

    public void setLocX(int locX) {
        this.locX = locX;
    }

    public int getLocY() {
        return locY;
    }

    public void setLocY(int locY) {
        this.locY = locY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    

    @Override
    public Rectangle getBounds() {
        return new Rectangle(locX, locY, width, height);
    }

    @Override
    public Rectangle2D getBounds2D() {
        return new Shape2D(locX, locY, width, height);
    }

    @Override
    public boolean contains(double x, double y) {
        return x >= locX && x <= locX + width && y >= locY && y <= locY + height;
    }

    @Override
    public boolean contains(Point2D p) {
        return contains(p.getX(), p.getY());
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        if (locX < x) {
            if (locY < y) {
                if (locY + height >= y && locX + width >= x) {
                    return true;
                }
            }
            else if (locY > y){
                if (y + h >= locY && locX + width >= x) {
                    return true;
                }
            }
            else {
                if (locX + width >= x) {
                    return true;
                }
            }
        }
        else if (locX > x) {
            if (locY < y) {
                if (locY + height >= y && locX <= x + w) {
                    return true;
                }
            }
            else if (locY > y){
                if (y + h >= locY && locX <= x + w) {
                    return true;
                }
            }
            else {
                if (locX <= x + w) {
                    return true;
                }
            }
        }
        else {
             if (locY < y) {
                if (locY + height >= y) {
                    return true;
                }
            }
            else if (locY > y){
                if (y + h >= locY) {
                    return true;
                }
            }
            else {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        if (width > w && height > h) {
            if (x > locX && y > locY && x + w < locX + width && y + h < locY + height) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return getPathIterator(at);
    }
    

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return getPathIterator(at, flatness);
    }
    
}
