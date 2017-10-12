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

public class PoolTable extends GraphicPolygon{
    
    private ArrayList<PoolTableLeg> poolTableLegs;
    private ArrayList<PoolTableMarginSegment> poolTableMarginSegments;    
    private ArrayList<GraphicFace> poolTableTopFaces;
    
    public PoolTable(GL gl, Color color, ArrayList<GraphicFace> faces, boolean hasLight) {
        super(gl, color, hasLight, faces);
        
        this.setPoolTableLegs(new ArrayList<>());
        this.setPoolTableMarginSegments(new ArrayList<>());
    }
    
    public void drawTableObjects() {
        this.drawObject();
        
        for (PoolTableLeg tableLeg : this.getPoolTableLegs()) {
            tableLeg.drawObject();
        }
        for (PoolTableMarginSegment tableMarginSegment : this.getPoolTableMarginSegments()) {
            tableMarginSegment.drawObject();
        }
    }
    
    public void addPoolTableLeg(PoolTableLeg tableLeg) {
        if (!this.getPoolTableLegs().contains(tableLeg)) {
            this.getPoolTableLegs().add(tableLeg);
        }
    }
    
    public void addPoolTableMarginSegment(PoolTableMarginSegment tableLeg) {
        if (!this.getPoolTableMarginSegments().contains(tableLeg)) {
            this.getPoolTableMarginSegments().add(tableLeg);
        }
    }
    
    public ArrayList<GraphicFace> getFaces() {
        return this.poolTableTopFaces;
    }

    public void setFaces(ArrayList<GraphicFace> poolTableTopFaces) {
        this.poolTableTopFaces = poolTableTopFaces;
    }

    public ArrayList<PoolTableLeg> getPoolTableLegs() {
        return poolTableLegs;
    }

    public void setPoolTableLegs(ArrayList<PoolTableLeg> poolTableLegs) {
        this.poolTableLegs = poolTableLegs;
    }

    public ArrayList<PoolTableMarginSegment> getPoolTableMarginSegments() {
        return poolTableMarginSegments;
    }

    public void setPoolTableMarginSegments(ArrayList<PoolTableMarginSegment> poolTableMarginSegments) {
        this.poolTableMarginSegments = poolTableMarginSegments;
    }
}
