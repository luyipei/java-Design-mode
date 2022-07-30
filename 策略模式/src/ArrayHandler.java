public class ArrayHandler {
    private Sort sortObj;
    public void setSort(Sort sortObj){
        this.sortObj=sortObj;
    }
    public int[] sort(int arr[]){
        sortObj.sort(arr);
        return arr;
    }
}
