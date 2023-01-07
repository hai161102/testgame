/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.util.List;
import object_model.Player;

/**
 *
 * @author vipvl
 */
public class Animator {
    private Player player;
    private int index;

    public Animator(Player player, int index) {
        this.player = player;
        this.index = index;
    }

    public Animator() {
    }

    
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    public void draw(Graphics2D graphics2D, int index){
        graphics2D.drawImage(player.getListImage().get(index), player.getxLoc(), player.getyLoc(), player.getPlayerWidth(), player.getPlayerHeight(), null);
    }
}
