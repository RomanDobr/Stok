package org.example.stok;

import org.example.worker.Worker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StokConfig {

    @Bean(name = "mishka")
    public Worker mishka() {
        return new Worker("Мишка");
    }

    @Bean(name = "zelya")
    public Worker zelya() {
        return new Worker("Зеля");
    }

    @Bean
    public Stok stok(@Qualifier("zelya") Worker worker) {
        return new Stok(worker);
    }
}
