package com.events.statrts.SpringEvents;

import com.events.statrts.publisher.BigBangEvent;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringEventsApplication {


	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringEventsApplication.class);
	}
}
