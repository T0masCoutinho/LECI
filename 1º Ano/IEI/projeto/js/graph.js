function draw() {
    
    $("#myGraph").highcharts({
    chart: { type: "line" },
    title: { text: "Tamanhos de Transistors em Nm" },
    xAxis: { categories: ["2000", "2002", "2004", "2006", "2008", "2010","2012", "2014", "2016", "2018", "2020"]},
    yAxis:{
        title: {
            text: "Tamanho em Nm"
        }
    },
    
    series:[
        { name: "Ano",
        data: [130, 90, 75, 45, 32, 22, 15, 10, 8, 6]
        },
        ]
    });
}
    


