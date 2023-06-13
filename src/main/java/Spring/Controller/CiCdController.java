package Spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class CiCdController{

	@GetMapping("/paynow/{price}")
	public String paynow(@PathVariable int price)
	{
		return "payment with "+price+" is Success !";
	}
}

// http://localhost:8000/payment-provider/paynow/10