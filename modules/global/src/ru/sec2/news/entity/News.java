package ru.sec2.news.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

@NamePattern("%s|newsCaption")
@Table(name = "NEWS_NEWS")
@Entity(name = "news$News")
public class News extends StandardEntity {
    private static final long serialVersionUID = -8812444646391880386L;

    @Lob
    @Column(name = "TEXT_OF_NEWS")
    protected String textOfNews;

    @Column(name = "STATUS")
    protected Integer status;

    @NotNull
    @Column(name = "NEWS_CAPTION", nullable = false, length = 100)
    protected String newsCaption;

    public void setStatus(NewsStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public NewsStatus getStatus() {
        return status == null ? null : NewsStatus.fromId(status);
    }


    public void setNewsCaption(String newsCaption) {
        this.newsCaption = newsCaption;
    }

    public String getNewsCaption() {
        return newsCaption;
    }


    public void setTextOfNews(String textOfNews) {
        this.textOfNews = textOfNews;
    }

    public String getTextOfNews() {
        return textOfNews;
    }



}