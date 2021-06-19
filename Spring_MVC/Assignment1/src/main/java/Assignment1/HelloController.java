package Assignment1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @RequestMapping("/helloWorld")
    public ModelAndView sayHello(){
        ModelAndView modelAndView = new ModelAndView("helloWorld");
        return modelAndView;
    }
}
