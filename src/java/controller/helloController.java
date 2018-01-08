/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author A685792
 */

@Controller
@RequestMapping("/say")
public class helloController {

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String hello(){
    return "helloWorld";
  }

  @RequestMapping(value = "/helloMAV", method = RequestMethod.GET)
  public ModelAndView helloMAV(){
    return new ModelAndView("helloWorld");
  }
  

}
