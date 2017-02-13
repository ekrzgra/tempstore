package tempstore.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reading {

	@Id
	private String id;
	private Date readingDate;
	private int temperatureValue;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getReadingDate() {
		return readingDate;
	}

	public void setReadingDate(Date readingDate) {
		this.readingDate = readingDate;
	}

	public int getTemperatureValue() {
		return temperatureValue;
	}

	public void setTemperatureValue(int temperatureValue) {
		this.temperatureValue = temperatureValue;
	}
}
