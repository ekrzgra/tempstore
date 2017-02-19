package tempstore.web.controller;

import static org.hamcrest.Matchers.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import tempstore.entities.Reading;
import tempstore.repositories.ReadingRepository;

public class HomeControllerTest {

	@Test
	public void testHomePage() throws Exception {
		ReadingRepository mockRepository = mock(ReadingRepository.class);
		List<Reading> readings = createReadings();
		when(mockRepository.findReadings()).thenReturn(readings);

		HomeController controller = new HomeController(mockRepository);
		MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/")).andExpect(view().name("home")).andExpect(model().attributeExists("readingList"))
				.andExpect(model().attribute("readingList", hasItems(readings.toArray())));
	}

	private List<Reading> createReadings() {
		return Arrays.asList(new Reading(1, LocalDate.now().minusDays(1), 12.5),
				new Reading(2, LocalDate.now().minusDays(2), 2.5), new Reading(3, LocalDate.now().minusDays(3), 5.55));
	}
}
