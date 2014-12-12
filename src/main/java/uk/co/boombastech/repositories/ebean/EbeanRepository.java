package uk.co.boombastech.repositories.ebean;

import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.ExpressionList;
import uk.co.boombastech.repositories.Repository;
import uk.co.boombastech.repositories.RepositoryItem;
import uk.co.boombastech.repositories.search.SearchCriteria;
import uk.co.boombastech.repositories.search.ebean.SearchCriteriaEbean;

import javax.inject.Inject;
import java.util.List;

public class EbeanRepository<T extends RepositoryItem> implements Repository<T> {

	private final EbeanServer ebeanServer;
	private final SearchCriteriaEbean searchCriteriaEbean;

	@Inject
	public EbeanRepository(EbeanServer ebeanServer, SearchCriteriaEbean searchCriteriaEbean) {
		this.ebeanServer = ebeanServer;
		this.searchCriteriaEbean = searchCriteriaEbean;
	}

	@Override
	public T create(T item) {
		ebeanServer.save(item);
		return item;
	}

	@Override
	public List<T> retrieve(SearchCriteria searchCriteria) {
		ExpressionList<T> expressionList = ebeanServer.find(searchCriteria.getItemClass()).where();
		ExpressionList<T> populatedExpressionList = searchCriteriaEbean.convertSearchCriteria(expressionList, searchCriteria);
		return populatedExpressionList.findList();
	}

	@Override
	public T update(T item) {
		ebeanServer.save(item);
		return item;
	}

	@Override
	public void delete(T item) {
		ebeanServer.delete(item);
	}
}