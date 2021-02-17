package de.mab.spring.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by mbreuer on 17.02.21.
 */
@Service
public class ChuckNorrisQuoteService implements QuoteService {

    private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public String getRandomQuote() {

        return chuckNorrisQuotes.getRandomQuote();
    }
}
