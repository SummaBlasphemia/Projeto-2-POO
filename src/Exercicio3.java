package aulas;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio3 {
	public static void main(String[] args) {
	int numeroMinimo, numeroMaximo, quantidadeDeNumeros, numerosAleatorios;
	String caminho = "C:/POO.html";
	String intString;
	
	Random geradorAleatorio = new Random();
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Digite o total de numeros que ser� gerado: ");
	//quantidadeDeNumeros = leitor.nextInt();
	quantidadeDeNumeros = 50;
	
	System.out.println("Digite o numero minimo: ");
	//numeroMinimo = leitor.nextInt(); 
	numeroMinimo = 0;
	
	System.out.println("Digite o numero maximo: ");
	//numeroMaximo = leitor.nextInt();
	numeroMaximo = 100;
	
	try {
		
		FileWriter escritor = new FileWriter(caminho);
		
		escritor.write("""
				<!DOCTYPE html>
				<html>
				  <head>
				    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
				    <script type="text/javascript">
				      google.charts.load('current', {'packages':['corechart']});
				      google.charts.setOnLoadCallback(drawChart);

				      function drawChart() {
				        var data = google.visualization.arrayToDataTable([
				        ['X', 'Valor'],
				        """
				        );
				        for(int i = 0; i < quantidadeDeNumeros; i++) {
				        numerosAleatorios = geradorAleatorio.nextInt(numeroMaximo - numeroMinimo + 1) + numeroMinimo;
				        intString = Integer.toString(numerosAleatorios);
				        escritor.write("[" + i + ", " + numerosAleatorios + "]");
		                if (i < quantidadeDeNumeros - 1) {
		                    escritor.write(",\n");
		                }
				        }
				        escritor.write(
				        """
				        ]);

				        var options = {
				          title: 'Company Performance',
				          curveType: 'function',
				          legend: { position: 'bottom' }
				        };

				        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

				        chart.draw(data, options);
				      }
				    </script>
				  </head>
				  <body>
				    <div id="curve_chart" style="width: 900px; height: 500px"></div>
				  </body>
				</html>
				"""
				);	
		
		
		escritor.close();
	} catch(IOException e) {
		System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
	}
	leitor.close();
  }
}
