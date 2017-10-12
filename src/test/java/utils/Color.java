package utils;

import java.util.Random;

public class Color {
    private double red, green, blue, alpha;
    
    public static final Color cBlack = new Color(0, 0, 0, 1);
    public static final Color cWhite = new Color(1, 1, 1, 1);
    public static final Color cRed = new Color(1, 0, 0, 1);
    public static final Color cDarkRed = new Color(0.5, 0, 0, 1);
    public static final Color cGreen = new Color(0, 1, 0, 1);
    public static final Color cDarkGreen = new Color(0, 0.75, 0, 1);
    public static final Color cDarkerGreen = new Color(0, 0.5, 0, 1);
    public static final Color cBlue = new Color(0, 0, 1, 1);
    public static final Color cDarkBlue = new Color(0, 0.1, 0.2, 1);
    public static final Color cBrown = new Color(0.2, 0.1, 0, 1);
    public static final Color cDarkBrown = new Color(0.1, 0.05, 0, 1);
    public static final Color cYellow = new Color(1, 1, 0, 1);
    public static final Color cOrange = new Color(1, 0.5, 0, 1);
    
    public Color (double red, double green, double blue, double alpha) {
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);
        this.setAlpha(alpha);
    }
    
    public float[] getColorArrayF() {
        return new float[]{this.getRedF(), this.getGreenF(), this.getBlueF(), this.getAlphaF()};
    }
    
    public double[] getColorArrayD() {
        return new double[]{this.getRed(), this.getGreen(), this.getBlue(), this.getAlpha()};
    }

    public static Color getRandomColor () {
        Random rand = new Random();        
        return new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat(), 1);
    }
    
    public double getRed() {
        return red;
    }
    
    public float getRedF() {
        return (float)red;
    }

    public void setRed(double red) {
        this.red = red;
    }

    public double getGreen() {
        return green;
    }

    public float getGreenF() {
        return (float)green;
    }

    public void setGreen(double green) {
        this.green = green;
    }

    public double getBlue() {
        return blue;
    }
    
    public float getBlueF() {
        return (float)blue;
    }

    public void setBlue(double blue) {
        this.blue = blue;
    }
  

    public double getAlpha() {
        return alpha;
    }
    
    public float getAlphaF() {
        return (float)alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }
}
