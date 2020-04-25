
import java.io.FileNotFoundException;
/** Method class for Load Shedding Binary Search Tree
 * @author Owen Franke
 * @author owenfranke123@gmail.com
 * @version final
 * @since February
 */
public class LSBSTTree {
	
	/** Print all of the areas in the textfile */
	public void printAllAreas() throws FileNotFoundException {
		BinarySearchTree<LSBSTData> data = new LSBSTData(null,null).getData();
		
		data.inOrder();
		
	}
	/** Prints specified areas */
	public void printAreas(String stage, String day, String startTime) throws FileNotFoundException {
		String key = stage+"_"+day+"_"+startTime;
		LSBSTData target = new LSBSTData(key,null);
		BinarySearchTree<LSBSTData> d = new LSBSTData(null,null).getData();
		
		BinaryTreeNode<LSBSTData> fin = d.find(target);
		target.getData();
		target.getFindCount(d.getCount());

		try {
			System.out.println(fin.data.toString());
			System.out.println(d.getCount());
			target.writeOperations();
			
		} catch(NullPointerException e) {
			System.out.println("Data not found");
			
		}
		
	}
		
	}

