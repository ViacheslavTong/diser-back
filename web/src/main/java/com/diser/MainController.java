package com.diser;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main/")
public class MainController {

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public String getMark(@PathVariable("id") Long id) {
        return "id = " + id;
    }
}
