package com.rssreader;

/**
 * Created by tianyuelite on 6/30/15.
 */
public class RSSItem {

    private String title = null;
    private String description = null;
    private String link = null;
    private String pubdate = null;

    RSSItem() {
    }

    void setTitle(String value) {
        title = value;
    }

    void setDescription(String value) {
        description = value;
    }

    void setLink(String value) {
        link = value;
    }

    void setPubdate(String value) {
        pubdate = value;
    }


    String getLink() {
        return link;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return title;
    }


}