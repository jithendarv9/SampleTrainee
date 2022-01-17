package com.spring.airport.Controller;


import com.spring.airport.Dao.AMSimpl;
import com.spring.airport.POJO.LoginPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LoginController<HttpServletRequest, HttpServletResponse> {

    @Autowired
    AMSimpl amSimpl;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("login", new LoginPage());

        return "Login";
    }
    @RequestMapping( value="/Home", method = RequestMethod.GET)
    public String Home()
    {
        return "Admin";
    }

    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public String loginProcess(HttpServletRequest request, HttpServletResponse response,
                               @ModelAttribute("login") LoginPage login, Model model) {

        String S="";
        List<LoginPage> L= amSimpl.validateUser(login);

        if (L.size()==0) {
            S="Login";
            model.addAttribute("S1","Incorrect Username or password");
        } else {
            if(L.get(0).getUsertype().equals("admin"))
            {
                S="Admin";
            }
            else
            {
                S="Manager";
            }
        }

        return S;
    }

}