package io.hitos.complexeficbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComplexeFicBkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplexeFicBkApplication.class, args);
	}
/*
	@Bean
	MessagePublisher redisPublisher() {
	    return new MessagePublisherImpl(redisTemplate(), topic());
	}
	
	@Bean
	ChannelTopic topic() {
	    return new ChannelTopic("messageQueue");
	}
@Bean
JedisConnectionFactory jedisConnectionFactory() {
    return new JedisConnectionFactory();
}
@Bean
public RedisTemplate<String, Object> redisTemplate() {
    final RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
    template.setConnectionFactory(jedisConnectionFactory());
    template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
    return template;
}
*/
}
