/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nc.tools.ui.components.renderers;

import com.nc.tools.ui.components.models.UIComboboxValue;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author vipa0816
 */
public class UICoboboxRenderer extends JLabel implements ListCellRenderer<UIComboboxValue> {

    @Override
    public Component getListCellRendererComponent(JList<? extends UIComboboxValue> list, UIComboboxValue value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value != null) {
            setIcon(value.getImage());
            setText(value.getName());

            if (isSelected || cellHasFocus) {
                setBackground(Color.LIGHT_GRAY);
                setForeground(Color.BLACK);
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }

            setFont(list.getFont());
        }

        return this;
    }

}
