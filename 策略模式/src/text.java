public class text {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,6,5};
        Sort obj1,obj2,obj3;
        obj1=new BubbleSort();
        obj2=new SelectionSort();
        obj3=new InsertionSort();
        ArrayHandler arrayHandler=new ArrayHandler();
        arrayHandler.setSort(obj1);
        arrayHandler.sort(arr);
        arrayHandler.setSort(obj2);
        arrayHandler.sort(arr);
        arrayHandler.setSort(obj3);
        arrayHandler.sort(arr);

    }
}
