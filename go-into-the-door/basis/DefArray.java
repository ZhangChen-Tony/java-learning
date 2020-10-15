public class DefArray {
    public static void main(String[] args){
        // score of five students
        int[] ns = new int[5];
        ns[0] = 60;
        ns[1] = 80;
        ns[2] = 90;
        ns[3] = 70;
        ns[4] = 100;
        System.out.println(ns.length); //5
        System.out.println(ns[2]);//90

        /*another way to set the element*/
        int[] ns2 = new int[] {60,80,90,100,70};
        System.out.println(ns2[1]);//80

        //or you can make it short
        int[] ns3 = {2,3,4,5,6};
        System.out.println(ns3[2]);//4

        //you can also create a string array
        String[] name = {"xyz","abc","def"};
        System.out.println(name[2]);//def

        /**the size of an array cannot be changed once it is created
         * it can be quoted, but it will alert when the quotation number is out of range
         * its elements can be int or string, but the array itself is in the type string
         */
    }
}