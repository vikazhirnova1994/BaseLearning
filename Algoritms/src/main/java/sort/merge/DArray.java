package sort.merge;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class DArray {
    private long[] theArr;
    private int numberOfElem;

    public DArray(int maxSize) {
        theArr = new long[maxSize];
        numberOfElem=0;
    }

    public void insert(long value){
        theArr[numberOfElem] = value;
        numberOfElem++;
    }

    public void display(){
        for (int i = 0; i <numberOfElem ; i++) {
            System.out.print(theArr[i] + " ");
        }
        System.out.println();
    }

    public void mergeSort(){
        long[] workSpace = new long[numberOfElem];
        recMergeSort(workSpace, 0, numberOfElem-1);
    }

    public void recMergeSort(long[] workSpace, int lowerBound, int upperBound){
        if (lowerBound == upperBound) return;
        else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid+1, upperBound);
            merge(workSpace, lowerBound, mid+1, upperBound);
        }
    }

    private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {
        int j =0; // Индекс в рабочей области
        int lowerBound = lowPtr;
        int mid = highPtr-1;
        int n = upperBound-lowerBound+1; // Количество элементов
        while (lowPtr<=mid && highPtr <= upperBound)
            if (theArr[lowPtr]<theArr[highPtr])
                workSpace[j++] = theArr[lowPtr++];
            else
                workSpace[j++] = theArr[highPtr++];
        while (lowPtr <=mid)
            workSpace[j++] = theArr[lowPtr++];
        while (highPtr <=upperBound)
            workSpace[j++] = theArr[highPtr++];
        for (j = 0; j < n; j++) {
            theArr[lowerBound+j] = workSpace[j];
        }
    }
}
