package com.grs.albergaria;

import com.grs.albergaria.case1.KafkaPublisher;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Factory
public class PublisherServiceApplication {

    private final KafkaPublisher kafkaPublisher1;
    private final KafkaPublisher kafkaPublisher2;

    @Inject
    public PublisherServiceApplication(@Named("kafkaPublisher1") KafkaPublisher kafkaPublisher1,
                                       @Named("kafkaPublisher2") KafkaPublisher kafkaPublisher2) {
        this.kafkaPublisher1 = kafkaPublisher1;
        this.kafkaPublisher2 = kafkaPublisher2;

    }

}
