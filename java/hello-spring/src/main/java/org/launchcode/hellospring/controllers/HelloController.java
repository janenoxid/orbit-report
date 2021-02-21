package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("hello")
public class HelloController {

    // Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    // Handles request at path /hello
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye, Spring!";
    }


    // Handles request of the form /hello?name=LaunchCode
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name, Model model){
        String greeting = "Hellooooo, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    // Handles requests for the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name, Model model){
        String greeting = "Hello there, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }


    @ResponseBody
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public static String createMessage(@RequestParam String lang, @RequestParam String name){
        String greeting2;
        if(lang.equals("French")){
            greeting2 = "Bonjour";
        } else if (lang.equals("Spanish")){
            greeting2 = "Buenos dias";
        } else if (lang.equals("Czech")){
            greeting2 = "Dobry den";
        } else if (lang.equals("Japanese")){
            greeting2 = "Konnichiwa";
        } else greeting2 = "Hello";
        return "<h1>" + greeting2 + " " + name + "!</h1>";
    }

    @GetMapping("form")
    public String helloForm(){
        return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return "hello-list";
    }

}
