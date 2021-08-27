package CodewarsFiles;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static java.awt.geom.Point2D.distance;

public class TriangleDifference extends JPanel{
    static int move = 100;
    static int [] x = {100+move,200+move, move};
    static int [] y = {move,80+move,100+move};
    static int[] x1 ={30+move,20+move,200+move};
    static int[] y1 ={20+move,50+move,10+move};
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawPolygon(x, y, 3);
        g2d.drawPolygon(x1,y1,3);
        System.out.println("Trójkąty pokrywają się w: "+(float)(Diffrence.Precentage()/Diffrence.polygonArea(x,y,3))*100+" procentach");
    }
    static class Diffrence{
            public static ArrayList<Integer> IntersectionPoints(int[] x, int[] y, int[] x1, int[] y1){
                ArrayList<Integer> coords = new ArrayList<Integer>();
                float a1=(float)(y[0]-y[1])/(x[0]-x[1]);
                float b1=(float)((x[0]*y[1])-(x[1]*y[0]))/(x[0]-x[1]);
                float c1=(float)(y1[0]-y1[1])/(x1[0]-x1[1]);
                float d1=(float)((x1[0]*y1[1])-(x1[1]*y1[0]))/(x1[0]-x1[1]);
                float p1 = (d1-b1)/(a1-c1);
                float g1 = ((a1*d1)-b1*c1) /(a1-c1);
                if(x[0]-x[1]==0) {
                    p1 = x[0];
                    g1 = (c1*p1)+d1;
                }
                  else if(x1[0]-x1[1]==0){
                    p1 = x1[0];
                    g1 = (a1*p1)+b1;
                }
                float a2=(float)(y[0]-y[1])/(x[0]-x[1]);
                float b2=(float)((x[0]*y[1])-(x[1]*y[0]))/(x[0]-x[1]);
                float c2=(float)(y1[1]-y1[2])/(x1[1]-x1[2]);
                float d2=(float)((x1[1]*y1[2])-(x1[2]*y1[1]))/(x1[1]-x1[2]);
                float p2 = (d2-b2)/(a2-c2);
                float g2 = ((a2*d2)-b2*c2) /(a2-c2);
                if(x[0]-x[1]==0) {
                    p2 = x[0];
                    g2 = (c2*p2)+d2;
                }
                else if(x1[1]-x1[2]==0){
                    p2 = x1[1];
                    g2 = (a2*p2)+b2;
                }
                float a3=(float)(y[0]-y[1])/(x[0]-x[1]);
                float b3=(float)((x[0]*y[1])-(x[1]*y[0]))/(x[0]-x[1]);
                float c3=(float)(y1[2]-y1[0])/(x1[2]-x1[0]);
                float d3=(float)((x1[2]*y1[0])-(x1[0]*y1[2]))/(x1[2]-x1[0]);
                float p3 = (d3-b3)/(a3-c3);
                float g3 = ((a3*d3)-(b3*c3)) /(a3-c3);
                if(x[0]-x[1]==0) {
                    p3 = x[0];
                    g3 = (c3*p3)+d3;
                }
                else if(x1[2]-x1[0]==0){
                    p3 = x1[0];
                    g3 = (a3*p3)+b3;
                }
                float a4=(float)(y[1]-y[2])/(x[1]-x[2]);
                float b4=(float)((x[1]*y[2])-(x[2]*y[1]))/(x[1]-x[2]);
                float c4=(float)(y1[1]-y1[2])/(x1[1]-x1[2]);
                float d4=(float)((x1[1]*y1[2])-(x1[2]*y1[1]))/(x1[1]-x1[2]);
                float p4 = (d4-b4)/(a4-c4);
                float g4 = ((a4*d4)-(b4*c4)) /(a4-c4);
                if(x[1]-x[2]==0) {
                    p4 = x[1];
                    g4 = (c4*p4)+d4;
                }
                else if(x1[1]-x1[2]==0){
                    p4 = x1[1];
                    g4 = (a4*p4)+b4;
                }
                float a5=(float)(y[1]-y[2])/(x[1]-x[2]);
                float b5=(float)((x[1]*y[2])-(x[2]*y[1]))/(x[1]-x[2]);
                float c5=(float)(y1[2]-y1[0])/(x1[2]-x1[0]);
                float d5=(float)((x1[2]*y1[0])-(x1[0]*y1[2]))/(x1[2]-x1[0]);
                float p5 = (d5-b5)/(a5-c5);
                float g5 = ((a5*d5)-(b5*c5)) /(a5-c5);
                if(x[1]-x[2]==0) {
                    p5 = x[1];
                    g5 = (c5*p5)+d5;
                }
                else if(x1[2]-x1[0]==0){
                    p5 = x1[0];
                    g5 = (a5*p5)+b5;
                }
                float a6=(float)(y[1]-y[2])/(x[1]-x[2]);
                float b6=(float)((x[1]*y[2])-(x[2]*y[1]))/(x[1]-x[2]);
                float c6=(float)(y1[0]-y1[1])/(x1[0]-x1[1]);
                float d6=(float)((x1[0]*y1[1])-(x1[1]*y1[0]))/(x1[0]-x1[1]);
                float p6 = (d6-b6)/(a6-c6);
                float g6 = ((a6*d6)-b6*c6) /(a6-c6);
                if(x[1]-x[2]==0) {
                    p6 = x[1];
                    g6 = (c6*p6)+d6;
                }
                else if(x1[0]-x1[1]==0){
                    p6 = x1[0];
                    g6 = (a6*p6)+b6;
                }
                float a7=(float)(y[2]-y[0])/(x[2]-x[0]);
                float b7=(float)((x[2]*y[0])-(x[0]*y[2]))/(x[2]-x[0]);
                float c7=(float)(y1[0]-y1[1])/(x1[0]-x1[1]);
                float d7=(float)((x1[0]*y1[1])-(x1[1]*y1[0]))/(x1[0]-x1[1]);
                float p7 = (d7-b7)/(a7-c7);
                float g7 = ((a7*d7)-b7*c7) /(a7-c7);
                if(x[2]-x[0]==0) {
                    p7 = x[0];
                    g7 = (c7*p7)+d7;
                }
                else if(x1[0]-x1[1]==0){
                    p7 = x1[0];
                    g7 = (a7*p7)+b7;
                }
                float a8=(float)(y[2]-y[0])/(x[2]-x[0]);
                float b8=(float)((x[2]*y[0])-(x[0]*y[2]))/(x[2]-x[0]);
                float c8=(float)(y1[1]-y1[2])/(x1[1]-x1[2]);
                float d8=(float)((x1[1]*y1[2])-(x1[2]*y1[1]))/(x1[1]-x1[2]);
                float p8 = (d8-b8)/(a8-c8);
                float g8 = ((a8*d8)-b8*c8) /(a8-c8);
                if(x[2]-x[0]==0) {
                    p8 = x[0];
                    g8 = (c8*p8)+d8;
                }
                else if(x1[1]-x1[2]==0){
                    p8 = x1[1];
                    g8 = (a8*p8)+b8;
                }
                float a9=(float)(y[2]-y[0])/(x[2]-x[0]);
                float b9=(float)((x[2]*y[0])-(x[0]*y[2]))/(x[2]-x[0]);
                float c9=(float)(y1[2]-y1[0])/(x1[2]-x1[0]);
                float d9=(float)((x1[2]*y1[0])-(x1[0]*y1[2]))/(x1[2]-x1[0]);
                float p9 = (d9-b9)/(a9-c9);
                float g9 = ((a9*d9)-b9*c9) /(a9-c9);
                if(x[2]-x[0]==0) {
                    p9 = x[0];
                    g9 = (c9*p9)+d9;
                }
                else if(x1[2]-x1[0]==0){
                    p9 = x1[0];
                    g9 = (a9*p9)+b9;
                }
                double check1 = distance(x[0],y[0],p1,g1);
                double check2 = distance(x[1],y[1],p1,g1);
                double check3 = distance(x[0],y[0],x[1],y[1]);
                if((int)(distance(x[0],y[0],p1,g1)+distance(x[1],y[1],p1,g1))==(int)(distance(x[0],y[0],x[1],y[1]))&&((int)(distance(x1[0],y1[0],p1,g1)+distance(x1[1],y1[1],p1,g1))==(int)(distance(x1[0],y1[0],x1[1],y1[1])))){
                    coords.add((int)p1);
                    coords.add((int)g1);
                }
                if((int)(distance(x[0],y[0],p2,g2)+distance(x[1],y[1],p2,g2))==(int)(distance(x[0],y[0],x[1],y[1]))&&((int)(distance(x1[1],y1[1],p2,g2)+distance(x1[2],y1[2],p2,g2))==(int)(distance(x1[1],y1[1],x1[2],y1[2])))){
                    coords.add((int)p2);
                    coords.add((int)g2);
                }
                if((int)(distance(x[0],y[0],p3,g3)+distance(x[1],y[1],p3,g3))==(int)(distance(x[0],y[0],x[1],y[1]))&&((int)(distance(x1[2],y1[2],p3,g3)+distance(x1[0],y1[0],p3,g3))==(int)(distance(x1[2],y1[2],x1[0],y1[0])))){
                    coords.add((int)p3);
                    coords.add((int)g3);
                }
                if((int)(distance(x[1],y[1],p4,g4)+distance(x[2],y[2],p4,g4))==(int)(distance(x[1],y[1],x[2],y[2]))&&((int)(distance(x1[1],y1[1],p4,g4)+distance(x1[2],y1[2],p4,g4))==(int)(distance(x1[1],y1[1],x1[2],y1[2])))){
                    coords.add((int)p4);
                    coords.add((int)g4);
                }
                if((int)(distance(x[1],y[1],p5,g5)+distance(x[2],y[2],p5,g5))==(int)(distance(x[1],y[1],x[2],y[2]))&&((int)(distance(x1[2],y1[2],p5,g5)+distance(x1[0],y1[0],p5,g5))==(int)(distance(x1[2],y1[2],x1[0],y1[0])))){
                    coords.add((int)p5);
                    coords.add((int)g5);
                }
                if((int)(distance(x[1],y[1],p6,g6)+distance(x[2],y[2],p6,g6))==(int)(distance(x[1],y[1],x[2],y[2]))&&((int)(distance(x1[0],y1[0],p6,g6)+distance(x1[1],y1[1],p6,g6))==(int)(distance(x1[0],y1[0],x1[1],y1[1])))){
                    coords.add((int)p6);
                    coords.add((int)g6);
                }
                if((int)(distance(x[2],y[2],p7,g7)+distance(x[0],y[0],p7,g7))==(int)(distance(x[2],y[2],x[0],y[0]))&&((int)(distance(x1[0],y1[0],p7,g7)+distance(x1[1],y1[1],p7,g7))==(int)(distance(x1[0],y1[0],x1[1],y1[1])))){
                    coords.add((int)p7);
                    coords.add((int)g7);
                }
                if((int)(distance(x[2],y[2],p8,g8)+distance(x[0],y[0],p8,g8))==(int)(distance(x[2],y[2],x[0],y[0]))&&((int)(distance(x1[1],y1[1],p8,g8)+distance(x1[2],y1[2],p8,g8))==(int)(distance(x1[1],y1[1],x1[2],y1[2])))){
                    coords.add((int)p8);
                    coords.add((int)g8);
                }
                if((int)(distance(x[2],y[2],p9,g9)+distance(x[0],y[0],p9,g9))==(int)(distance(x[2],y[2],x[0],y[0]))&&((int)(distance(x1[2],y1[2],p9,g9)+distance(x1[0],y1[0],p9,g9))==(int)(distance(x1[2],y1[2],x1[0],y1[0])))){
                    coords.add((int)p9);
                    coords.add((int)g9);
                }
                return coords;
            }
        public static double polygonArea(int[] X, int[] Y,
                                         int n)
        {
            double area = 0.0;

            int j = n - 1;
            for (int i = 0; i < n; i++)
            {
                area += (X[j] + X[i]) * (Y[j] - Y[i]);

                j = i;
            }

            return Math.abs(area / 2.0);
        }
            public static float Precentage(){
                float area = 0;
                int[] X;
                int[] Y;
                ArrayList<Integer> coords = Diffrence.IntersectionPoints(x,y,x1,y1);
                if(coords.size() == 0){
                    System.out.println("Trójkąty się nie krzyżują");
                    }
//                if(coords.size()==4) {
//
//                    }
                if(coords.size() == 6){
                    X= new int[]{coords.get(0), coords.get(2),coords.get(4)};
                    Y= new int[]{coords.get(1), coords.get(3),coords.get(5)};
                    area = (float) polygonArea(X,Y,4);
                }
                if(coords.size() == 8){
                    X = new int[]{coords.get(0), coords.get(2), coords.get(4), coords.get(6)};
                    Y = new int[]{coords.get(1), coords.get(3), coords.get(5), coords.get(7)};
                    area = (float) polygonArea(X,Y,4);
                    
                }
                if(coords.size() == 10){
                    X = new int[]{coords.get(0), coords.get(2), coords.get(4), coords.get(6),coords.get(8)};
                    Y = new int[]{coords.get(1), coords.get(3), coords.get(5), coords.get(7),coords.get(9)};
                    area = (float) polygonArea(X,Y,5);
                }
                if(coords.size() == 12){
                    X = new int[]{coords.get(0), coords.get(2), coords.get(4), coords.get(6), coords.get(8), coords.get(10)};
                    Y = new int[]{coords.get(1), coords.get(3), coords.get(5), coords.get(7), coords.get(9), coords.get(11)};
                    area = (float) polygonArea(X,Y,6);
                }
                return area;
            }
        }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Draw a Polygon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(300, 200);
        TriangleDifference panel = new TriangleDifference();
        frame.add(panel);
        frame.setVisible(true);
    }

    
}
