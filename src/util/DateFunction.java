/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tss
 */
public class DateFunction {
    
    public static String converti(Date data){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        return df.format(data);
        
    }
    
    public static Date converti(String data) throws ParseException{
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.parse(data);
        
    }
    
}
