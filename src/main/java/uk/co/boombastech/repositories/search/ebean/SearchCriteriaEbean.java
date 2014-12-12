package uk.co.boombastech.repositories.search.ebean;

import com.avaje.ebean.ExpressionList;
import uk.co.boombastech.repositories.RepositoryItem;
import uk.co.boombastech.repositories.search.SearchCriteria;
import uk.co.boombastech.repositories.search.comparisons.Comparison;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public class SearchCriteriaEbean {

	public <T extends RepositoryItem> ExpressionList<T> convertSearchCriteria(ExpressionList<T> expressionList, SearchCriteria<T> searchCriteria) {
		for (String field : searchCriteria.getCriterion().keySet()) {
			List<Comparison> comparisons = searchCriteria.getCriterion().get(field);

			for (Comparison comparison : comparisons) {
				switch (comparison.getComparisonType()) {
					case equalTo:
						expressionList.eq(field, comparison.getValue());
						break;
					case lessThan:
						expressionList.lt(field, comparison.getValue());
						break;
					case greaterThan:
						expressionList.gt(field, comparison.getValue());
						break;
				}
			}
		}

		return expressionList;
	}
}