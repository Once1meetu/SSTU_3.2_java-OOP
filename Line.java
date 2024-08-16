public class Line{
    final private Point startP,finishP;
    Line(Point a, Point b){
        this.startP=new Point(a.GetPx(),a.GetPy());
        this.finishP=new Point(b.GetPx(),b.GetPy());
    }
    Line(float x1,float y1,float x2,float y2){this(new Point(x1,y1),new Point(x2,y2));}
    
    public int Lenth(){
        return (int)Math.round( Math.sqrt(Math.pow(startP.GetPx() - finishP.GetPx(), 2) + Math.pow(startP.GetPy() - finishP.GetPy(), 2)) );
    }
    
    public void Setstart(float x,float y){
        startP.SetP(x,y);
    }
    
    public void Setfinish(float x,float y){
        finishP.SetP(x,y);
    }
    
    public float Getstartx(){
        return startP.GetPx();
    }
    
    public float Getstarty(){
        return startP.GetPy();
    }
    
    public float Getfinishx(){
        return finishP.GetPx();
    }
    
    public float Getfinishy(){
        return finishP.GetPy();
    }
    
    public String toString(){
        return "Линия от "+"{"+startP.GetPx()+","+startP.GetPy()+"} "+"до "+"{"+finishP.GetPx()+","+finishP.GetPy()+"}";
    }
}