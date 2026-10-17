package com.ensa.tp_one.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @Autowired
    private MyRestController myRestController;

    @GetMapping("/dashboard")
    public String viewDashboard(Model model) {
        model.addAttribute("produits", myRestController.findAllProduits());
        model.addAttribute("detailProduits", myRestController.findAllDetailProduits());
        model.addAttribute("categories", myRestController.findAllcategories());
        model.addAttribute("fournisseurs", myRestController.findAllFournisseurs());
        model.addAttribute("tags", myRestController.findAllTags());
        return "dashboard";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/dashboard";
    }
}
