package uk.co.boombastech.repositories;

import uk.co.boombastech.repositories.search.SearchCriteria;

import java.util.List;

public interface Repository<T extends RepositoryItem> {
	T create(T item);
	List<T> retrieve(SearchCriteria searchCriteria);
	T update(T item);
	void delete(T item);
}