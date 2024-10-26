package example.spring_labs.preloading;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import example.spring_labs.data.Priority;
import example.spring_labs.repositories.PriorityRepository;

@Component
public class DataPreloader {

    @Bean
//    @Scope("prototype")
    public CommandLineRunner dataInitializer(PriorityRepository priorityRepository) {
        return args -> {
            priorityRepository.save(new Priority(1L, "High"));
            priorityRepository.save(new Priority(2L, "Medium"));
            priorityRepository.save(new Priority(3L, "Low"));
        };
    }
}
