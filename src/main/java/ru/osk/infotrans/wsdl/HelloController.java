/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.osk.infotrans.wsdl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DKTS-UAGolovanov
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Hello world!";
    }
    @RequestMapping("/say")
    public String say() {
        return "Said hello world!";
    }
}
