package ru.sec2.news.web.news;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Accordion;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.HtmlBoxLayout;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import ru.sec2.news.entity.News;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NewsBrowse extends AbstractLookup {

    @Inject
    private HtmlBoxLayout textFiledHTML;
    @Inject
    private HtmlBoxLayout htmlText2;
    @Inject
    private DataManager dataManager;
    @Inject
    private GroupTable<News> newsTable;
    @Inject
    private Accordion accordion;
    @Inject
    private ComponentsFactory componentsFactory;
    String strin;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);
        unusedMethod();
        System.out.println(HtmlBoxLayout.class);
    }

    public void publicNews(){
        System.out.println("PUBLIC WORKS");
        accordion.addTab("FIRST TAB", componentsFactory.createComponent("com.haulmont.cuba.gui.components.HtmlBoxLayout"));
    }


    public void unpublicNews(){
        System.out.println("unPUBLIC WORKS");
    }

    public void unusedMethod (){
        accordion.getTab("tab").setCaption("According");
         dataManager.loadValue("select c.textOfNews from news$News c where c.newsCaption = :id", String.class)
                .parameter("id", "Accordion").one();
        textFiledHTML.setTemplateContents(strin);

        accordion.getTab("tab2").setCaption("Datasources");
        String strin1 = dataManager.loadValue("select c.textOfNews from news$News c where c.newsCaption = :id2", String.class)
                .parameter("id2", "Datasources").one();
        htmlText2.setTemplateContents(strin1);
    }
}


















