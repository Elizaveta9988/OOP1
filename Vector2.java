public class Vector2 {
    float x,y;

    public Vector2( Float x, float  y){ this.x =x; this.y =y;}

    public boolean isEquals(Vector2 opposit){
        if (opposit.y == y && opposit.x == x) return true;
        return false;
    }
    
}
public float getDistance(float x,float y){
     float dx = x - this.x;
     float dy = y - this.y;
     System.out.printf("%f %f", x, y);
    return (float) Math.sqrt(dx * dx + dy * dy);
}