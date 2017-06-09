package com.volley.demo.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by rupesh on 9/6/17.
 */

public class UpcomingMovieListAPI {

    private static UpcomingMovieListAPI.upcommingMovieAPIResponse upcommingMovieAPIResponse;

    public static UpcomingMovieListAPI.upcommingMovieAPIResponse getUpcommingMovieAPIResponse() {
        return upcommingMovieAPIResponse;
    }

    public static void setUpcommingMovieAPIResponse(UpcomingMovieListAPI.upcommingMovieAPIResponse upcommingMovieAPIResponse) {
        UpcomingMovieListAPI.upcommingMovieAPIResponse = upcommingMovieAPIResponse;
    }

    public static class Dates {
        @JsonProperty("maximum")
        private String maximum;
        @JsonProperty("minimum")
        private String minimum;

        @JsonProperty("maximum")
        public String getMaximum() {
            return maximum;
        }

        @JsonProperty("maximum")
        public void setMaximum(String maximum) {
            this.maximum = maximum;
        }

        @JsonProperty("minimum")
        public String getMinimum() {
            return minimum;
        }

        @JsonProperty("minimum")
        public void setMinimum(String minimum) {
            this.minimum = minimum;
        }
    }

    public static class upcommingMovieAPIResponse {

        @JsonProperty("results")
        private List<Result> results = null;
        @JsonProperty("page")
        private Integer page;
        @JsonProperty("total_results")
        private Integer totalResults;
        @JsonProperty("dates")
        private Dates dates;
        @JsonProperty("total_pages")
        private Integer totalPages;

        @JsonProperty("results")
        public List<Result> getResults() {
            return results;
        }

        @JsonProperty("results")
        public void setResults(List<Result> results) {
            this.results = results;
        }

        @JsonProperty("page")
        public Integer getPage() {
            return page;
        }

        @JsonProperty("page")
        public void setPage(Integer page) {
            this.page = page;
        }

        @JsonProperty("total_results")
        public Integer getTotalResults() {
            return totalResults;
        }

        @JsonProperty("total_results")
        public void setTotalResults(Integer totalResults) {
            this.totalResults = totalResults;
        }

        @JsonProperty("dates")
        public Dates getDates() {
            return dates;
        }

        @JsonProperty("dates")
        public void setDates(Dates dates) {
            this.dates = dates;
        }

        @JsonProperty("total_pages")
        public Integer getTotalPages() {
            return totalPages;
        }

        @JsonProperty("total_pages")
        public void setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
        }

    }

    public static class Result {

        @JsonProperty("vote_count")
        private Integer voteCount;
        @JsonProperty("id")
        private Integer id;
        @JsonProperty("video")
        private Boolean video;
        @JsonProperty("vote_average")
        private Integer voteAverage;
        @JsonProperty("title")
        private String title;
        @JsonProperty("popularity")
        private Float popularity;
        @JsonProperty("poster_path")
        private String posterPath;
        @JsonProperty("original_language")
        private String originalLanguage;
        @JsonProperty("original_title")
        private String originalTitle;
        @JsonProperty("genre_ids")
        private List<Integer> genreIds = null;
        @JsonProperty("backdrop_path")
        private String backdropPath;
        @JsonProperty("adult")
        private Boolean adult;
        @JsonProperty("overview")
        private String overview;
        @JsonProperty("release_date")
        private String releaseDate;

        @JsonProperty("vote_count")
        public Integer getVoteCount() {
            return voteCount;
        }

        @JsonProperty("vote_count")
        public void setVoteCount(Integer voteCount) {
            this.voteCount = voteCount;
        }

        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(Integer id) {
            this.id = id;
        }

        @JsonProperty("video")
        public Boolean getVideo() {
            return video;
        }

        @JsonProperty("video")
        public void setVideo(Boolean video) {
            this.video = video;
        }

        @JsonProperty("vote_average")
        public Integer getVoteAverage() {
            return voteAverage;
        }

        @JsonProperty("vote_average")
        public void setVoteAverage(Integer voteAverage) {
            this.voteAverage = voteAverage;
        }

        @JsonProperty("title")
        public String getTitle() {
            return title;
        }

        @JsonProperty("title")
        public void setTitle(String title) {
            this.title = title;
        }

        @JsonProperty("popularity")
        public Float getPopularity() {
            return popularity;
        }

        @JsonProperty("popularity")
        public void setPopularity(Float popularity) {
            this.popularity = popularity;
        }

        @JsonProperty("poster_path")
        public String getPosterPath() {
            return posterPath;
        }

        @JsonProperty("poster_path")
        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }

        @JsonProperty("original_language")
        public String getOriginalLanguage() {
            return originalLanguage;
        }

        @JsonProperty("original_language")
        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
        }

        @JsonProperty("original_title")
        public String getOriginalTitle() {
            return originalTitle;
        }

        @JsonProperty("original_title")
        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
        }

        @JsonProperty("genre_ids")
        public List<Integer> getGenreIds() {
            return genreIds;
        }

        @JsonProperty("genre_ids")
        public void setGenreIds(List<Integer> genreIds) {
            this.genreIds = genreIds;
        }

        @JsonProperty("backdrop_path")
        public String getBackdropPath() {
            return backdropPath;
        }

        @JsonProperty("backdrop_path")
        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        @JsonProperty("adult")
        public Boolean getAdult() {
            return adult;
        }

        @JsonProperty("adult")
        public void setAdult(Boolean adult) {
            this.adult = adult;
        }

        @JsonProperty("overview")
        public String getOverview() {
            return overview;
        }

        @JsonProperty("overview")
        public void setOverview(String overview) {
            this.overview = overview;
        }

        @JsonProperty("release_date")
        public String getReleaseDate() {
            return releaseDate;
        }

        @JsonProperty("release_date")
        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

    }

}
