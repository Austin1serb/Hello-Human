package com.user.austin.hellohuman.assignment.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/")
public class HelloHumanController {

    @RequestMapping
    public String Hello(@RequestParam(value = "name", required = true) String name,
                        @RequestParam(value = "last_name", required = false) String lastName,
                        @RequestParam(value = "times", required = false) Integer times) {
        if (name == "") {
            name = "Human";
        }
        String greeting= "Hello, " + name;

        if (lastName!= null) {
            greeting += " " + lastName;
        }
        if (times!= null) {
            StringBuilder repeatedGreeting = new StringBuilder();
            for (int i = 0; i < times; i++) {
                repeatedGreeting.append(greeting).append("<br>");
            }
            return repeatedGreeting.toString();
        }

        return greeting;
    }

}
