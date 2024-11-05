package com.grs.albergaria;

import com.grs.albergaria.case1.KafkaPublisher;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Factory
public class PublisherServiceApplication {

    private final KafkaPublisher kafkaPublisher;

    @Inject
    public PublisherServiceApplication(@Named("aaa") KafkaPublisher kafkaPublisher) {
        this.kafkaPublisher = kafkaPublisher;
    }

}
