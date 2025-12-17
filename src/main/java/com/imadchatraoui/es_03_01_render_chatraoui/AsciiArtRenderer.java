/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imadchatraoui.es_03_01_render_chatraoui;

import edu.avo.renderersutilitylibrary.ASCIIArtGenerator;
import edu.avo.renderersutilitylibrary.NumberToTextConverter;

/**
 * Classe che trasforma un numero in "parole" e lo mostra come arte ASCII.
 *
 * @author imadchatraoui
 */
public class AsciiArtRenderer implements Renderer {

    private ASCIIArtGenerator asciiart;

    /**
     * Costruttore della classe AsciiArtRenderer. Inizializza il generatore di
     * arte ASCII.
     *
     * @param asciiart oggetto di tipo ASCIIArtGenerator.
     */
    public AsciiArtRenderer(ASCIIArtGenerator asciiart) {
        this.asciiart = asciiart;
    }

    /**
     * Metodo per effettuare il rendering di un numero in arte ASCII. Converte
     * il numero in testo usando la classe NumberToTextConverter e lo trasforma
     * in arte ASCII utilizzando l'oggetto ASCIIArtGenerator.
     *
     * @param number numero intero da convertire e visualizzare.
     */
    public void render(int number) {
        // Convertiamo il numero in una stringa
        String text = NumberToTextConverter.convert(number);

        //Stampa l'arte ASCII usando il carattere "█" o "@" -> togliere il commento per usare il carattere "@"
        asciiart.printTextArt(text, 20, ASCIIArtGenerator.ASCIIArtFont.ART_FONT_MONO, "$");
        //asciiart.printTextArt(text, 20, ASCIIArtGenerator.ASCIIArtFont.ART_FONT_MONO, "@");
    }
}
