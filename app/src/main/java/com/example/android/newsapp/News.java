package com.example.android.newsapp;

/**
 * Created by novembergave on 23/12/2016.
 */

public class News {
    /**
     * Title of the news item
     */
    private String mTitle;

    /**
     * Section the news item
     */
    private String mSection;

    /**
     * Date of news item
     */
    private String mDate;

    /**
     * Website URL of the earthquake
     */
    private String mUrl;

    public News(String section, String title, String date, String url) {
        mSection = section;
        mTitle = title;
        mDate = date;
        mUrl = url;
    }


    public String getSection() {
        return mSection;
    }


    public String getTitle() {
        return mTitle;
    }


    public String getDate() {
        return mDate;
    }


    public String getUrl() {
        return mUrl;
    }
}
