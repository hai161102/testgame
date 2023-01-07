/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package intefaces;

import java.awt.geom.Rectangle2D;
import object_model.Player;

/**
 *
 * @author vipvl
 */
public interface BallListener {
 
    void onInterset(Rectangle2D r);
    void onMove(int x, int y);
    void onKicked(Player player);
}
