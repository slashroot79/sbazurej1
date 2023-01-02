package outpkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/out")
public class OutController {
	
	
	@GetMapping("")
	public String out() {
		return "Now tabled";
	}

}
