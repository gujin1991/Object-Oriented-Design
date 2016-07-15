package LakeExploring;
import java.io.*;
import java.net.*;
import java.util.*;

public class LakeExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year(2006 - 2016)");
		String year = input.nextLine();
		System.out.println("Enter a month(01 - 12)");
		String month = input.nextLine();
		System.out.println("Enter a day(01 - 31)");
		String day = input.nextLine();
		
		input.close();
		
		ArrayList<Double> windData = readData("Wind_Gust", year, month, day);
		ArrayList<Double> airData = readData("Air_Temp", year, month, day);
		ArrayList<Double> pressureData = readData("Barometric_Press", year, month, day);
		
		print("Wind Gust", windData);
		print("Air Temp", windData);
		print("Pressure", windData);
	
	}

	
	private static void print(String type, ArrayList<Double> windData) {
		// TODO Auto-generated method stub
		System.out.print(type + ":  mean " + getMean(windData));
		System.out.print(",  median " + getMedian(windData));

	}


	private static ArrayList<Double> readData(String type, String year, String month, String day) {
		// TODO Auto-generated method stub
		ArrayList<Double> val = new ArrayList<>();
		BufferedReader data = null;
		try {
			//System.out.println("http://lpo.dt.navy.mil/data/DM/" + year + "/"
			//		+ year + "_" + month + "_" + day + "/" + type);
			URL dataSource = new URL("https://lpo.dt.navy.mil/data/DM/" + year + "/"
					+ year + "_" + month + "_" + day + "/" + type);
			
			data = new BufferedReader(new InputStreamReader(dataSource.openStream()));
			String line;
			//System.out.println("good");
			while((line = data.readLine()) != null) {
				System.out.println(line);

				val.add(Double.parseDouble(line.substring(20)));
			}
			
			data.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return val;
	}



	private static double getMedian(ArrayList<Double> Data) {
		// TODO Auto-generated method stub
		double mean = 0;
		for(double val : Data) {
			mean += val;
		}
		
		return mean / Data.size();
	}

	private static double getMean(ArrayList<Double> Data) {
		// TODO Auto-generated method stub
		int size = Data.size();
		if(size % 2 == 0) {
			return (Data.get(size / 2) + Data.get(size / 2 - 1)) / 2;
		} else {
			return Data.get(size / 2);
		}
		
		
	}
	
	
	
	

}
