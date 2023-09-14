package application.controller;

import org.sprinframework.beans.factory.annotation.Autowired;
import org.sprinframework.stereotype.Controller;
import org.sprinframework.ui.Model;
import org.sprinframework.web.bind.annotation.RequestMapping;
import org.sprinframework.web.bind.annotation.RequestMethod;
import org.sprinframework.web.bind.annotation.RequestParam;

import application.model.Genero;
import applicatioin.model.GeneroRepository;

@Controller
@RequestMapping("/genero")
public class GeneroController {
    @Autowired
    private GeneroRepository generoRepo;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("generos", generoRepo.findAll());
        return "/genero/list";
    }

    @RequestMapping("/insert")
    public String insert() {
        return "/genero/insert";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public
}