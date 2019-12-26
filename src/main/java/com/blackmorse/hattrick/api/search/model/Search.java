package com.blackmorse.hattrick.api.search.model;

import com.blackmorse.hattrick.model.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Search extends Model {
    @JacksonXmlProperty(localName = "SearchParams")
    private SearchParams searchParams;
    @JacksonXmlProperty(localName = "PageIndex")
    private Integer pageIndex;
    @JacksonXmlProperty(localName = "Pages")
    private Integer pages;
    @JacksonXmlProperty(localName = "SearchResults")
    private List<Result> searchResults;

    public SearchParams getSearchParams() {
        return searchParams;
    }

    public void setSearchParams(SearchParams searchParams) {
        this.searchParams = searchParams;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public List<Result> getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(List<Result> searchResults) {
        this.searchResults = searchResults;
    }
}
