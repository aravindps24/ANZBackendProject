package com.anz.wholesale.backend.domain;

public class PageData {

	private int start;
	private int end;
	private int resultsPerPage;
	private String sortOrder;
	private int pageNumber;
	private String sortColumn;

	public String getSortColumn() {
		return sortColumn;
	}
	public void setSortColumn(String sortColumn) {
		this.sortColumn = sortColumn;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getResultsPerPage() {
		return resultsPerPage;
	}
	public void setResultsPerPage(int resultsPerPage) {
		this.resultsPerPage = resultsPerPage;
	}
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	@Override
	public String toString() {
		return "PageData [start=" + start + ", end=" + end + ", resultsPerPage=" + resultsPerPage + ", sortOrder="
				+ sortOrder + ", pageNumber=" + pageNumber + ", sortColumn=" + sortColumn + "]";
	}
	
}
