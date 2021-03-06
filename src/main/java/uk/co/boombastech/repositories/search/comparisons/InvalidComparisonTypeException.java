package uk.co.boombastech.repositories.search.comparisons;

public class InvalidComparisonTypeException extends Exception {
	private final ComparisonType comparisonType;

	public InvalidComparisonTypeException(ComparisonType comparisonType) {
		this.comparisonType = comparisonType;
	}

	public ComparisonType getComparisonType() {
		return comparisonType;
	}

	@Override
	public synchronized Throwable fillInStackTrace() {
		return this;
	}
}