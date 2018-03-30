/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

import com.mysql.jdbc.*;
import static java.lang.System.out;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


/**
 *
 * @author OLAOPA
 */
public class CHECK_STRING {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scan = new Scanner(System.in);
        String str=  null;
        String str1 = null;
        String str2 = null;
        
        String redund = "reclusive";
        out.println(redund.substring(3, redund.length()));
        
        out.println("Input the first string");
        str1 = scan.next();
        
        out.println("Input the second string");
        str2 = scan.next();
        
        boolean confirm = false;
        String container = null;
        
        if(str2.length()<=str1.length()){
            for(int i=0; i<str1.length(); i++){
/*                check if the first contains a sub-string of equal length, that starts with the first letter of the second string and ends
                    with the last letter of the second string. If there are such strings, compare each one to str2, to check if it equals str2.
                    if it does equal str2, then str2 is contained in str1.
                */
                
                if((i+str2.length()-1)<=str1.length()){
                    if((str1.charAt(i)==str2.charAt(0))&& (str1.charAt(i+str2.length()-1)==str2.charAt(str2.length()-1))){
                        container = str1.substring(i, i+str2.length());
                        if(container.equals(str2)){  
                            confirm = true;
                            break;
                        }
                    }
                }
            }
        }
        if(confirm == true){
            out.println(str1+" contains "+str2);
        }
       
        
    }
}
