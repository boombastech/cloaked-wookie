package uk.co.boombastech.repositories.stub;

import uk.co.boombastech.repositories.Repository;
import uk.co.boombastech.repositories.RepositoryItem;
import uk.co.boombastech.repositories.search.SearchCriteria;

import java.util.List;
import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;

public class StubRepository<T extends RepositoryItem> implements Repository<T> {

	private final Map<Integer, T> database;
	private int nextId;

	public StubRepository() {
		this.database = newHashMap();
		this.nextId = 1;
	}

	@Override
	public T create(T item) {
		if (item.getId() == null) {
			item.setId(nextId++);
		}
		database.put(item.getId(), item);
		return item;
	}

	@Override
	public List<T> retrieve(SearchCriteria searchCriteria) {
//		searchCriteria.getCriterion().



		return null;
	}

	@Override
	public T update(T item) {
		database.put(item.getId(), item);
		return item;
	}

	@Override
	public void delete(T item) {
		database.remove(item.getId());
	}
}