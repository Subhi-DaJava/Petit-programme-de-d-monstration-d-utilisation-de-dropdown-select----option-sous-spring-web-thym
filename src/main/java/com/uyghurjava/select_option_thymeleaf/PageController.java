package com.uyghurjava.select_option_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {

    static List<String> designationList = null;
    static {
        designationList = new ArrayList<>();
        designationList.add("باشقۇرغۇچى");
        designationList.add("باشلىق");
        designationList.add("ئىشلەتكۈچى");
        designationList.add("تېخنىك");
        designationList.add("ئاچقۇچى");
        designationList.add("مەسلىھەتچى");
        designationList.add("سىناقچى");
    }

    @GetMapping("employee")
    public String getEmployeeForm(Model model){
        model.addAttribute("designationList", designationList);
        return "employee-form";
    }

    @PostMapping("/employee")
    public String submitEmployeeForm(@ModelAttribute("employeeForm") EmployeeForm employeeForm,
                                     Model model){

        model.addAttribute("data", employeeForm.toString());

        return "success";
    }

    @GetMapping("/form")
    public String home(){
        return "redirect:employee";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
