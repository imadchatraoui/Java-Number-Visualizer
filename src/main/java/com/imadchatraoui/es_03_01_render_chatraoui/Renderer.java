/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imadchatraoui.es_03_01_render_chatraoui;

/**
 * Interfaccia che specifica un metodo per visualizzare un numero. Implementando
 * questa interfaccia, le classi possono adesso fornire diverse modalità di
 * rendering. (sono obbligati ad avere il metodo)
 *
 * @author imadchatraoui
 */
public interface Renderer {

    /**
     * Metodo che esegue il rendering di un numero
     *
     * @param number numero intero da visualizzare
     */
    public void render(int number);
}
