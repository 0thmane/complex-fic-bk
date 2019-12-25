package io.hitos.complexeficbk.redis;


public interface MessagePublisher {
    void publish(final String message);
}