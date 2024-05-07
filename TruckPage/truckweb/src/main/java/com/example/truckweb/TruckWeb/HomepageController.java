package com.example.truckweb.TruckWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomepageController {

    @RequestMapping("/")
    public String index(){
        return "home";
    }

    @RequestMapping("/faq")
    public String  page(){return "FAQ";}

    @RequestMapping("/about")
    public String page1(){return "about";}

    @RequestMapping("/warehousing")
    public String page2(){return "warehousing";}

    @RequestMapping("/contact")
    public String page3(){return "contact";}

    @RequestMapping("/request-a-quote")
    public String page4(){return "request-a-quote";}

    @RequestMapping("/trucking-services")
    public String page5(){return "trucking-services";}

    @RequestMapping("/thankyou")
    public String page6(){return "thankyou";}
}
