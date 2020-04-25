
import java.io.FileNotFoundException;

/** Main class for Load Shedding AVL Tree
 * @author Owen Franke
 * @author owenfranke123@gmail.com
 * @version final
 * @since February
 */
public class LSAVLApp {

	/** Main method to determine if there are arguments or not */

	public static void main(String[] args) throws FileNotFoundException {
		if (args.length == 3)
			(new LSAVLTree()).printAreas(args[0], args[1], args[2]);
		else
			(new LSAVLTree()).printAllAreas();

	}

}
