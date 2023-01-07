/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object_model;

import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.util.List;

/**
 *
 * @author vipvl
 */
public class Player {
    
    private int xLoc;
    private int yLoc;
    private int playerWidth;
    private int playerHeight;
    private int playerID;
    private String playerName;
    private int speed;
    private List<Image> listImage;

    public Player(int xLoc, int yLoc, int playerWidth, int playerHeight, int playerID, String playerName, int speed, List<Image> listImage) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.playerWidth = playerWidth;
        this.playerHeight = playerHeight;
        this.playerID = playerID;
        this.playerName = playerName;
        this.speed = speed;
        this.listImage = listImage;
    }

    

    public Player() {
    }

    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public int getPlayerWidth() {
        return playerWidth;
    }

    public void setPlayerWidth(int playerWidth) {
        this.playerWidth = playerWidth;
    }

    public int getPlayerHeight() {
        return playerHeight;
    }

    public void setPlayerHeight(int playerHeight) {
        this.playerHeight = playerHeight;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public List<Image> getListImage() {
        return listImage;
    }

    public void setListImage(List<Image> listImage) {
        this.listImage = listImage;
    }
    
    public Rectangle2D getRect2D(){
        Shape2D shape2D = new Shape2D(xLoc, yLoc, playerWidth, playerHeight);
        return shape2D;
    }
    
    
    
}
