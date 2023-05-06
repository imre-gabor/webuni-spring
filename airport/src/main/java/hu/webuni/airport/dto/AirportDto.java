package hu.webuni.airport.dto;

import jakarta.validation.constraints.Size;

public record AirportDto(long id, @Size(min = 3, max = 20) String name, String iata) {

	public AirportDto() {
		this(0, null, null);
	}
}