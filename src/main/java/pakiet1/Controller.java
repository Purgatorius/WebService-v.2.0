package pakiet1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello!";
    }

    @GetMapping("/hello2")
    @ResponseBody
    public String hello2(@RequestParam(name = "name", required = false) String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/hello3/{name}")
    @ResponseBody
    public String hello3(@PathVariable("name") String name) {
        return "Hello " + name + " !";
    }

    @GetMapping("/add/{a}/{b}")
    @ResponseBody
    public String add(@PathVariable("a") int a, @PathVariable("b") int b) {
        int c = a +b;
        return a + " + " + b + " = " + c;
    }
}
