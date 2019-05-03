package jth_midterm1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Subscmain {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"subscription-context.xml");
		SubscService subscriptionService = context
				.getBean("subscService", SubscService.class);

		subscriptionService.subscribe();
		subscriptionService.listSubsc();
		context.close();
}
}
