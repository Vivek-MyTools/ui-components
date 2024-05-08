/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nc.tools.ui.components.models;

import java.util.Objects;

/**
 *
 * @author Vivekanand
 */
public class UIListKeyValuePair {
    private String key;
    private String value;

    public UIListKeyValuePair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.key);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UIListKeyValuePair other = (UIListKeyValuePair) obj;
        if (!Objects.equals(this.key, other.key)) {
            return false;
        }
        return true;
    }
    
    
}
