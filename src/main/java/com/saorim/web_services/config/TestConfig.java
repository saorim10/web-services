package com.saorim.web_services.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.saorim.web_services.entity.Order;
import com.saorim.web_services.entity.User;
import com.saorim.web_services.entity.enums.OrderStatus;
import com.saorim.web_services.repository.OrderRepository;
import com.saorim.web_services.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Configuration
@Profile("test")
@RequiredArgsConstructor
public class TestConfig implements CommandLineRunner {
	
	private final UserRepository userRepository;
	private final OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Marcelo", "ma@email.com", "1111-1111", "123");
		User u2 = new User(null, "Melissa", "mel@email.com", "2222-2222", "234");
		User u3 = new User(null, "Sophie", "so@email.com", "3333-3333", "345");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.AGUARDANDO_PAGAMENTO, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.AGUARDANDO_PAGAMENTO, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.ENVIADO ,u1);
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	

}
