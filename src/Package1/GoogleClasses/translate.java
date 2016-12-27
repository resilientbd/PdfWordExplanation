/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Package1.GoogleClasses;

import com.google.api.GoogleAPI;
import com.google.api.GoogleAPIException;
import com.google.api.translate.*;
import com.google.api.translate.TranslateV2;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Faisal
 */
public class translate {
    
    public void _translat(){
        TranslateV2.setHttpReferrer("http://translate.google.com/");
        GoogleAPI.setKey("AIzaSyAuKdQ-y_xihtWq9HoFV1yLYxRDmAYlowo");

        try {
            String translatedText = Translate.DEFAULT.execute("Bonjour le monde", Language.FRENCH, Language.ENGLISH);
        } catch (GoogleAPIException ex) {
            Logger.getLogger(translate.class.getName()).log(Level.SEVERE, null, ex);
        }

}

  
}
