package objects;

import com.sun.opengl.util.GLUT;
import controller.GraphicSphere;
import utils.Color;
import utils.Point;

import javax.media.opengl.GL;

public class PoolBall extends GraphicSphere{
    
    private int id;
    private double speed;
    private double angle;
    
    public PoolBall(GL gl, GLUT glut, Color color, Point centerPoint, double size, boolean light) {
        super(gl, glut, color, centerPoint, size, light);
    }
}
