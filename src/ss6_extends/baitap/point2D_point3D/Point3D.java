package ss6_extends.baitap.point2D_point3D;

public class Point3D extends Point2D{
    float z;
    Point3D(){
        super(4,5);
    }
    Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float[] xyz = {x,y,z};
        return xyz;
    }
    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString(){
        return "Point 3D ("+x+", "+y+", "+z+")";
    }
}
