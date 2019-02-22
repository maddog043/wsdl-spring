/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.osk.infotrans.wsdl;

import java.util.Calendar;

/**
 *
 * @author DKTS-UAGolovanov
 */
public class HelloService implements HelloInterface {
    public String getHello(String name) throws Exception {
        return "Hello, " + name + "!";
    }
    
    public Calendar getCurrentTime() {
        return Calendar.getInstance();
    }
}
