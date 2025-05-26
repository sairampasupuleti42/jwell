// My first controller in springboot app

package com.raadhyacollections.jwell.controllers;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/settings")
public class SettingsController {
    @GetMapping
    public String getMethodName() {
        return "Settings page is disabled for now";
    }

    @GetMapping("/show")
    public String index() {
        return this.getSettings();
    }

    public String getSettings() {
        return "Settings data";
    }

}
