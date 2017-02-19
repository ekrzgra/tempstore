package tempstore.dto;

import java.time.LocalDate;

public class ReadingDto {

	private LocalDate date;
	private double value;

	public ReadingDto(LocalDate date, double value) {
		this.date = date;
		this.value = value;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getValue() {
		return value;
	}

}
