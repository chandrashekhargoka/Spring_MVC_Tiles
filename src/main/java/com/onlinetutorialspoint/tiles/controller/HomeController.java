package com.onlinetutorialspoint.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "home";
    }

    @RequestMapping(value = { "/admin" }, method = RequestMethod.GET)
    public String productsPage(ModelMap model) {
        return "admin";
    }

    @RequestMapping(value = { "/user" }, method = RequestMethod.GET)
    public String contactUsPage(ModelMap model) {
        return "user";
    }
}
