/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import views.activity.childs.MainPanel;

/**
 *
 * @author vipvl
 */
public class FileUtils {
    
    private static int beforeNumber = Integer.MAX_VALUE;
    private static Random random = new Random();
    
    @SuppressWarnings({"UseSpecificCatch", "ConvertToTryWithResources"})
    public static void writeMap(String fileName, int col, int row, int range, boolean isClear){
        File file = new File(fileName);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.length() > 0) {
            if (!isClear) {
                return;
            }
            PrintWriter pW;
            try {
                pW = new PrintWriter(fileName);
                pW.write("");
            pW.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        int x = 0, y = 0;
        String line = "";
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.flush();
            while (x < col && y < row) {
                int index;
                index = getRandomNumber(range);

                line += (index + "_");
                x++;
                if (x == col) {
                    x = 0;
                    fileWriter.write(line);
                    fileWriter.write("\n");
                    line = "";
                    y++;
                }
            }
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("" + e.getMessage());

        }
    }
    
    @SuppressWarnings({"UnusedAssignment", "null", "UseSpecificCatch"})
    public static int[][] getMatrix(File file,int col,int row, int count){
        if (!file.exists() || null == file) {
            return null;
        }
        int x = 0; int y = 0;
        BufferedReader bufferedReader = null;
        int[][] matrix = new int[col][row];

        try {
            InputStream inputStream = new FileInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String[] indexStr = new String[count];
            
            while (x < col && y < row) {
                String l = bufferedReader.readLine();
                if (l == null) {
                    return null;
                }
                indexStr = l.split("_");
                while (x < col) {
                    int value = Integer.parseInt(indexStr[x]);
                    matrix[x][y] = value;
                    x++;
                }
                if (x == col) {
                    x = 0;
                    y++;

                }
            }
            bufferedReader.close();
            return matrix;
        } catch (Exception ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }
    }
    
    public static int getRandomNumber(int range){
        int index = random.nextInt(range);
        if (beforeNumber == index) {
            index = getRandomNumber(range);
        }
        beforeNumber = index;
        return index;
    }
    
    private static List<Integer> ruleOfRoad(String fileName){
        String number = fileName.split("road")[0];
        number = number.split(".")[0];
        if (number.contains("0")) {
            number = number.split("0")[0];
        }
        int num = Integer.parseInt(number);
        if (MainPanel.bigRoad.contains(num)) {
            return MainPanel.bigRoad;
        }
        return MainPanel.smallRoad;
        
    }
}
