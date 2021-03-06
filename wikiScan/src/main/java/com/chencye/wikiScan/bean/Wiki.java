package com.chencye.wikiScan.bean;

public class Wiki {
    private String title;
    private String[] tags;
    
    private String lastModified;
    
    private String url;
    
    public Wiki(String url, String lastModified) {
        super();
        this.url = url;
        this.lastModified = lastModified;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String[] getTags() {
        return tags;
    }
    
    public void setTags(String[] tags) {
        this.tags = tags;
    }
    
    public String getLastModified() {
        return lastModified;
    }
    
    public String getUrl() {
        return url;
    }
    
}
