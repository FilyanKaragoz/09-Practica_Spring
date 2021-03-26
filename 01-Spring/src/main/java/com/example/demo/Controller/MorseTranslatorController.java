package com.example.demo.Controller;

import com.example.demo.Entities.Message;
import com.example.demo.Services.MorseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Morse")

public class MorseTranslatorController {

    @GetMapping("/translate")
    public Message translateMorse(@RequestParam(value = "morse") String morse){

        return new Message(MorseService.translate(morse),morse );


    }

}
