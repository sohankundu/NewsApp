package com.example.newsapp;

/**
 * A {@link News} object contains information related to a single news article.
 */
public class News {

    /** Title of the news article */
    private String mWebTitle;

    /** Name of the section to which the news article belongs */
    private String mSectionName;

    /** Date of publication of the news article */
    private String mWebPublicationDate;

    /** Web URL of the news article */
    private String mWebUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param webTitle is the title of the news article
     * @param sectionName is the name of the section to which the news article belongs
     * @param webPublicationDate is the date of publication of the news article
     * @param webUrl is the Web URL of the news article
     */
    public News(String webTitle, String sectionName, String webPublicationDate, String webUrl) {
        mWebTitle = webTitle;
        mSectionName = sectionName;
        mWebPublicationDate = webPublicationDate;
        mWebUrl = webUrl;
    }

    /**
     * Returns the title of the news article.
     */
    public String getWebTitle() {
        return mWebTitle;
    }

    /**
     * Returns the name of the section to which the news article belongs.
     */
    public String getSectionName() {
        return mSectionName;
    }

    /**
     * Returns the date of publication of the news article.
     */
    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }

    /**
     * Returns the Web URL of the news article.
     */
    public String getWebUrl() {
        return mWebUrl;
    }

}
