package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainController {
    @GetMapping("/sbb")
    String main(){
        return "sbb에 오신걸 환영합니다.";
    }
}
