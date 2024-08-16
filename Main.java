/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
  public static void main(String[] args) {
      Point a=new Point(1,1);
      Point b=new Point(1,10);
      Line x=new Line(a,b);
      Line y=new Line(3,3,6,7);
    System.out.println(x);
    System.out.println("Длина отрезка с началом и концом в точках:"+a+","+b+"="+x.Lenth());
    a=new Point(1,12);//Нелегитимное изменение координат начала отрезка x
    System.out.println("Нелегитимно подменили точку начала отрезка на "+a+". Получили:");
    System.out.println(x);//Демонстрация, что линия не привязана к точке.
    /*
    Point c=new Point(10,10);
    x.startP=c;
    Это демонстрация отсутствия возможности связать Линию с какой-либо произвольной Точкой.
    Если этот фрагмент раскомментить, прога крашнется ввиду того, что x.startP приватно.
    */
    System.out.println("Длина отрезка заданного координатами: 3,3,6,7"+"="+y.Lenth());
    y.Setstart(10,5);//Законно меняем координаты начала отрезка
    y.Setfinish(22,6);//Законно меняем координаты конца отрезка
    System.out.println("Координаты второй линии изменены на:"+
y.Getstartx()+","+y.Getstarty()+","+y.Getfinishx()+","+y.Getfinishy());
  }
}