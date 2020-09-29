package com.kgc.controller;

import com.kgc.pojo.Attence;
import com.kgc.service.AttenceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AttenceContrller {
    @Resource
    AttenceService attenceService;
    @RequestMapping("/list")
    public String list(Model model){
        List<Attence> list=attenceService.getlist();
        model.addAttribute("list",list);
        return "/index";
    }
    @RequestMapping("/add")
    public String add(Attence attence){
        int i=attenceService.add(attence);
        return "redirect:list";
    }
}
