package de.mab.spring.jokesapp.controller;

import de.mab.spring.jokesapp.services.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by mbreuer on 17.02.21.
 */
@Controller
public class QuoteController {

    private QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping({"/", ""})
    public String getQuote(Model model) {

        model.addAttribute("joke", quoteService.getRandomQuote());

        return "index";
    }
}
