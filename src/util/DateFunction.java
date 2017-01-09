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

    public static String converti(Date data) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        return df.format(data);

    }

    public static Date converti(String data) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.parse(data);

    }

    public static int giorniInMese(int mese) {
        int giorni = 0;
        Date data = new Date();
        for (int i = 0; i < mese; i++) {
            if (i == 2) {
                if (data.getYear() % 4 == 0) {
                    giorni += 29;
                } else {
                    giorni += 28;
                }
            } else {
                if (i == 3 || i == 5 || i == 8 || i == 10) {
                    giorni += 30;
                } else {
                    giorni += 31;
                }
            }
        }
        return giorni;
    }

    public static String contatempo(int secondi) {
        String report = "";
        int giorni =(int) Math.floor(secondi / 86400);
        int secondi_resto = secondi - giorni * 86400;
        int ore =(int) Math.floor(secondi_resto / 3600);
        secondi_resto = secondi - giorni * 86400 - ore * 3600;
        int minuti =(int) Math.floor(secondi_resto / 60);
        secondi_resto = secondi - giorni * 86400 - ore * 3600 - minuti * 60;
        report += giorni + "/ ";
        report += ore + "/ ";
        report += minuti + "/ ";
        report += secondi_resto + "/ ";
        return report;
        
    }
    
    public static int cambioInSecondi(Date data1, Date data2){
        int secondiTot = 0;
        secondiTot += (data2.getDay() - data1.getDay()) * 84600;
        secondiTot += ( DateFunction.giorniInMese(data2.getMonth()) -  DateFunction.giorniInMese(data1.getMonth())) * 84600;
        secondiTot += data2.getSeconds()- data1.getSeconds();
        secondiTot += (data2.getMinutes() - data1.getMinutes()) * 60;
        secondiTot += (data2.getHours() - data1.getHours()) * 3600;
        
        return secondiTot;
    }

}
