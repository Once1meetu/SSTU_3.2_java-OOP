public class Point{
    private float x,y;
    Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    float GetPx(){
        return x;
    }
    float GetPy(){
        return y;
    }
    void SetP(float x,float y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "{"+x+","+y+"}";
    }
}