/**
 * 
 * @author Elysha Mustapha
 *
 */
public class DataSetGen <T extends Measurable> {
	private double total;
	private T max;
	private int count;
	
	/**
	 * Construct an empty data set
	 */
	public DataSetGen() {
		total = 0;
		count = 0;
		max = null;
	}
	
	/**
	 * add a data value to the data set
	 * @param x is a data value
	 */
	public void add(T x) {
		total = total + x.getMeasure();
		if(count == 0 || max.getMeasure() < x.getMeasure())
			max = x;
		count++;
	}
	
	/**
	 * get the average of the added data
	 * @return the average or 0 if no data has been added
	 */
	public double getAverage() {
		if(count == 0) {
			return 0;
		}
		else {
			return total/count;
		}
	}
	
	/**
	 * get the largest of the added data
	 * @return the maximum or 0 if no data has been added
	 */
	public T getMaximum() {
		return max;
	}

}
