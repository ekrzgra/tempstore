package tempstore.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reading {

	@Id
	private long id;
	private LocalDate readingDate;
	private double temperatureValue;

	public Reading() {
		// empty constructor for Entity contract
	}

	public Reading(long id, LocalDate date, double value) {
		this.id = id;
		this.readingDate = date;
		this.temperatureValue = value;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getReadingDate() {
		return readingDate;
	}

	public void setReadingDate(LocalDate readingDate) {
		this.readingDate = readingDate;
	}

	public double getTemperatureValue() {
		return temperatureValue;
	}

	public void setTemperatureValue(double temperatureValue) {
		this.temperatureValue = temperatureValue;
	}

}
