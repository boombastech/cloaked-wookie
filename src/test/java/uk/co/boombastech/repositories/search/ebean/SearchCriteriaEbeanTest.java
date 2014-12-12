package uk.co.boombastech.repositories.search.ebean;

import com.avaje.ebean.ExpressionList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import uk.co.boombastech.authentication.models.User;
import uk.co.boombastech.repositories.search.SearchCriteria;
import uk.co.boombastech.repositories.search.comparisons.ComparisonType;
import uk.co.boombastech.repositories.search.comparisons.InvalidComparisonTypeException;
import uk.co.boombastech.xwing.models.Faction;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SearchCriteriaEbeanTest {

	private SearchCriteriaEbean searchCriteriaEbean;

	@Mock
	private ExpressionList<Faction> expressionList;

	private SearchCriteria<Faction> searchCriteria;

	@Before
	public void setUp() throws Exception {
		searchCriteriaEbean = new SearchCriteriaEbean();

		searchCriteria = new SearchCriteria<Faction>() {
			@Override
			public Class<Faction> getItemClass() {
				return Faction.class;
			}
		};
	}

	@Test
	public void shouldAddEqualsToComparisonExpressionList() throws Exception {
		searchCriteriaEbean.convertSearchCriteria(expressionList, searchCriteria.withComparison("fieldName", ComparisonType.equalTo, "fieldValue"));

		verify(expressionList).eq("fieldName", "fieldValue");
	}

	@Test
	public void shouldAddLessThanComparisonToExpressionList() throws Exception {
		searchCriteriaEbean.convertSearchCriteria(expressionList, searchCriteria.withComparison("fieldName", ComparisonType.lessThan, "fieldValue"));

		verify(expressionList).lt("fieldName", "fieldValue");
	}

	@Test
	public void shouldAddGreaterThanComparisonToExpressionList() throws Exception {
		searchCriteriaEbean.convertSearchCriteria(expressionList, searchCriteria.withComparison("fieldName", ComparisonType.greaterThan, "fieldValue"));

		verify(expressionList).gt("fieldName", "fieldValue");
	}
}