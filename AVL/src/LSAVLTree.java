
import java.io.FileNotFoundException;
/** Method class for Load Shedding AVL Tree
 * @author Owen Franke
 * @author owenfranke123@gmail.com
 * @version final
 * @since February
 */
public class LSAVLTree {
	
	/** Print all of the areas in the textfile */
	public void printAllAreas() throws FileNotFoundException {
		AVLTree<LSAVLData> data = new LSAVLData(null,null).getData();
		
		data.inOrder();
		
	}
	/** Prints specified areas */
	public void printAreas(String stage, String day, String startTime) throws FileNotFoundException {
		String key = stage+"_"+day+"_"+startTime;
		LSAVLData target = new LSAVLData(key,null);
		AVLTree<LSAVLData> d = new LSAVLData(null,null).getData();
		
		BinaryTreeNode<LSAVLData> fin = d.find(target);
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

