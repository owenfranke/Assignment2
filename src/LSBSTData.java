import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/** Data class for Load Shedding Binary Search Tree
* @author Owen Franke
* @author owenfranke123@gmail.com
* @version final
* @since February
*/

public class LSBSTData implements Comparable<LSBSTData>{
	private Integer opCount = 0;
	private Integer opCountInsert =0;
	/** @param key Used to store the stage, date and time */
	private String key;
	/** @param area Used to store the areas */
	private String area;

	public LSBSTData(String key, String area) {
		this.key = key;
		this.area = area;
	}
	/** Gets the data from the textfile 
	 * @ return A LSData array object storing data*/
	public BinarySearchTree<LSBSTData> getData() throws FileNotFoundException {

		BinarySearchTree<LSBSTData> data = new BinarySearchTree<LSBSTData>();
		File f = new File(
				"/home/owen/eclipse-workspace/Assignment1/src/Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
		Scanner file = new Scanner(f);

		int i = 0;

		while (file.hasNextLine()) {
			String line = file.nextLine();

			int p = line.indexOf(" ");
			String area = line.substring(p);
			String key = line.substring(0, p);
			data.insert(new LSBSTData(key, area));
			IncreaseCountInsert();
			i++;
		}
	
		file.close();

		return data;

	}

	/** Overides compareTo
	 * @return value of 0/-1/1 */
	public int compareTo(LSBSTData obj) {
		if (obj.getKey().equals(this.getKey()))	{
			return 0;
		} else if (obj.getKey().compareTo(this.getKey())>0) {
			return 1;
		} else {
		return -1;
		}
	}
	/** ToString method 
	 * @ return String containing stage, day, time and area*/
	public String toString() {
		Scanner l = new Scanner(this.getKey()).useDelimiter("_");

		String stage = l.next();
		String day = l.next();
		String time = l.next();
		
		
		
		return ("Stage " + stage + ", " + day + "th day," + time
				+ "h00 start time - has areas " + this.getArea());
		
	
	}
	public void writeOperations() throws FileNotFoundException{
		PrintWriter write = new PrintWriter("Binary Operation Count.txt");
		Integer total = opCount+opCountInsert;
				write.println("Find Operations: "+opCount);			//Uncomment
				write.println("Insert Operations: "+opCountInsert);
				write.println("Total Operation Count: "+total);
				//write.println(total);
				write.close();
	}
	/** Increase operation counter 1 */
	public void IncreaseCount() {
		opCount++;
	}
	/** Increase operation counter 2 */
	public void IncreaseCountInsert() {
		opCountInsert++;
	}
	/** Gets the key
	 * @ return String containing the key value*/
	public String getKey() {
		return key;
	}
	/** Gets the area 
	 * @ return String containing the areas*/
	public String getArea() {
		return area;
	}

}