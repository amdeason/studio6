package org.launchcode.studio6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping()
    public String displaySkills() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>Programming Languages</h2>" +
                "<ol>" +
                "<li>Javascript</li>" +
                "<li>Java</li>" +
                "<li>C#</li>" +
                "</ol>";
    }
    @GetMapping("form")
    public  String skillsForm() {
       String html =
               "<html>" +
                "<body>" +
                "<form method='post' action='/form'>" +
                "<label for='name'>Name:</label>" +
                "<input type='text' id='name' name='name'><br><br>" +
                "<label for 'flang1'>Favorite language:</label><br>" +
                "<select id='flang1' name='flang1'>" +
                   "<option value=''>--Please select an option--</option>" +
                   "<option value='javascript'>Javascript</option>" +
                   "<option value='java'>Java</option>" +
                   "<option value='csharp'>C#</option>" +
               "</select><br><br>" +
               "<label for 'flang2'>Second favorite language:</label><br>" +
               "<select id='flang2' name='flang2'>" +
                   "<option value=''>--Please select an option--</option>" +
                   "<option value='javascript'>Javascript</option>" +
                   "<option value='java'>Java</option>" +
                   "<option value='csharp'>C#</option>" +
               "</select><br><br>" +
               "<label for 'flang3'>Third favorite language:</label><br>" +
               "<select id='flang3' name='flang3'>" +
                   "<option value=''>--Please select an option--</option>" +
                   "<option value='Javascript'>Javascript</option>" +
                   "<option value='Java'>Java</option>" +
                   "<option value='C#'>C#</option>" +
               "</select><br><br>" +
               "<input type='submit' value='Submit'>" +
               "</form>" +
               "</body>" +
               "</html>";
       return html;
    }
    @PostMapping("form")
    public String processForm(@RequestParam String name, @RequestParam String flang1, @RequestParam String flang2, @RequestParam String flang3) {
        String html =
                "<html>" +
                        "<body>" +
                            "<h1>" + name + "<h1>" +
                            "<ol>" +
                            "<li>" + flang1 + "</li>"+
                            "<li>" + flang2 + "</li>" +
                            "<li>" + flang3 + "</li>" +
                        "</body>" +
                "</html>";
        return html;
    }
}