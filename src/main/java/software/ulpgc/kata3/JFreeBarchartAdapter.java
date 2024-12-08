package software.ulpgc.kata3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class JFreeBarchartAdapter {

    public static JFreeChart adapt(Barchart barchart){
        return ChartFactory.createBarChart(
                barchart.title(),
                barchart.xAxis(),
                barchart.yAxis(),
                datasetOf(barchart)
        );
    }

    private static CategoryDataset datasetOf(Barchart barchart) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String category: barchart.keySet()){
            dataset.addValue(barchart.get(category), "", category);
        }
        return dataset;
    }

}
