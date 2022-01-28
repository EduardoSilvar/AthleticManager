/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;

/**
 *
 * @author eduardo
 */
@ViewScoped
@ManagedBean
public class GraficoLinhas {
    private LineChartModel lineModel1;

    @PostConstruct
    public void init() {
        createLineModels();
    }

    public CartesianChartModel getLineModel1() {
        return lineModel1;
    }

    private void createLineModels() {
        lineModel1 = initLinearModel();
        lineModel1.setSeriesColors("00008b,FF007f");
        lineModel1.setTitle("Comparação do ano anterior com o atual");
        lineModel1.setLegendPosition("s");
        lineModel1.setShowPointLabels(true);
        lineModel1.getAxes().put(AxisType.X, new CategoryAxis("Meses"));
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setLabel("Valor em reais");
        yAxis.setMin(0);
        yAxis.setMax(10000);

    }

    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();

        ChartSeries series1 = new ChartSeries();
        series1.setLabel("Ano Atual");
        series1.set("janeiro", 4200);
        series1.set("fevereiro", 4700);
        series1.set("março", 4400);
        series1.set("abril", 4000);
        series1.set("maio", 4000);
        series1.set("junho", 4000);
        series1.set("julho", 4000);
        series1.set("agosto", 4000);
        series1.set("setembro", 4000);
        series1.set("outubro", 4000);
        series1.set("novembro", 4000);
        series1.set("dezembro", 4000);
        

        ChartSeries series2 = new ChartSeries();
        series2.setLabel("Ano Anterior");
        series2.set("janeiro", 3200);
        series2.set("fevereiro", 3700);
        series2.set("março", 3400);
        series2.set("abril", 3000);
        series2.set("maio", 3000);
        series2.set("junho", 3000);
        series2.set("julho", 3000);
        series2.set("agosto", 3000);
        series2.set("setembro", 3000);
        series2.set("outubro", 3000);
        series2.set("novembro", 3000);
        series2.set("dezembro", 4000);
        model.addSeries(series1);
        model.addSeries(series2);

        return model;
    }
}
