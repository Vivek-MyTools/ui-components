/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nc.tools.ui.components.renderers;

import com.nc.tools.ui.components.models.templates.ListValueTemplate;
import com.nc.tools.ui.components.models.UIListKeyValuePair;
import com.nc.tools.ui.components.ui.UIList;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/**
 *
 * @author vpandhar
 */
public class UIListRendererWithIcon extends JPanel implements ListCellRenderer<UIListKeyValuePair>{
       
    private final ListValueTemplate template;
    private final UIList container;
   
    public UIListRendererWithIcon(JPanel container) {
        this.container = (UIList) container;
        template = new ListValueTemplate(this.container.getImage(), this.container.isHideKey());        
    }
   
    @Override
    public Component getListCellRendererComponent(JList<? extends UIListKeyValuePair> list, UIListKeyValuePair value, int index, boolean isSelected, boolean cellHasFocus) {
        template.setProperties(value.getKey(), value.getValue());        
        template.highLightText(Color.BLACK, Color.yellow);
        Font font = new Font(container.getFont().getFontName(), Font.BOLD, container.getFont().getSize());
        if(isSelected || cellHasFocus){            
            //template.setKeyFontAndColor(font, list.getSelectionForeground());
            template.setValueFontAndColor(font, list.getSelectionForeground());   
            template.setBackgroundColor(list.getSelectionBackground());
        }else{            
            //template.setKeyFontAndColor(container.getFont(), list.getForeground());
            template.setValueFontAndColor(container.getFont(), list.getForeground());    
            template.setBackground(list.getBackground());            
        }        
        return template;
    }
    
    
}
