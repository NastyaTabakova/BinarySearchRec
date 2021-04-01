import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int arr[]={2,5,7,10,26,40};
        int n = arr.length;
        int elementToSearch = 10;
        int result = bs.binarySearchRec(arr, 0, n-1, elementToSearch);
        if (result==-1){
            logger.debug("Элемент не найден");
        }
        else {
            logger.debug("Индекс искомого элемента = "+result);
        }
    }
}
