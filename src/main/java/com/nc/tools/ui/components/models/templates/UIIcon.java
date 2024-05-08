/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nc.tools.ui.components.models.templates;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author vpandhar
 */
public class UIIcon extends JPanel{
    
    private final Image image;
    private final int iconWidth;
    private final int iconHeight;
    private final int delta = 5;
    
    public UIIcon(Image image, int width, int height){
        this.image = image;
        this.iconWidth = width;
        this.iconHeight = height;
        setLayout(new FlowLayout(FlowLayout.LEFT, 1, 0));
        setPreferredSize(new Dimension(width+delta, height));
        setOpaque(false);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        draw(g);
    }

    private void draw(Graphics g) {
        g.drawImage(image, delta, 0, iconWidth, iconHeight, null);
        g.dispose();
    }
    
}
