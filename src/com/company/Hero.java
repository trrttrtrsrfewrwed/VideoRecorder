package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Евросеть on 22.03.2017.
 */
public class Hero extends JPanel {
    int x;
    int y;
    int width;
    int height;
    int screenpart;
    Image headImage;
    Image bodyImage;
    int isFunk;
    public Hero(){
        screenpart=1;
    }
    public void setScreenpart(int screenpart){
        this.screenpart=screenpart;
    }
    public void paint(Graphics g){
        if (screenpart==1){
            Dimension dim =Toolkit.getDefaultToolkit().getScreenSize();
            Rectangle Herobounds  = new Rectangle((int)dim.getWidth()/6,(int)dim.getHeight()/4);
            x=(int)(getWidth()-Herobounds.getWidth());
            y=(int)(getHeight()-Herobounds.getHeight());
            width=(int)Herobounds.getWidth();
            height=(int)Herobounds.getHeight();

        }
        if (screenpart==0){
            x=0;
            y=0;
            width=getWidth();
            height=getHeight();
        }
        g.setColor(Color.cyan);
        g.fillRect(x,y,width,height);

    }
}
