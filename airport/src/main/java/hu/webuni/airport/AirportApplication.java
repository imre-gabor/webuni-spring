package hu.webuni.airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hu.webuni.airport.service.AirportService;
import hu.webuni.airport.service.PriceService;

@SpringBootApplication
public class AirportApplication implements CommandLineRunner {

	@Autowired
	private PriceService priceService;
	
	@Autowired
	AirportService airportService;
	
	//git proba
	public static void main(String[] args) {
		SpringApplication.run(AirportApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//airportService.createFlight();
		System.out.println(priceService.getFinalPrice(200));
		System.out.println(priceService.getFinalPrice(20000));
	}

}
