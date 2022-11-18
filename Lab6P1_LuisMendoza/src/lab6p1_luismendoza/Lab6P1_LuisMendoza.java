/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_luismendoza;
import java.util.Random;
import java.util.Scanner;

public class Lab6P1_LuisMendoza {
        
        public static void Menu(){
            Scanner entrada = new Scanner(System.in);
            int v = 0;

            do {
                System.out.println("Bienvenido al Laboratorio #6 ");
                System.out.println("Ingrese una de las siguientes opciones: ");
                System.out.println("1. Ejercicio #1 , 2. Ejercicio #2, 3. Ejercicio #3, 4. Salir");
                int opcionUsuario = entrada.nextInt();

                switch (opcionUsuario) {

                    case 1:

                        Ejercicio1();

                        break;

                    case 2:
                        
                        Ejercicio2();
                        
                        break;

                    case 3:
                        
                        Ejercicio3();
                        
                        break;
                        
                    case 4:
                        System.out.println("Bye Bye!");
                        v = 1;
                        break;

                    default:
                        System.out.println("Opción no valida");
                        break;
                }

            } while (v != 1);
       
       
    }
        
        public static void Ejercicio1(){
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Bienvenido al Juego de los Dados!");
            
            char[][] matrix = DLifeMatrix();
            int[][] matrixTablero = LifeMatrix();

            int n = 0;
            int option = 0;

            int acuDinero = 0;
            int acuEdad = 0;

            int x = 0;
            int y = 0;

            Imprimir2(matrix);

            System.out.println("****************************");
            do {
                System.out.println("Elija una de las siguientes opciones: ");
                System.out.println("1. Dice, 2. Ver tablero, 3. salir");
                option = entrada.nextInt();

                if (option == 1) {
                    int random = new Random().nextInt(6 - 1);
                    int dice = random;

                    x = x + dice;

                    if (x > 7) {
                        if (y == 7) {
                            y = 7;
                            x = 7;
                        } else {
                            y++;
                            x = 0;
                        }
                    }

                    matrix[y][x] = 'P';
                    Imprimir2(matrix);

                    int value = matrixTablero[y][x];

                    if (value == 1) {
                        System.out.println("+ 125,000 Lempiras");
                        acuDinero += 125000;
                    } else if (value == -1) {
                        System.out.println("+ 5 AÑOS");
                        acuEdad += 5;
                    } else if (value == 0) {
                        System.out.println("Todo Chill");
                    } else {
                        Imprimir2(matrix);
                        System.out.println("Dinero total: " + acuDinero);
                        System.out.println("Edad Final: " + acuEdad);

                        n = 1;
                    }

                } else if (option == 2) {
                    Imprimir2(matrix);
                    System.out.println("Dinero actual: " + acuDinero);
                    System.out.println("Edad actual: " + acuEdad);

                } else if (option == 3) {

                    Imprimir2(matrix);
                    System.out.println("Dinero total: " + acuDinero);
                    System.out.println("Edad Final: " + acuEdad);

                    n = 1;
                } else{
                    System.out.println("Opción no valida!");
                }

            } while (n != 1);
    
        }
            
        public static void Ejercicio2(){
            Scanner entrada = new Scanner(System.in);
            
            int m = 0;
            int jugador;
            
            System.out.println("Welcome to Rock, Paper, Scissors the Sheldon Edition!");
            int[][] matrix = rockPaperMatrix();

            do{
            System.out.println("Select one of the following options / use an interger!: ");
            System.out.println("1. Scissors, 2. Paper, 3. Rock, 4. Lizard, 5. Spock");
            jugador = entrada.nextInt();
            if(jugador > 5){
                System.out.println("Opción no valida");
            } else{
                m++;
            }
            }while(m != 1);
            
            jugador = jugador - 1;
            
            

            int random = new Random().nextInt(4 - 0);
            int option = random;

            if (option == 0) {
                System.out.println("The machine chose Scissors!");
            } else if (option == 1) {
                System.out.println("The machine chose Paper!");
            } else if (option == 2) {
                System.out.println("The machine chose Rock!");
            } else if (option == 3) {
                System.out.println("The machine chose Lizard!");
            } else {
                System.out.println("The machine chose Spock!");
            }

            if (matrix[jugador][option] == 0) {
                System.out.println("It's a Draw! Same Choice!");
            } else if (matrix[jugador][option] == 1) {
                System.out.println("YOU WIN!");
            } else if (matrix[jugador][option] == -1) {
                System.out.println("YOU LOSER!");
            } else {
                System.out.println("......");
            }
            
            
        }
        
        public static void Ejercicio3(){
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Bienvenido a Blink-182");
            
            System.out.println("Ingrese el numero de filas");
            int filas = entrada.nextInt();
            
            System.out.println("Ingrese el numero de columnas");
            int columnas = entrada.nextInt();
            
            char [][] matrix = DMatrix(filas,columnas);
            
            System.out.println("-----------------------------");
            
            
            Imprimir2(matrix);
        }
        
        public static int [][] rockPaperMatrix(){
        Scanner entrada = new Scanner(System.in);
        
        
        int [][] matrix = new int [5][5];
        
        matrix [0][0]= 0;
        matrix [0][1]= 1;
        matrix [0][2]= -1;
        matrix [0][3]= 1;
        matrix [0][4]= -1;
        
        matrix [1][0]= -1;
        matrix [1][1]= 0;
        matrix [1][2]= 1;
        matrix [1][3]= -1;
        matrix [1][4]= 1;
        
        matrix [2][0]= 1;
        matrix [2][1]= -1;
        matrix [2][2]= 0;
        matrix [2][3]= 1;
        matrix [2][4]= -1;
        
        matrix [3][0]= -1;
        matrix [3][1]= 1;
        matrix [3][2]= -1;
        matrix [3][3]= 0;
        matrix [3][4]= 1;
        
        matrix [4][0]= 1;
        matrix [4][1]= -1;
        matrix [4][2]= 1;
        matrix [4][3]= -1;
        matrix [4][4]= 0;
        
        
        return matrix;
    }
        
        public static char [][] DMatrix(int fila,int columna){
            
            Scanner entrada = new Scanner(System.in);
        
            int n = 0;
            
            int [][] matrixD = new int [fila] [columna];
            char [][] matrix = new char [fila][columna];
                for(int i = 0; i < matrix.length;i++){
                    for(int j = 0; j < matrix[i].length;j++){
                        
                        int random = new Random().nextInt(25 - 0);
                        int option = random;
                        
                        int a = 97 + option;
                        
                        char x = (char)a;
                        
                        matrixD [i][j]= a;
                        matrix [i][j] = x;
            }
        }
                Imprimir1(matrixD);
        
        return matrix;
    }
        
        public static int [][] LifeMatrix(){
            
            int [][] matrix = new int [8][8];
            
            matrix[0][0] = 0;
            matrix[0][1] = 0;
            matrix[0][2] = -1;
            matrix[0][3] = 1;
            matrix[0][4] = -1;
            matrix[0][5] = 0;
            matrix[0][6] = -1;
            matrix[0][7] = 0;
            
            matrix[1][0] = 0;
            matrix[1][1] = 1;
            matrix[1][2] = 0;
            matrix[1][3] = 0;
            matrix[1][4] = 1;
            matrix[1][5] = 0;
            matrix[1][6] = 0;
            matrix[1][7] = 0;
            
            matrix[2][0] = -1;
            matrix[2][1] = 0;
            matrix[2][2] = 1;
            matrix[2][3] = 0;
            matrix[2][4] = -1;
            matrix[2][5] = 1;
            matrix[2][6] = -1;
            matrix[2][7] = 0;
            
            matrix[3][0] = 1;
            matrix[3][1] = 0;
            matrix[3][2] = 0;
            matrix[3][3] = 1;
            matrix[3][4] = 0;
            matrix[3][5] = 0;
            matrix[3][6] = 1;
            matrix[3][7] = 0;
            
            matrix[4][0] = -1;
            matrix[4][1] = 1;
            matrix[4][2] = -1;
            matrix[4][3] = 0;
            matrix[4][4] = 1;
            matrix[4][5] = 0;
            matrix[4][6] = -1;
            matrix[4][7] = 1;
            
            matrix[5][0] = 0;
            matrix[5][1] = 0;
            matrix[5][2] = 1;
            matrix[5][3] = 0;
            matrix[5][4] = 0;
            matrix[5][5] = 1;
            matrix[5][6] = 0;
            matrix[5][7] = 0;
            
            matrix[6][0] = -1;
            matrix[6][1] = 0;
            matrix[6][2] = -1;
            matrix[6][3] = 1;
            matrix[6][4] = -1;
            matrix[6][5] = 0;
            matrix[6][6] = 1;
            matrix[6][7] = 0;
            
            matrix[7][0] = 0;
            matrix[7][1] = 0;
            matrix[7][2] = 0;
            matrix[7][3] = 0;
            matrix[7][4] = 1;
            matrix[7][5] = 0;
            matrix[7][6] = 0;
            matrix[7][7] = 2;
             
            return matrix;
            
        }
        
        public static char [][] DLifeMatrix(){
            
            char [][] matrix = new char [8][8];
            
            matrix[0][0]='P';
            matrix[0][1]='-';
            matrix[0][2]='-';
            matrix[0][3]='-';
            matrix[0][4]='-';
            matrix[0][5]='-';
            matrix[0][6]='-';
            matrix[0][7]='-';
            
            
            int random = new Random().nextInt(6 - 1);
            int dice = random;
            
            for(int i = 1; i < matrix.length;i++){
                for(int j = 0; j < matrix[i].length;j++){
                
                matrix[i][j] = '-';
                
                  
            }
        }
                    
            return matrix;
        }
      
        public static void Imprimir1(int [][] matrix){
            
            for (int i = 0; i < matrix.length;i++){ //Fila
                for (int j = 0; j < matrix[i].length; j++ ){ //Columna
                System.out.print("[" + matrix[i][j] + "]");
                }
                System.out.println("");
            }
        
        
    }
        
        public static void Imprimir2(char [][] matrix){
            
            for (int i = 0; i < matrix.length;i++){ //Fila
                for (int j = 0; j < matrix[i].length; j++ ){ //Columna
                System.out.print("[" + matrix[i][j] + "]");
                }
                System.out.println("");
            }
        
        
    }
    

    public static void main(String[] args) {
       
     Menu();
   
    }
}
