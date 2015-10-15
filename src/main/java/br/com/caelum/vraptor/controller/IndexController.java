package br.com.caelum.vraptor.controller;

import javax.inject.Inject;
import br.com.explorer.*;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

import static br.com.caelum.vraptor.view.Results.*;

@Controller
public class IndexController {

	private final Result result;

	/**
	 * @deprecated CDI eyes only
	 */
	protected IndexController() {
		this(null);
	}
	
	@Inject
	public IndexController(Result result) {
		this.result = result;
	}
	
	
	@Path("/{position}/{order}")
	public void index(String position, String order) {
	    String[] initLocation = position.split("-");
	    int Xaxis = Integer.parseInt(initLocation[0]);
	    int Yaxis = Integer.parseInt(initLocation[1]);
	    String InitDirection = initLocation[2];
	    
	    
	    Location location = new Location(Xaxis, Yaxis, InitDirection);
	    String[] movements = order.split("");
	    location.Move(movements);
		result.use(json()).from(location.toString()).serialize();
	}
	
}