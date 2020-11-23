package gadour.springframework.sfgpetclinic.model.controllers;

import gadour.springframework.sfgpetclinic.model.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({ "/" , ""})
    public String listVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "/vets/index";
    }
}
