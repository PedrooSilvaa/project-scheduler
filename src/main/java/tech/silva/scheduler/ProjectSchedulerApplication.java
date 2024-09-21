package tech.silva.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProjectSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSchedulerApplication.class, args);
	}

}
