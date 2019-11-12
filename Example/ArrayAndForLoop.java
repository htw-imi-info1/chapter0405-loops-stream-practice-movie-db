
public class ArrayAndForLoop
{

    public void printAllNumbersInArray()

    {
        int[] numbers = { 4, 1, 22, 9, 14, 3, 9};
        for(int i=0; i < numbers.length; i++){
            System.out.println("numbers["+i+ "] : "+ numbers[i]);
        }
    }

    // Ex 8) in ArrayAndForLoop, add a method int min(int[] a) that returns the index of the largest element.
    public int min(int[] a){
        int minIndex = -1; 
        int minimumSoFar = Integer.MAX_VALUE;
        for(int i=0;i<a.length; i++){
            if (a[i] < minimumSoFar){
                minimumSoFar = a [i];
                minIndex = i;
            }
        }
        return minIndex;   
    }

    public void demoMin(){
        int[] numbers = { 4, 3, 22, 9, 14, 1, 9};
        System.out.println("the index should be 5 and is:"+min(numbers));
    }
    //Ex 9) in ArrayAndForLoop, add a method int sum(int[] a) that returns the sum of all elements in the array.
    public int sum(int[] a){
        int sum = 0;
        for(int i=0;i<a.length; i++){
            sum += a[i];
        }
        return sum;   
    }

    public void demoSum(){
        int[] numbers = { 4, 3, 22, 9, 14, 1, 9};
        System.out.println("the sum should be 62 and is:"+sum(numbers));
    }
}
