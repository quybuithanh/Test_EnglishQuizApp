/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btq.utils.Themes;

import com.mycompany.prj1jvfx.App;

/**
 *
 * @author Kai
 */
public class DefaultFactory extends ThemesAbstractFactory{

    @Override
    public String getStyleSheet() {
        return App.class.getResource("styles.css").toExternalForm();
    }
    
}
