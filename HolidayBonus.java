/**
 * 
 * @author Darren King
 *
 */
public class HolidayBonus {
	/**
	 * Calculates holiday bonus of each store
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return bonus
	 */
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		double[] bonus = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			for (int k = 0; k < data[i].length; k++) {
				double highest = TwoDimRaggedArrayUtility.getHighestInColumn(data, k);
				double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(data, k);
				if (data[i][k] <= 0) {
					bonus[i] += 0;
				}
				else if(data[i][k] == highest) {
					bonus[i] += high;
				}
				else if(data[i][k] == lowest) {
					bonus[i] += low;
				}
				else {
					bonus[i] += other;
				}
			}
		}
		return bonus;
	}
	/**
	 * Calculates the total of the holiday bonuses of each store
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return total
	 */
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		double total = 0.0;
		double[] array = calculateHolidayBonus(data, high, low, other);
		for (int i = 0; i < data.length; i++) {
			total += array[i];
		}
		return total;
	}
}
