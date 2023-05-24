package com.ontu.lab6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class webcontroller {

    @RequestMapping(value = "/index")
    public String index(Model model) {
        char[][] board = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'X', 'O', 'X'}
        };
        model.addAttribute("board", board);
        return "index";
    }
}
