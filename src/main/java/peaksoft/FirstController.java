package peaksoft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greeting")

public class FirstController {


    @GetMapping
    public String hello(){
        return "hello";
    }


}
