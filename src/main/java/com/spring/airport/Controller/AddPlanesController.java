package com.spring.airport.Controller;
import com.spring.airport.Dao.AddPlanesImpl;
import com.spring.airport.POJO.AddPlanes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
//import java.util.List;
@Controller
//@RequestMapping("/AddPlanesController")
public class AddPlanesController {
    @Autowired
    com.spring.airport.Dao.AddPlanesImpl AddPlanesImpl;
    //static List<Integer> L = null;

    @RequestMapping(value = "/addplanes", method = RequestMethod.GET)
    public String InsertData(Model model) {
        AddPlanes AP = new AddPlanes();
        model.addAttribute("AddPlanes", AP);
        return "addplanes";
    }

    @RequestMapping(value = "/SavePlanes", method = RequestMethod.POST)
    public String SavePlanes(Model model, @Valid @ModelAttribute("AddPlanes") AddPlanes AP, BindingResult bs) {
        if (bs.hasErrors()) {
            return "addplanes";
        } else
        {

            System.out.println(AP);
            String result = AddPlanesImpl.SavePlanes(AP);
            model.addAttribute("result", result);
            return "addplanes";
        }

    }
}