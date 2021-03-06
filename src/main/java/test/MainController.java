package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@Transactional
public class MainController {

    @Autowired
    private EventSerive eventSerive;

    @RequestMapping
    @Transactional
    public ModelAndView index() {
        Event event = new Event("testTitle", new Date());
        eventSerive.addEvent(event);
        return new ModelAndView("index");
    }
}
