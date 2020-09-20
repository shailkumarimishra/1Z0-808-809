package com.localization;

import java.util.Locale;
import java.util.ResourceBundle;
/*packagequalifer.bundleName+"_"+language+"_"+country+"_"+(variant+"_#"|"#")+script+"-"+extension
e.g- message_hi_IN_ka.properties*/

/*Searching Order for the ResourceBundle
step 1: The search starts by looking for an exact match for the ResourceBundle with the full name.
step 2: The last component (the part separated by underscore) is drop and search is repeated with the resulting shorter name.
        This process is repeated till the last Locale modifier is left.
step 3: The search is continued using the full name of the bundle for the default Locale.
step 4: Search for the ResourceBundle with just the name of the bundle.
step 5: The search fail,throwing a missing bundle exception.
e.g: message_language_country_variant
    message_language_country
    message_language
    message_defaultLanguage_defaultCountry
    message_defaultLanguage
    message
    exception*/

public class LocalizedMessage {
public static void main(String[] args) {
	Locale locale = Locale.getDefault();
	locale.setDefault(new Locale("hi","IN"));
	ResourceBundle rb=ResourceBundle.getBundle("message",locale);
	System.out.println(rb.getString("welcome"));
}
}
