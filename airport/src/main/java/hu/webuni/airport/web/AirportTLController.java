package hu.webuni.airport.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hu.webuni.airport.model.Airport;

@Controller
public class AirportTLController {
	
	private List<Airport> allAirports = new ArrayList<>();
	
	{
		allAirports.add(new Airport(1, "Ferenc Liszt Airport", "BUD"));
	}

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/airports")
	public String listAirports(Map<String, Object> model) {
		model.put("airports", allAirports);
		model.put("newAirport", new Airport());
		return "airports";
	}
	
	@PostMapping("/airports")
	public String addAirport(Airport airport) {
		allAirports.add(airport);
		return "redirect:airports";
	}
}
