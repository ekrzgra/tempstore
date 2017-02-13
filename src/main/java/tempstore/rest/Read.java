package tempstore.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tempstore.dto.TempRead;

@RestController
public class Read {

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void save(TempRead reading) {

	}
}
