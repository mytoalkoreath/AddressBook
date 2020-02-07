package SpringApp;



import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;

@Controller
public class GreetingController {

    @Autowired
    private AddressRepo rep;
    @Autowired
    private BuddyRepo brep;

    private String currName;

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }


    @GetMapping("/start")
    public String createAB(Model model){
        model.addAttribute("greeting", new Greeting());
        return "start";
    }

    @GetMapping("/switch")
    public String switchAB(Model model){
        model.addAttribute("greeting", new Greeting());
        return "switch";
    }


    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "create";
    }

    @GetMapping("/delete")
    public String delete(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "delete";
    }

    @PostMapping("/start")
    public String startSubmit(@ModelAttribute Greeting greeting, Model m) {
        AddressBook a = new AddressBook();
        a.setName(greeting.getId());
        currName = greeting.getId();
        rep.save(a);
        return "startresult";
    }

    @PostMapping("/switch")
    public String switchSubmit(@ModelAttribute Greeting greeting, Model m) {
        String name = greeting.getId();
        AddressBook a = rep.findByName(name);
        if(a!= null){
            currName = name;
        }else{
            currName = name;
            a = new AddressBook();
            a.setName(greeting.getId());
            rep.save(a);
        }
        return "switchresult";
    }


    @PostMapping("/create")
    public String createSubmit(@ModelAttribute Greeting greeting, Model m) {
        AddressBook a = rep.findByName(currName);
        BuddyInfo b = new BuddyInfo(greeting.getId(), greeting.getContent());
        a.addBuddy(b);

        m.addAttribute("Book1", a);
        brep.save(b);
        rep.save(a);
        return "result";
    }

    @PostMapping("/delete")
    public String deleteSubmit(@ModelAttribute Greeting greeting, Model m) {
        AddressBook a = rep.findByName(currName);

        a.removeBuddy(greeting.getId());
        m.addAttribute("Book1", a);
        rep.save(a);
        return "result";
    }


}
