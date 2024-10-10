package JavaApplications.Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App 
{
	// @PostMapping("/sum")
	// Anstatt @PostMapping("/sum") => RequestMapping, JMV sucht dann das passende raus
	 @RequestMapping(value = "/sum", method = { RequestMethod.GET, RequestMethod.POST })
	// public int calculateSum(@RequestBody Number numbers) throws Exception {
	 public int calculateSum() throws Exception {
		System.out.println("TWO");
	    try {
			System.out.println("ONE");
			// return numbers.getNumber1() + numbers.getNumber2();
			return 45;
		} catch (Exception e) {
			return 0;
		}
	}

    public static void main(String[] args) throws Exception {
    	System.out.println("THREE");
        SpringApplication.run(App.class, args);
    }
}
