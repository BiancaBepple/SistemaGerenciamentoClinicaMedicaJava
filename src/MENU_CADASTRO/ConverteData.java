/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MENU_CADASTRO;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author 20171inf0171
 */
public class ConverteData {

 String dt_nas;
 public String resultado;
 DateFormat formatDTGrava = new SimpleDateFormat("yyyy-MM-dd");
 DateFormat formatOrigem = new SimpleDateFormat("dd/MM/yyyy");

public String DataGrava(String dt_nas) {
 try {

 java.util.Date aniversario = formatOrigem.parse(dt_nas);
 resultado = formatDTGrava.format(aniversario);
 return resultado;
 } catch (ParseException e) {
 System.out.println("Formato de data inválido");
 }
 return null;
 }

public String DataMostra(String dt_nas) {
 try {

 java.util.Date aniversario = formatDTGrava.parse(dt_nas);
 resultado = formatOrigem.format(aniversario);
 return resultado;
 } catch (ParseException e) {
 System.out.println("Formato de data inválido");
 }
 return null;
 }

    String DataGrava(Date recebedata) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    

