package objects;

import controller.GraphicFace;
import controller.GraphicPolygon;
import utils.Color;

import javax.media.opengl.GL;
import java.util.ArrayList;

public class PoolTableLeg extends GraphicPolygon {
    
    public PoolTableLeg(GL gl, Color color, boolean hasLight, ArrayList<GraphicFace> faces) {
        super(gl, color, hasLight, faces);
    }
    
}
