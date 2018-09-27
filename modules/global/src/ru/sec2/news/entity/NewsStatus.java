package ru.sec2.news.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum NewsStatus implements EnumClass<Integer> {
    UNPUBLISHED(0),
    PUBLISHED(1);

    private Integer id;

    NewsStatus(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static NewsStatus fromId(Integer id) {
        for (NewsStatus at : NewsStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}