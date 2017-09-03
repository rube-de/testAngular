package tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import tutorial.entities.BlogEntry;

@Controller
public class BlogEntryController {
	@RequestMapping(value="/test", method = RequestMethod.POST)
	public @ResponseBody BlogEntry test(@RequestBody BlogEntry entry) {

		return entry;
	}

}
