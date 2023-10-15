package br.com.fernandomistura.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraEntrada")

//http://localhost:8080/primeiraEntrada/...
public class PrimeiraController {


    @GetMapping("/primeiroMetodo")
    public String primeiroTeste() {
        return "aewww - Funcionou";
    }
    
}
