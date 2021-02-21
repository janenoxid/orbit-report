package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String programmingLanguages(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Programming Languages</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>CSS</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

//    @RequestParam String name, @RequestParam String firstPick, @RequestParam String secondPick, @RequestParam String thirdPick)
    @GetMapping
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public static String createMessage(@RequestParam String name, @RequestParam String firstPick, @RequestParam String secondPick, @RequestParam String thirdPick){
        return name + "<br>" + firstPick + "<br>" + secondPick + "<br>" + thirdPick ;
    }



    @GetMapping("form")
    public String programmingForm(){
        return "<html>" +
                "<body>" +
                "<form action='/hello' method='post'>" + // submit a request to /hello
                "<table>" +
                "<tr>" +
                "<td>" +
                "<label>Name:" +
                "</td>" +
                "<td> " +
                "<input type ='text' name='name'> </input></label><br />" +
                "</td>" +
                "</tr>" +
                "<tr>" +
                "<td><label>First Pick: </td>" +
                "<td><select name='firstPick'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'CSS'> CSS </option>" +
                "</select>" +
                "</label> </td>" +
                "<BR />" +
                "<tr>" +
                "<td><label>Second Pick: </td>" +
                "<td><select name='secondPick'>" +
                    "<option value = 'Java'> Java </option>" +
                    "<option value = 'JavaScript'> JavaScript </option>" +
                    "<option value = 'CSS'> CSS </option>" +
                "</select> <BR /></select></label></td></tr>" +
                "<tr><td><label>Third Pick: </td><td><select name='thirdPick'>" +
                    "<option value = 'Java'> Java </option>" +
                    "<option value = 'JavaScript'> JavaScript </option>" +
                    "<option value = 'CSS'> CSS </option>" +
                "</td></select></label></tr>" +
                "<tr><td><input type = 'submit' value = 'Submit'></td></tr>" +
                "</form>" +
                "</table>" +
                "</body>" +
                "</html>";
    }
}
