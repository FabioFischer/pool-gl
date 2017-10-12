/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import controller.GraphicFace;
import controller.GraphicPolygon;
import utils.Color;

import javax.media.opengl.GL;
import java.util.ArrayList;

/**
 *
 * @author fabio.fischer
 */
public class PoolTableMarginSegment extends GraphicPolygon {
    
    public PoolTableMarginSegment(GL gl, Color color, boolean hasLight, ArrayList<GraphicFace> faces) {
        super(gl, color, hasLight, faces);
    }   
}
