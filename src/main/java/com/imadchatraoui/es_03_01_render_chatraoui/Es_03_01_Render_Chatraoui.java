/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.imadchatraoui.es_03_01_render_chatraoui;

import edu.avo.renderersutilitylibrary.ASCIIArtGenerator;
import edu.avo.renderersutilitylibrary.Canvas;
import edu.avo.renderersutilitylibrary.NumberToTextConverter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Es_03_01_Render_Chatraoui {

    public static void main(String[] args) {

        RandomGenerator generator = new RandomGenerator(1, 100);

        //asciiart
        ASCIIArtGenerator asciiArtGenerator = new ASCIIArtGenerator();
        AsciiArtRenderer asciiArtRenderer = new AsciiArtRenderer(asciiArtGenerator);

        //led 7 segmenti
        Canvas canvas = new Canvas(800, 500, "LED a 7 segmenti");
        SevenSegmentRenderer sevenSegmentRenderer = new SevenSegmentRenderer(canvas);

        //voce
        NumberToTextConverter voiceConverter = new NumberToTextConverter();
        VoiceRenderer voiceRenderer = new VoiceRenderer(voiceConverter);

        generator.addRenderer(sevenSegmentRenderer);
        generator.addRenderer(asciiArtRenderer);
        generator.addRenderer(voiceRenderer);

        generator.generateNumber();

    }

}
