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
@ManagedBean
@ViewScoped
public class GraficoBean {
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
        lineModel1.setTitle("Ganho com o ultimo evento");
        lineModel1.setLegendPosition("e");
        lineModel1.setShowPointLabels(true);
        lineModel1.getAxes().put(AxisType.X, new CategoryAxis("EVENTOS"));
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setLabel("VALOR EM $");
        yAxis.setMin(0);
        yAxis.setMax(10000);

    }

    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();

        ChartSeries series1 = new ChartSeries();
        series1.setLabel("2021");

        series1.set("Natal", 4000);//fazer com o banco de dados
        series1.set("reveillon", 4200);// fazer com o banco de dados
        series1.set("Baile da Mercenaria", 7000);// fazer com o banco de dados
        series1.set("Carnaval", 4400);// fazer com o banco de dados
        series1.set("Baile de Ferias", 4000);// fazer com o banco de dados
     

        model.addSeries(series1);

        return model;
    }
}
