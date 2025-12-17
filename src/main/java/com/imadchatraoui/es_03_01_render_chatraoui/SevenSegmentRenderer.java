/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imadchatraoui.es_03_01_render_chatraoui;

import edu.avo.renderersutilitylibrary.Canvas;
import java.awt.Color;

/**
 * Classe che visualizza un numero utilizzando un display a sette segmenti.
 *
 *
 * @author imadchatraoui
 */
public class SevenSegmentRenderer implements Renderer {

    private Canvas canvas;

    /**
     * Costruttore della classe Inizializza il canvas per il rendering.
     *
     * @param canvas oggetto di tipo Canvas per disegnare i numeri
     */
    public SevenSegmentRenderer(Canvas canvas) {
        this.canvas = canvas;
    }

    /**
     * Metodo che esegue il rendering di un numero intero Ogni cifra del numero
     * viene disegnata come carattere su un display a sette segmenti
     *
     * @param number numero da visualizzare
     */
    @Override
    public void render(int number) {
        // Cercato su internet, converte un numero in stringa
        String string = String.valueOf(number);

        int x = 200;

        // Ciclo per ogni cifra della stringa
        for (int i = 0; i < string.length(); i++) {

            // Prendiamo il carattere alla i-esima posizione e la riconvertiamo in un numero
            char carattere = string.charAt(i);
            int numero = Character.getNumericValue(carattere);

            // Disegna la cifra sul canvas
            canvas.drawCipher(x, 125, numero, Canvas.SegmentSize.LARGE, Color.black, Color.magenta);

            x = x + 180; // Sposta verso destra di 180 pixel (anche 150 è un'opzione)
        }
    }
}
