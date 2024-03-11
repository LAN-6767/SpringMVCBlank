package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
    @RequestMapping("/")
    public  String getindex(){
        System.out.println("hello");
        return "/index.jsp";
    }
}
