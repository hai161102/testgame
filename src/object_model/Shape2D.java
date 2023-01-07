/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object_model;

import java.awt.geom.Rectangle2D;

/**
 *
 * @author vipvl
 */
public class Shape2D extends Rectangle2D.Double{

    public Shape2D() {
    }

    public Shape2D(double x, double y, double w, double h) {
        super(x, y, w, h);
    }

    @Override
    public Rectangle2D getBounds2D() {
        return super.getBounds2D();
    }

    @Override
    public void setRect(Rectangle2D r) {
        super.setRect(r);
    }

    
    @Override
    public void setRect(double x, double y, double w, double h) {
        super.setRect(x, y, w, h);
    }

    @Override
    @SuppressWarnings("InfiniteRecursion")
    public int outcode(double x, double y) {
        return super.outcode(x, y);
    }

    @Override
    @SuppressWarnings("InfiniteRecursion")
    public Rectangle2D createIntersection(Rectangle2D r) {
        return super.createIntersection(r);
    }

    @Override
    @SuppressWarnings("InfiniteRecursion")
    public Rectangle2D createUnion(Rectangle2D r) {
        return super.createUnion(r);
    }

    @Override
    public double getX() {
        return super.getY();
    }

    @Override
    public double getY() {
        return super.getY();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    @SuppressWarnings("null")
    public boolean isEmpty() {
        return super.isEmpty();
    }
    
}
