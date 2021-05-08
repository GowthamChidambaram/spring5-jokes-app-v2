package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Service;

/**
 * Created by Gowtham C on 08/05/21.
 */

@Service
public class JokeServiceImpl implements JokeService {

  private final ChuckNorrisQuotes chuckNorrisQuotes;

  public JokeServiceImpl() {
    this.chuckNorrisQuotes = new ChuckNorrisQuotes();
  }

  @Override
  public String getJoke() {
    return chuckNorrisQuotes.getRandomQuote();

  }
}
