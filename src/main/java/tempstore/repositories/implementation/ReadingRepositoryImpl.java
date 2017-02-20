package tempstore.repositories.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import tempstore.entities.Reading;
import tempstore.repositories.interfaces.ReadingRepository;

@Repository
public class ReadingRepositoryImpl implements ReadingRepository {

	@Override
	public List<Reading> findReadings() {
		return new ArrayList<>();
	}

}
