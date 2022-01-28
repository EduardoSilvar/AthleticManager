/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author eduardo
 */
@ManagedBean
@ViewScoped
public class GraficoPie {
    private PieChartModel pieModel1;

    @PostConstruct
    public void init() {
        createPieModels();
    }

    public PieChartModel getPieModel1() {
        return pieModel1;
    }

    private void createPieModels() {
        createPieModel1();
    }

    private void createPieModel1() {
        pieModel1 = new PieChartModel();

        
        pieModel1.set("Membros que pagaram", 80); //fazer com o banco 
        pieModel1.set("Membros que não pagaram", 100); //fazer com o banco de dados 
        pieModel1.setTitle("Pagamento do mês");
        pieModel1.setLegendPosition("w");
        pieModel1.setSeriesColors("007fff,FF007f");
        
    }
}
