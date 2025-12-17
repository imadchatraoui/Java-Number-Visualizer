/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imadchatraoui.es_03_01_render_chatraoui;

import edu.avo.renderersutilitylibrary.NumberToTextConverter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe che permette di leggere ad alta voce un numero. grazie a espeak-ng
 *
 * @author imadchatraoui
 */
public class VoiceRenderer implements Renderer {

    NumberToTextConverter converter;

    /**
     * Costruttore della classe Inizializza il convertitore necessario per
     * trasformare i numeri in testo.
     *
     * @param converter oggetto di tipo NumberToTextConverter
     */
    public VoiceRenderer(NumberToTextConverter converter) {
        this.converter = converter;
    }

    /**
     * Metodo che esegue il rendering di un numero leggendo il valore ad alta
     * voce grazie a espeak-ng
     *
     * @param number numero da leggere ad alta voce
     */
    @Override
    public void render(int number) {
        try {
            // Converte il numero in testo
            String text = NumberToTextConverter.convert(number);

            // Configura il comando espeak-ng in lingua italiana
            ProcessBuilder pb = new ProcessBuilder("/opt/homebrew/bin/espeak-ng", "-v", "it", text);

            // Avvia il comando
            pb.start();

        } catch (IOException ex) {
            Logger.getLogger(VoiceRenderer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
