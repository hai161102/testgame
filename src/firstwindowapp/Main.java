/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstwindowapp;

import javax.swing.JFrame;
import views.activity.MainActivity;

/**
 *
 * @author vipvl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static MainActivity mainActivity;
    public static final float scaleSize = 1.5f;
    public static void main(String[] args) {
        // TODO code application logic here
        mainActivity = new MainActivity("First App", (int) (900 * scaleSize), (int) (450 * scaleSize));
        mainActivity.pack();
        mainActivity.setVisible(true);
    }
    
}
