package geektime.spring.springbucks.waiter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@Configuration
@EnableApolloConfig
@SpringBootApplication
public class WaiterServiceApplication {
	
	@Value("${order.discount}")
	private int order_discount;
	
	public static void main(String[] args) {
		SpringApplication.run(WaiterServiceApplication.class, args);
	}

	
}
