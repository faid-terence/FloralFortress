package com.faidterence.FloralFortress.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")

public class GreetingsController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @RequestMapping("/hola")
    public String sayHola() {
        return "Hola, Mundo!";
    }

    @RequestMapping("/bonjour")
    public String sayBonjour() {
        return "Bonjour, le Monde!";
    }

    @RequestMapping("/ciao")
    public String sayCiao() {
        return "Ciao, Mondo!";
    }

    @RequestMapping("/namaste")
    public String sayNamaste() {
        return "Namaste, Duniya!";
    }

    @RequestMapping("/salve")
    public String saySalve() {
        return "Salve, Mundi!";
    }

    @RequestMapping("/hallo")
    public String sayHallo() {
        return "Hallo, Welt!";
    }

    @RequestMapping("/hej")
    public String sayHej() {
        return "Hej, Världen!";
    }

    @RequestMapping("/konnichiwa")
    public String sayKonnichiwa() {
        return "Konnichiwa, Sekai!";
    }

    @RequestMapping("/ni-hao")
    public String sayNiHao() {
        return "Ni Hao, Shi Jie!";
    }

    @RequestMapping("/privet")
    public String sayPrivet() {
        return "Privet, Mir!";
    }

    @RequestMapping("/shalom")
    public String sayShalom() {
        return "Shalom, Olam!";
    }

    @RequestMapping("/salaam")
    public String saySalaam() {
        return "Salaam, Duniya!";
    }

    @RequestMapping("/szia")
    public String saySzia() {
        return "Szia, Világ!";
    }

    @RequestMapping("/yassas")
    public String sayYassas() {
        return "Yassas, Kosmos!";
    }

    @RequestMapping("/zdravo")
    public String sayZdravo() {
        return "Zdravo, Svete!";
    }

    @RequestMapping("/ola")
    public String sayOla() {
        return "Olá, Mundo!";
    }

    @RequestMapping("/merhaba")
    public String sayMerhaba() {
        return "Merhaba, Dünya!";
    }
}
