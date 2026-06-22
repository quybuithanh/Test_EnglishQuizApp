/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btq.utils.Themes;

import javafx.scene.Scene;

/**
 *
 * @author Kai
 */
public class ThemeManager {
    private static ThemesAbstractFactory theme = new DefaultFactory();

    public static void setTheme(ThemesAbstractFactory theme) {
        ThemeManager.theme = theme;
    }
    
    public static void applyTheme(Scene scene){
        scene.getRoot().getStylesheets().clear();
        scene.getRoot().getStylesheets().add(theme.getStyleSheet());
    }
}
