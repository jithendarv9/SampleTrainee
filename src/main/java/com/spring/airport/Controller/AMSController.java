package com.spring.airport.Controller;

import com.spring.airport.Dao.AMSimpl;
import com.spring.airport.POJO.AMSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.rmi.server.UID;
import java.util.List;


@Controller
public class AMSController {

    @Autowired
    AMSimpl amSimpl;
    static List<Integer> L=null;
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String InsertDate(Model model) {
        AMSystem E = new AMSystem();
       model.addAttribute("addpilot", E);
        model.addAttribute("msg", "Please Enter Your Login Details");
        return "insert";
    }

    @RequestMapping(value = "/SaveEmp", method = RequestMethod.POST)
    public String SaveEmp(Model model, @Valid @ModelAttribute("addpilot") AMSystem addpilot, BindingResult bs) {
        if (bs.hasErrors()) {

            return "insert";
        } else {
            addpilot.setUID(addpilot.getLicense().substring(addpilot.getLicense().length()-4)+31);
            addpilot.setAdreesId(addpilot.getCity().substring(addpilot.getLicense().length()-3)+101);
            String result = amSimpl.SaveEmp(addpilot);
            System.out.println(addpilot);
            model.addAttribute("result", result);
            return "insert";

        }
    }


  }
