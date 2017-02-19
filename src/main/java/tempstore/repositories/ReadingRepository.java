package tempstore.repositories;

import java.util.List;

import tempstore.entities.Reading;

public interface ReadingRepository {

	List<Reading> findReadings();
}
