package search_nhi_phan_dung_de_quy;

public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,9,11,13,15,17,19};

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(arr,0,19,17));
    }
}
