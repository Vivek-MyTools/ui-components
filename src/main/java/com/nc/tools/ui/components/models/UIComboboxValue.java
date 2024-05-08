/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nc.tools.ui.components.models;

import javax.swing.Icon;

/**
 *
 * @author vipa0816
 */
public class UIComboboxValue {
    private Icon image;
    private String name;

    public UIComboboxValue() {
    }

    public UIComboboxValue(Icon image, String name) {
        this.image = image;
        this.name = name;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
