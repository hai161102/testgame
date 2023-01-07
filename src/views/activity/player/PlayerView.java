/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.activity.player;

import base.BaseAnimation;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.util.List;
import object_model.Player;

/**
 *
 * @author vipvl
 */
public class PlayerView extends BaseAnimation{
    
    private Player player;

    public PlayerView(Player player, List<Image> listImages, LayoutManager layout) {
        super(listImages, layout);
        this.player = player;
    }

    public PlayerView(Player player, List<Image> listImages) {
        super(listImages);
        this.player = player;
    }

    public PlayerView(Player player, List<Image> listImages, LayoutManager layout, int width, int height) {
        super(listImages, layout, width, height);
        this.player = player;
    }

    public PlayerView(Player player, List<Image> listImages, int width, int height) {
        super(listImages, width, height);
        this.player = player;
    }

    public PlayerView(Player player, List<Image> listImages, LayoutManager layout, int width, int height, int locX, int locY) {
        super(listImages, layout, width, height, locX, locY);
        this.player = player;
    }

    public PlayerView(Player player, List<Image> listImages, int width, int height, int locX, int locY) {
        super(listImages, width, height, locX, locY);
        this.player = player;
    }

    public PlayerView(List<Image> listImages, LayoutManager layout) {
        super(listImages, layout);
    }

    @Override
    protected void init() {
        super.init();
        
    }

    @Override
    protected void drawView(Graphics2D graphics2D) {
        super.drawView(graphics2D);
        graphics2D.drawImage(listImages.get(index), player.getxLoc(), player.getyLoc(), player.getPlayerWidth(), player.getPlayerHeight(), this);

    }
    
    
    
    
    
    
}
