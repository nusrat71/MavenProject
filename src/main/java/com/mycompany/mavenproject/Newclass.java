/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject;

import java.util.Scanner;

/**
 *
 * @author DOLPHIN
 */
public class Newclass
{
    public enum Month{
        JANUARY("January",31),
        FEBRUARY("February",28),
        MARCH("March",31),
        APRIL("April",30),
        MAY("May",31),
        JUNE("June",30),
        JULY("July",31),
        AUGUST("August",31),
        SEPTEMBER("September",30),
        OCTOBER("October",31),
        NOVEMBER("November",30),
        DECEMBER("December",31);
        
        
        String name;
        int monthdays;
        
        Month(String name,int monthdays)
        {
            
        this.name=name;
        this.monthdays=monthdays;
    
        }
        public int returnmonthdays()
        {
          return this.monthdays;  
        }
        public String get_substring()
        {
            return this.name.substring(0,3);
        }
        
        public Month parse(String value)
        {
            if(value==null)
            
                return null;
            
            else
            {
              value=value.toUpperCase();
              try
              {
                  return valueOf(value);
              }
              catch(Exception excep)
                      {
                        for (Month val:values())  
                        {
                            if(value.equals(val.name().substring(0,3)))
                            {
                                return val;
                            }
                        }
                      }
            }
            return null;
        }
        
          
        
        
        
        
    }
    
    
      

    public static void main(String[] args){
          
        String name= "Feb";
        Month month_name= Month.JANUARY;
        System.out.println("Days in "+month_name.parse(name)+"= "+month_name.parse(name).returnmonthdays());

        
        
    }
}
    

