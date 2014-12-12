package uk.co.boombastech.repositories.search;

import uk.co.boombastech.repositories.RepositoryItem;
import uk.co.boombastech.repositories.search.comparisons.Comparison;
import uk.co.boombastech.repositories.search.comparisons.ComparisonType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class SearchCriteria<T extends RepositoryItem> {

	private Map<String, List<Comparison>> criterion;

	public SearchCriteria() {
		criterion = new HashMap<String, List<Comparison>>();
	}

	public abstract Class<T> getItemClass();

	public <S> SearchCriteria<T> withComparison(Comparison<S> comparison) {
		if (!criterion.containsKey(comparison.getFieldName())) {
			criterion.put(comparison.getFieldName(), new ArrayList<Comparison>());
		}

		criterion.get(comparison.getFieldName()).add(comparison);
		return this;
	}

	public <S> SearchCriteria<T> withComparison(String field, ComparisonType comparisonType, S value) {
		return withComparison(new Comparison<>(comparisonType, field, value));
	}

	public Map<String, List<Comparison>> getCriterion() {
		return criterion;
	}
}