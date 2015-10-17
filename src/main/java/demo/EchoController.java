package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * Created by cdavis on 10/4/15.
 */
@Controller
public class EchoController {

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String get(Model model, @RequestParam String message) {
        model.addAttribute("message", message);
        return "echo";
    }
}
