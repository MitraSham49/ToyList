package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Autowired
    ToyRepository toyList;
    @GetMapping("/show")
    public @ResponseBody
    String show(Model model)
    {
        model.addAttribute("toys",toyList.findAll());
        return "Devices in the list:"+toyList.toString();
    }
    @GetMapping("/list")
    public String showForm(Model model)
    {
        model.addAttribute("toys",toyList.findAll());
        return "list";
    }
    @RequestMapping("/add")
    public String addDevice(@ModelAttribute("theToy") Toy toy)
    {
        toyList.save(toy);
        return "redirect:/list";
    }

    @RequestMapping("/")
    public String showIndexHtml(Model model)
    {
        model.addAttribute("theToy",new Toy());
        return "index";
    }


}
