import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Vector<Integer> vect = new Vector<Integer>();
        // saisir la taille du vecteur 
         System.out.println("vecteur taille  :");
        Scanner scanner2 = new Scanner(System.in);
        int taille2 = scanner2.nextInt();

       
        System.out.println("Saisisez les valeurs de votre vecteur :");
        for ( int i = 0 ;  i < taille2 ; i++)
        {
            Scanner scanner3 = new Scanner(System.in);
            int elem = scanner3.nextInt();
            vect.add(i,elem);
        }


        Vector<Integer> vect2 = VectorHelper.Inverser(vect);

        for(int i=0; i<vect2.size(); i++){
            System.out.println(vect2.get(i));
        }



        System.out.println("\n");
    }
}
