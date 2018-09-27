package ru.sec2.news.web.screens;

import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.Accordion;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

import javax.inject.Inject;
import java.util.Map;

public class PublicNews extends AbstractWindow {

    @Inject
    private Accordion newsAccordion;
    @Inject
    private ComponentsFactory componentsFactory;


    @Override
    public void init(Map<String, Object> params) {
        super.init(params);
        newsAccordion.addTab("FIRST TAB", componentsFactory.createComponent("htmlBox"));
        newsAccordion.getTab("FIRST TAB").setCaption("FIRST TAB");
    }

    public void createTable(){

        newsAccordion.addTab("FIRST TAB", componentsFactory.createComponent("htmlBox"));
        newsAccordion.getTab("FIRST TAB").setCaption("FIRST TAB");
    }
}