/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.activity.childs;

import base.PanelBase;
import firstwindowapp.Main;
import intefaces.BallListener;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import object_model.Ball;
import object_model.Player;
import utils.Animator;
import utils.FileUtils;
import utils.ImageUtils;
import views.activity.player.PlayerView;

/**
 *
 * @author vipvl
 */
public class MainPanel extends PanelBase implements Runnable{
    
    private final String bgResPath = "C:\\Users\\vipvl\\OneDrive - Dai Nam University\\Documents\\NetBeansProjects\\FirstWindowApp\\res\\background";
    private final String textResPath = "C:\\Users\\vipvl\\OneDrive - Dai Nam University\\Documents\\NetBeansProjects\\FirstWindowApp\\res\\text";
    private final String animatorResPath = "C:\\Users\\vipvl\\OneDrive - Dai Nam University\\Documents\\NetBeansProjects\\FirstWindowApp\\res\\animation";
    private final String drawableRes = "C:\\Users\\vipvl\\OneDrive - Dai Nam University\\Documents\\NetBeansProjects\\FirstWindowApp\\res\\drawable";
    private final int mapCol = 100;
    private final int mapRow = 100;
    private int iH = (int) (90 * Main.scaleSize);
    private int iW = (int) (90 * Main.scaleSize);
    private List<File> listFileBG;
    private List<Image> listImages;
    private int[][] matrix;

    public static List<Integer> bigRoad = new ArrayList<>();
    public static List<Integer> smallRoad = new ArrayList<>();
    private int[] big = {1, 2, 3, 5, 8, 7, 6, 4};
    private int[] small = {12, 11, 9, 10};
    
    private Animator playerAnimator;
    private Ball ball = new Ball();
    private Point centerPoint; 
    

    public MainPanel(LayoutManager layout) {
        super(layout);
    }

    public MainPanel() {
    }

    public MainPanel(LayoutManager layout, int width, int height) {
        super(layout, width, height);
    }

    public MainPanel(int width, int height) {
        super(width, height);
    }

    public MainPanel(LayoutManager layout, int width, int height, int locX, int locY) {
        super(layout, width, height, locX, locY);
    }

    public MainPanel(int width, int height, int locX, int locY) {
        super(width, height, locX, locY);
    }

    @Override
    protected void initView() {
        listFileBG = new ArrayList<>();
        listImages = new ArrayList<>();
        this.player = new Player(10, 10, 40, 40, 1, "Oval", 2, null);
        player.setListImage(new ArrayList<>());
        player.getListImage().add(ImageUtils.getBitmap(animatorResPath + File.separator + "high.png"));
        player.getListImage().add(ImageUtils.getBitmap(animatorResPath + File.separator + "low.png"));
        this.playerAnimator = new Animator(player, numAnimator);
        animationCount = player.getListImage().size();
        ball = new Ball();
        ball.imageBall = ImageUtils.getBitmap(drawableRes + File.separator + "ball.png");
        centerPoint = new Point(this.getWidth() / 2, this.getHeight()/ 2);
        ball.x = centerPoint.x;
        ball.y = centerPoint.y;
        ball.w = 16;
        ball.h = 16;
        setupBackground();
        
        super.initView();
        
        ball.ballListener = new BallListener() {
            @Override
            public void onInterset(Rectangle2D r) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void onMove(int x, int y) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void onKicked(Player player) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };

    }
    
    private void setupBackground(){
        File file = new File(bgResPath);
        Image image = null;
        try {
            image = ImageUtils.getBitmap(file.listFiles()[0]);
        } catch (Exception ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (file.isDirectory()) {
            for(File f : file.listFiles()){
                String name = f.getName().toLowerCase();
                if (name.contains("green")) {
                    listFileBG.add(f);
                }
            }
        }
        int range = listFileBG.size();
        FileUtils.writeMap(textResPath + File.separator + "background.txt", mapCol, mapRow, range, true);
        listFileBG.forEach( it -> {
            listImages.add(ImageUtils.getBitmap(it.getPath()));
            
        });
        var mat = FileUtils.getMatrix(new File(textResPath + File.separator + "background.txt"), mapCol, mapRow, listFileBG.size());
        matrix = mat;
        
    }

    @Override
    protected void drawView(Graphics2D graphics2D) {
        if (matrix == null) {
            return;
        }
        for (int i = 0; i < mapCol; i++) {
            for (int j = 0; j < mapRow; j++) {
                graphics2D.drawImage(listImages.get(matrix[i][j]), i*iW, j*iH, iW, iH, this);
            }
        }
        graphics2D.setColor(Color.WHITE);
        graphics2D.fillRect(this.getWidth() / 2 - 2, 0, 4, this.getHeight());
        graphics2D.drawOval(this.getWidth()/2 - this.getHeight()/8, this.getHeight()/2 - this.getHeight()/8, this.getHeight()/4, this.getHeight()/4);
        playerAnimator.draw(graphics2D, numAnimator);
        graphics2D.drawImage(ball.imageBall, ball.x, ball.y, ball.w, ball.h, null);
    }
    
    
    
}
