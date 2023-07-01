package dinesh;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;
import java.awt.Graphics;

public class logo extends JComponent {
    double anrec;
    double xs;
    double ys;
    double xf;
    double yf;
    double angle;

    logo(double x, double y, double as) {
        xs = x;
        ys = y;
        angle = as;
        anrec = 60.0;
    }

    logo() {
        xs = 200.0;
        ys = 200.0;
        xf = 200.0;
        yf = 200.0;
        angle = 0.0;
        anrec = 60.0;
    }

    logo(double anr) {
        anrec = anr;
        xs = 500.0;
        ys = 300.0;
        xf = 0;
        yf = 0;
        angle = 0;
    }

    //everything is Graphics now--using g2 as g;
    public void fd(double len, Graphics g2) {
        xf = xs + len * Math.cos(Math.PI * angle / 180.0);
        yf = ys + len * Math.sin(Math.PI * angle / 180);
        g2.drawLine((int) xs, (int) ys, (int) xf, (int) yf);
        xs = xf; 
        ys = yf;
    }

    public void bk(double len, Graphics g2) {
        xf = xs - len * Math.cos(Math.PI * angle / 180);
        yf = ys - len * Math.sin(Math.PI * angle / 180);
        g2.drawLine((int) xs, (int) ys, (int) xf, (int) yf);
        xs = xf;
        ys = yf;
    } 
    
    public double getXd() {return this.xs;}
    public double getYd() {return this.ys;}
    
    public void line(double xs,double ys,double xf,double yf,Graphics g2) {
    	g2.drawLine((int) xs,(int) ys,(int) xf,(int) yf);
    }
    
    public void line(int xs,int ys,int xf,int yf,Graphics g2) {
    	g2.drawLine( xs, ys, xf, yf);
    }
    
    public void line(Graphics g2) {
    	g2.drawLine((int) xs, (int) ys, (int) xf, (int) yf);
    	System.out.println((int) xs+"  "+xf+" yes i am working now2");
    }
    
    public void rt(double an) {
        angle = angle + an;
    }

    public void lt(double an) {
        angle = angle - an;
    }

    public void set1(double x, double y, double an) {
        xs = x;
        ys = y;
        angle = an;
    }

    void poly(int num,double len,Graphics g){
        for(int j=0;j<num;j++){
        this.fd(len,g);this.rt(360/num);
    } }

    void rectri(int level, double len, Graphics g2) { //g2.setColor(Color.red);
        if (level == 0) {
            this.fd(len, g2);
        } else {
            rectri(level - 1, len / 3, g2);
            this.lt(anrec);
            rectri(level - 1, len / 3, g2);
            this.rt(2 * anrec);
            rectri(level - 1, len / 3, g2);
            this.lt(anrec);
            rectri(level - 1, len / 3, g2);
        }
    }
}

    