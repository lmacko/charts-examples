package org.example.datecharts;

import java.io.Serializable;
import java.util.GregorianCalendar;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.richfaces.model.ChartDataModel.ChartType;
import org.richfaces.model.NumberChartDataModel;
import org.richfaces.model.PlotClickEvent;
import org.richfaces.model.StringChartDataModel;

//import org.richfaces.ui.output.chart.ChartDataModel.ChartType;
//import org.richfaces.ui.output.chart.DateChartDataModel;
//import org.richfaces.ui.output.chart.NumberChartDataModel;

@ViewScoped
@ManagedBean
public class RichBean implements Serializable {

    private static final long serialVersionUID = -6239437588285327644L;

    private String name;
    private NumberChartDataModel model;
    private NumberChartDataModel numberBar;
    private StringChartDataModel pie;
    private StringChartDataModel bar;
    private StringChartDataModel abar;
    String msg;
   // private DateChartDataModel dateModel;


    @PostConstruct
    public void postContruct() {
    	msg="nothing";
        name = "John";
        model = new NumberChartDataModel(ChartType.line);
        model.put(1, 3);
        model.put(2, 3);
        model.put(3, 4);
        model.put(4, 5);
        
        numberBar = new NumberChartDataModel(ChartType.bar);
        numberBar.put(1, 3);
        numberBar.put(2, 3);
        numberBar.put(3, 4);
        numberBar.put(4, 5);
        
        pie = new StringChartDataModel(ChartType.pie);
        pie.put("A", 4);
        pie.put("B", 5);
        pie.put("C", 6);
        
        abar = new StringChartDataModel(ChartType.bar);
        abar.put("A", 4);
        abar.put("B", 5);
        abar.put("C", 6);
        
        bar = new StringChartDataModel(ChartType.bar);
        bar.put("A", 4);
        bar.put("B", 5);
        bar.put("C", 6);
/*
        dateModel = new DateChartDataModel(ChartType.line);
        dateModel.put(new GregorianCalendar(2013, 4, 1).getTime(), 4);
        dateModel.put(new GregorianCalendar(2013, 4, 2).getTime(), 5);
        dateModel.put(new GregorianCalendar(2013, 4, 3).getTime(), 6);
*/

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
    
    public StringChartDataModel getPie() {
		return pie;
	}

    public StringChartDataModel getBar() {
		return bar;
	}
    public StringChartDataModel getAbar() {
		return abar;
	}
    
    public NumberChartDataModel getNumberBar() {
		return numberBar;
	}
//    public DateChartDataModel getDateModel() {
//        return dateModel;
//    }
    public void handler(PlotClickEvent ev){
        msg="I'm alive";	
    }
    public String getMsg() {
		return msg;
	}
}