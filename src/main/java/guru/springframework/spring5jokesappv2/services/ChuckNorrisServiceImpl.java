package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisServiceImpl implements ChuckNorrisService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public ChuckNorrisServiceImpl()
	{
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getChuckNorrisQuote()
	{
		return chuckNorrisQuotes.getRandomQuote();
	}
}
