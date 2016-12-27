/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Package1.GoogleClasses;

import com.gtranslate.Language;
import com.gtranslate.Translator;

/**
 *
 * @author Faisal
 */
public class txtToSpecchpk {
    public void test()
    {
        Translator translate = Translator.getInstance();
String text = translate.translate("Hello!", Language.ENGLISH, Language.ROMANIAN);
System.out.println(text);
    }
    
}
