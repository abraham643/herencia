package herencia;

import java.util.Scanner;

public class Herencia {
   public static void main(String[] args) {
     Dog[] dogs = insertDog();
        printDogsOnConsole(dogs);
        feed(dogs);
        System.out.println("After eating------------");
        printDogsOnConsole(dogs);
    }

    private static void feed(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            double weightBeforefeeding = dogs[i].getWeight();
            dogs[i].setWeight(weightBeforefeeding + 0.5);
        }
    }

    private static void printDogsOnConsole(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].printToConsole();
        }
    }

    private static Dog2[] insertDog() {
        Scanner teclado=new Scanner(System.in);
        Dog2[] dogs = new Dog2[4];
        String [] names = new String[4];
        String [] colours = new String[4];
        double [] weight = new double[4];
        double [] portion = new double[4];
        for (int i = 0; i < dogs.length; i++) {
          System.out.println("Ingresa el nombre de el perro " + (i+1));
          String nom = teclado.nextLine();
          names[i]=nom;  
        }
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Ingresa el color de el perro " + (i+1));
            String col = teclado.nextLine();
            colours[i]=col; 
        }
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Ingresa el peso de el perro " + (i+1));
            double pes = teclado.nextDouble();
            weight[i]=pes; 
        }
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Ingresa la porcion de el perro " + (i+1));
            double por = teclado.nextDouble();
            portion[i]=por; 
        }
        for (int i = 0; i < dogs.length; i++) {
            Dog2 dog = new Dog2();
            dog.setName(names[i]);
            dog.setColour(colours[i]);
            dog.setWeight(weight[i]);
            dog.setPortion(portion[i]);
            dogs[i] = dog;
        }
        return dogs;
    }
}