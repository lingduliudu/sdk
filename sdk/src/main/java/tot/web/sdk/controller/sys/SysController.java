package tot.web.sdk.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SysController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @RequestMapping("loading")
    public String loading(){
        return "loading";
    }
}
