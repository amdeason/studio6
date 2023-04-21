package org.launchcode.studio6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}