import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearch {
    private static final Logger logger = LoggerFactory.getLogger(BinarySearch.class);

    int binarySearchRec(int arr[], int firstElement, int lastElement, int elementToSearch){
        if(lastElement>=firstElement && firstElement<arr.length-1){
            int mid = firstElement + (lastElement-firstElement)/2;

            if (arr[mid]== elementToSearch) {
                logger.debug("Элемент с индексом "+mid+" = искомому элементу "+elementToSearch);
                return mid;
            }
            if (arr[mid]>elementToSearch){
                logger.debug("Элемент с инденксом "+mid+" > "+" искомого элемента "+elementToSearch);
                return binarySearchRec(arr, firstElement, mid-1,elementToSearch);
            }
            return binarySearchRec(arr, mid+1, lastElement,elementToSearch);
        }
        return -1;
    }
}
