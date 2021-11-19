
import java.util.Scanner;
import java.io.PrintWriter;
/**
 * 
 * @author Darren King
 *
 */
public class TwoDimRaggedArrayUtility {
	/**
	 * Gets the average of all the elements in the array
	 * @param data
	 * @return average
	 */
	public static double getAverage(double[][] data) {
		double total = 0.0;
		int counter = 0;
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				total += data[row][col];
				counter++;
			}
		}
		double average = total / counter;
		return average;
	}
	/**
	 * Gets the total of the elements in a given column
	 * @param data
	 * @param col
	 * @return total
	 */
	public static double getColumnTotal(double[][] data, int col) {
		double total = 0.0;
		for (int row = 0; row < data.length; row++) {
			if (data[row].length > col) {
				total += data[row][col];
			}
		}
		return total;
	}
	/**
	 * Gets the highest element in the array
	 * @param data
	 * @return highest
	 */
	public static double getHighestInArray(double[][] data) {
		double highest = data[0][0];
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (data[row][col] > highest) {
					highest = data[row][col];
				}
			}
		}
		return highest;
	}
	/**
	 * Gets the highest element in a given column
	 * @param data
	 * @param col
	 * @return highest
	 */
	public static double getHighestInColumn(double[][] data, int col) {
		double highest = 0.0;
		for (int row = 0; row < data.length; row++) {
			if(col >= data[row].length) {
				continue;
			}
			else if (data[row][col] > highest) {
				highest = data[row][col];
			}
		}
		return highest;
	}
	/**
	 * Gets the index of the highest element in a given column
	 * @param data
	 * @param col
	 * @return index
	 */
	public static int getHighestInColumnIndex(double[][] data, int col) {
		double highest = 0.0;
		int index = 0;
		for (int row = 0; row < data.length; row++) {
			if(col >= data[row].length) {
				continue;
			}
				else if (data[row][col] > highest) {
				highest = data[row][col];
				index = row;
			}
		}
		return index;
	}
	/**
	 * Gets the highest element in a given row
	 * @param data
	 * @param row
	 * @return highest
	 */
	public static double getHighestInRow(double[][] data, int row) {
		double highest = data[row][0];
		for (int col = 0; col < data[row].length; col++) {
			if (data[row][col] > highest) {
				highest = data[row][col];
			}
		}
		return highest;
	}
	/**
	 * Gets the index of the highest element in a given row
	 * @param data
	 * @param row
	 * @return index
	 */
	public static int getHighestInRowIndex(double[][] data, int row) {
		double highest = data[row][0];
		int index = 0;
		for (int col = 1; col < data[row].length; col++) {
			if (data[row][col] > highest) {
				highest = data[row][col];
				index = col;
			}
		}
		return index;
	}
	/**
	 * Gets the lowest element in the array
	 * @param data
	 * @return lowest
	 */
	public static double getLowestInArray(double[][] data) {
		double lowest = data[0][0];
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (data[row][col] < lowest) {
					lowest = data[row][col];
				}
			}
		}
		return lowest;
	}
	/**
	 * Gets the lowest element in a given column
	 * @param data
	 * @param col
	 * @return lowest
	 */
	public static double getLowestInColumn(double[][] data, int col) {
		double lowest = 999999999;
		for (int row = 0; row < data.length; row++) {
			if (col >= data[row].length) {
				continue;
			}
			else if (data[row][col] < lowest) {
				lowest = data[row][col];
			}
		}
		return lowest;
	}
	/**
	 * Gets the index of the lowest element in a given column
	 * @param data
	 * @param col
	 * @return index
	 */
	public static int getLowestInColumnIndex(double[][] data, int col) {
		double lowest = 999999999;
		int index = 0;
		for (int row = 0; row < data.length; row++) {
			if(col >= data[row].length) {
				continue;
			}
			else if (data[row][col] < lowest) {
				lowest = data[row][col];
				index = row;
			}
		}
		return index;
	}
	/**
	 * Gets the lowest element in a given row
	 * @param data
	 * @param row
	 * @return lowest
	 */
	public static double getLowestInRow(double[][] data, int row) {
		double lowest = data[row][0];
		for (int col = 1; col < data[row].length; col++) {
			if (data[row][col] < lowest) {
				lowest = data[row][col];
			}
		}
		return lowest;
	}
	/**
	 * Gets the index of the lowest element in a given row
	 * @param data
	 * @param row
	 * @return index
	 */
	public static int getLowestInRowIndex(double[][] data, int row) {
		double lowest = data[row][0];
		int index = 0;
		for (int col = 1; col < data[row].length; col++) {
			if (data[row][col] < lowest) {
				lowest = data[row][col];
				index = row;
			}
		}
		return index;
	}
	/**
	 * Gets the total of a given row
	 * @param data
	 * @param row
	 * @return total
	 */
	public static double getRowTotal(double[][] data, int row) {
		double total = 0.0;
		for (int col = 0; col < data[row].length; col++) {
			total += data[row][col];
		}
		return total;
	}
	/**
	 * Gets the total of the array
	 * @param data
	 * @return total
	 */
	public static double getTotal(double[][] data) {
		double total = 0.0;
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				total += data[row][col];
			}
		}
		return total;
	}
	/**
	 * Reads from a file and returns ragged array
	 * @param file
	 * @return data
	 * @throws java.io.FileNotFoundException
	 */
	public static double[][] readFile(java.io.File file) throws java.io.FileNotFoundException{
		Scanner keyboard = new Scanner(file);
		int row = 0;
		String [][] temp = new String[10][];
		String [] array;
		double[][] data;
		while(keyboard.hasNextLine()) {
			array = keyboard.nextLine().split(" ");
			temp[row] = new String[array.length];
			for (int col = 0; col < array.length; col++) {
				temp[row][col] = array[col];
			}
			row++;
		}
		data = new double[row][];
		for (int i = 0; i < row; i++) {
			data[i] = new double[temp[i].length];
			for (int k = 0; k < temp[i].length; k++) {
				System.out.println(temp[i][k] + " ");
				data[i][k] = Double.parseDouble(temp[i][k]);
			}
			System.out.println();
		}
		keyboard.close();
		return data;
	}
	/**
	 * Writes ragged array to a file
	 * @param data
	 * @param outputFile
	 * @throws java.io.FileNotFoundException
	 */
	public static void writeToFile(double[][] data, java.io.File outputFile) throws java.io.FileNotFoundException{
		PrintWriter output = new PrintWriter(outputFile);
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				output.print(data[row][col] + " ");
			}
			output.println();
		}
		output.close();
	}
}
