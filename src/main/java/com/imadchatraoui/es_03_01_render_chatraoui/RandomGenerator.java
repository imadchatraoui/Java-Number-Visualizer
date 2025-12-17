/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imadchatraoui.es_03_01_render_chatraoui;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classe che genera numeri casuali in un intervallo e li passa a una lista di
 * renderers per la visualizzazione.
 *
 * @author imadchatraoui
 */
public class RandomGenerator {

    private int min;
    private int max;
    private List<Renderer> renderers;
    private Random random;

    /**
     * Costruttore che inizializza l'intervallo per i numeri casuali e crea una
     * lista di renderers. è presente anche un controllo se si inserisce il
     * numero maggiore dentro min, e viceversa.
     *
     * @param min valore minimo dell'intervallo
     * @param max valore massimo dell'intervallo
     */
    public RandomGenerator(int min, int max) {
        // Controlla e scambia min e max se necessario
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        this.min = min;
        this.max = max;
        this.renderers = new ArrayList<>();
        this.random = new Random();
    }

    /**
     * Aggiunge un renderer alla lista
     *
     * @param ascoltatore oggetto che implementa l'interfaccia Renderer
     */
    public void addRenderer(Renderer ascoltatore) {
        renderers.add(ascoltatore);
    }

    /**
     * Rimuove un renderer dalla lista
     *
     * @param ascoltatore oggetto che implementa l'interfaccia Renderer
     * @return true se il renderer è stato rimosso, altrimenti false
     */
    public boolean removeRenderer(Renderer ascoltatore) {
        return renderers.remove(ascoltatore);
    }

    /**
     * Genera un numero casuale nell'intervallo specificato e lo passa ai
     * renderers.
     */
    public void generateNumber() {
        int numRandom = random.nextInt((max - min) + 1) + min;
        Renderers(numRandom);
    }

    /**
     * Passa a tutti i renderers presenti alla lista il numero da visualizare
     *
     * @param number Nnumero generato da visualizzare
     */
    private void Renderers(int number) {
        for (Renderer renders : renderers) {
            renders.render(number);
        }
    }
}
