package gadour.springframework.sfgpetclinic.model.controllers;

import gadour.springframework.sfgpetclinic.model.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/" , ""})
    public String listOwner(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }
}
