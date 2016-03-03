package com.metadevgirl.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Jeseekia on 3/2/16.
 */

@Controller
public class GifController {

    @RequestMapping("/")
    @ResponseBody()
    public String listGifs() {

        return "List of all gifs";

    }
}
