package org.example.datecharts;

import java.io.Serializable;
import java.util.GregorianCalendar;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.richfaces.ui.output.chart.ChartDataModel.ChartType;
import org.richfaces.ui.output.chart.DateChartDataModel;
import org.richfaces.ui.output.chart.NumberChartDataModel;

@ViewScoped
@ManagedBean
public class RichBean implements Serializable {

    private static final long serialVersionUID = -6239437588285327644L;

    private String name;
    private NumberChartDataModel model;
    private DateChartDataModel dateModel;


    @PostConstruct
    public void postContruct() {
        name = "John";
        model = new NumberChartDataModel(ChartType.line);
        model.put(1, 3);
        model.put(2, 3);
        model.put(3, 4);
        model.put(4, 5);

        dateModel = new DateChartDataModel(ChartType.line);
        dateModel.put(new GregorianCalendar(2013, 4, 1).getTime(), 4);
        dateModel.put(new GregorianCalendar(2013, 4, 2).getTime(), 5);
        dateModel.put(new GregorianCalendar(2013, 4, 3).getTime(), 6);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NumberChartDataModel getModel() {
        return model;
    }

    public DateChartDataModel getDateModel() {
        return dateModel;
    }
}