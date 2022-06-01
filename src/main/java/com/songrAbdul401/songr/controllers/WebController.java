package com.songrAbdul401.songr.controllers;


import com.songrAbdul401.songr.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
@RequestMapping("/")
public class WebController {

    @GetMapping ()
    @ResponseBody
    public String splash(){
        return "Splash";
    }

    @GetMapping ("/hello")
    public String greeting(){
        return "hello";
    }

    @GetMapping ("/capitalize/{word}")
    public String capitalizeWord(Model m, @PathVariable String word) {
        m.addAttribute("capitalizedWords", word.toUpperCase());

        return "capitalize";

    }

     {

    }



}
