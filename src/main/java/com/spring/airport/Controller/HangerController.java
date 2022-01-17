package com.spring.airport.Controller;
import com.spring.airport.Dao.HangerImpl;
import com.spring.airport.POJO.AddPlanes;
import com.spring.airport.POJO.BookedDetails;
import com.spring.airport.POJO.HangerDetails;
import com.spring.airport.POJO.hangerstatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
//@RequestMapping("/HangerController")
public class HangerController {
    @Autowired
    HangerImpl hangerImpl;
    String s="";
    String s1="";
    @GetMapping("/Hanger")
    public String InsertData(Model model) {
        HangerDetails H = new HangerDetails();

        model.addAttribute("hanger", H);
        return "Hanger";
    }
    @GetMapping("/Search")
    public String Search(Model model) {
        BookedDetails B=new BookedDetails();
        model.addAttribute("booked",B);
        return "Search";
    }
    @RequestMapping(value = "/SaveHanger", method = RequestMethod.POST)
    public String SaveHanger(Model model, @Valid @ModelAttribute("hanger") HangerDetails hanger,BindingResult bs) {

        if (bs.hasErrors()) {
            System.out.println("savingdata");


            return "Hanger";
        } else {
            hanger.setAvailableCapacity(hanger.getHangerCapacity());
            hanger.setHangerNumber(String.valueOf(Math.round(Math.random()*100+101)));
            hanger.setAddressId(hanger.getCity().substring(0,3) + Math.round(Math.random()*100+101));
            hanger.setManagerId(hanger.getSocialSecurityNo().substring(hanger.getSocialSecurityNo().length()-4)+ Math.round(Math.random()*100+31));
            String result = hangerImpl.SaveHanger(hanger);
            model.addAttribute("result", result);
            System.out.println(result);

            return "Hanger";
        }

    }
    @RequestMapping(value = "hangerstatus4", method = RequestMethod.POST)
    public String hangerstatus(Model model,@RequestParam("fromdate") String fromdate, @RequestParam("todate") String todate) {

        SimpleDateFormat F=new SimpleDateFormat("yyyy-MM-dd");


        List<AddPlanes> result4=hangerImpl.getPlaneNo();
        s=fromdate;
        s1=todate;
        try {
            Date dt = F.parse(fromdate);
            Date dt1=F.parse(todate);
            List<HangerDetails> result1 = hangerImpl.SeachHanger1(dt,dt1);


            model.addAttribute("L",result1);
            model.addAttribute("L1",result4);


        }
        catch(ParseException e){}


        return "Search";
    }
    @GetMapping("/extracthanger/{id}/{id1}")
    public String extract(@PathVariable String id,@PathVariable String id1,Model model)
    {
        BookedDetails B=new BookedDetails();
        SimpleDateFormat F=new SimpleDateFormat("yyyy-MM-dd");
        B.setHangerNumber((int) Math.round(Math.random()*100+101));
        String s3="";
        try {
            Date dt = F.parse(s);
            Date dt1=F.parse(s1);
            int n1=Integer.parseInt(id);
            int n2=Integer.parseInt(id1);
             s3=hangerImpl.SaveBooked(n1,n2,dt,dt1,B);

        }
        catch(ParseException e){}
        model.addAttribute("msg",s3);
        System.out.println(s3);
        return "Search";
    }
    @RequestMapping(value="/hangerstatus",method=RequestMethod.GET)
    public String HangerStatus(Model model){
        List<HangerDetails> list=hangerImpl.gethangernumber();
        model.addAttribute("list",list);
        return "hangerstatus";
    }
    @RequestMapping("/hangerstatus2/{id1}/{id2}/{id3}")
    public ModelAndView hangerstatus2(@PathVariable String id1, @PathVariable String id2, @PathVariable String id3, Model model) throws ParseException {
        hangerstatus list2=hangerImpl.gethangerstatus(id1,id2,id3);
        model.addAttribute("list2",list2);
        return new ModelAndView("hangerstatus2","list2",list2);
    }


}


