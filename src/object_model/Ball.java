/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object_model;

import intefaces.BallListener;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author vipvl
 */
public class Ball{
    
    public Image imageBall;
    public int x;
    public int y;
    public int w;
    public int h;
    public BallListener ballListener;
    
    public Rectangle2D getRect2D(){
        return new Shape2D(x, y, w, h);
    }
}
