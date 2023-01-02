public class Main {
    public static void main(String[] args) {

    String[] vect = new String[]{"rosa","bob","Alex"};


    for (int i =0;i<vect.length;i++){
        System.out.println(vect[i]);
    }
        System.out.println("Hello world!");

    //para cada obj da lista realize
    for(String OOB : vect ){
        System.out.println(OOB);
    }


    }
}