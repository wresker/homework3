package geektime.spring.springbucks.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApolloController {
	@Value("${order.discount}")
    private String discount;

    @GetMapping("/getDiscount")
    public String getDiscount(){
        return discount;
    }
}
