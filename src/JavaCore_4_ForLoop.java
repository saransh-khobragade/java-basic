public class JavaCore_4_ForLoop {
    public static void main(String[] args) {

        String[] abc = {"a","b","c"};

        //index
        for(int i=0;i<abc.length;i++){
            // System.out.println(i);
            System.out.println(abc[i]);
        }

        //element
        for(String i:abc){
            System.out.println(i);
        }


    }
}
