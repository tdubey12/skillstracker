package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skills(){
        return  "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We Have a few skills we want to learn.Here is a list!</h2>" +
                "<ol>" +
                "  <li>Java</li>" +
                "  <li>JavaScript</li>" +
                "  <li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("form")
    @ResponseBody
    public String form(){

        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/form'>" +
                        "<label for=\"name\">Name:</label>" +
                        "<input type = 'text' name = 'name' id='name'/></br>" +
                        "<label for=\"f1\">My favorite language:</label>" +
                        "<select  name ='f1' id='f1'>" +
                        "<option value ='Java'>Java</option>" +
                        "<option value ='C'>C</option>" +
                        "<option value ='Python'>Python</option>" +
                        "<option value ='JavaScript'>JavaScript</option>" +
                        "</select></br>" +
                        "<label for=\"f2\">My second favorite language:</label>" +
                        "<select  name ='f2' id='f2'>" +
                        "<option value ='Java'>Java</option>" +
                        "<option value ='C'>C</option>" +
                        "<option value ='Python'>Python</option>" +
                        "<option value ='JavaScript'>JavaScript</option>" +
                        "</select></br>" +
                        "<label for=\"f3\">My third favorite language:</label>" +
                        "<select  name ='f3' id='f3'>" +
                        "<option value ='Java'>Java</option>" +
                        "<option value ='C'>C</option>" +
                        "<option value ='Python'>Python</option>" +
                        "<option value ='JavaScript'>JavaScript</option>" +
                        "</select></br>" +
                        "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }
    @PostMapping("form")
    @ResponseBody
    public String form(@RequestParam String name,@RequestParam String f1,@RequestParam String f2,@RequestParam String f3){
        return  "<html>" +
                "<body>" +
                "<h1>"+name+"</h1>" +

                "<ul>" +
                "  <li>"+f1+"</li>" +
                "  <li>"+f2+"</li>" +
                "  <li>"+f3+"</li>" +
                "</ul>" +
                "</body>" +
                "</html>";
    }

    }
