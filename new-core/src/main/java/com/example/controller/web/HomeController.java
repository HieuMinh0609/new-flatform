package com.example.controller.web;

import com.example.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "homeControllerOfWeb")
public class HomeController {
    @Autowired
    private INewService newService;
    @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("web/home");
        newService.save();
        return mav;
    }
}
