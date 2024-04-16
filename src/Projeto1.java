

import java.util.Scanner;

public class Projeto1 {
    public static void main (String[] args ){

        Scanner escl = new Scanner(System.in);
        System.out.println("\033[0m Você é uma bruxa em treinamento, um aventureiro pediu uma poção para até o fim do dia, mas você está sem ingredientes!  \n Você decide olhar na foresta por ingredientes");
        int items = 0;
 
            //item 1  
            System.out.println("Você encontra um misterioso circulo de pedras no chão! \n [1]Investigar [2]Seguir em frente");
            int ft = escl.nextInt();

            if (ft == 1) {
                System.out.println("\033[0;32m você decide investigar, uma fada amigavél te entrega uma pena brilhante, você a agradece e segue em frente com a pena em sua mochila \033[0m");
                items += 1;

            }else {
                System.out.println("você segue em frente");
            }

      //item 2

            System.out.println("Você vê uma arvore estranha \n [1]Investigar [2]Seguir em frente");
            int l = escl.nextInt();
            if (l == 1){
                System.out.println("\033[0;32m Você olha mais perto e encontra um cogumelo vermelho, você o guarda em sua mochila e segue em frente \033[0m");
                items += 1;
               }else {
                System.out.println("você segue em frente");
            }

     //item 3
            System.out.println("É o fim do dia, você vê um campo de flores \n [1]Olhar mais perto [2]Voltar pra casa");
            int flor = escl.nextInt();

            if (flor == 1){
                System.out.println("\033[0;32m Você para para cheirar as flores, e encontra uma particularmente agradavél, colocando ela em sua mochila antes de ir para casa \033[0m");
                items += 1;
            }else {
                System.out.println("Você foi pra casa");
            }

    //final foresta 
            System.out.println("Você chegou em casa ao por do sol, hora de fazer a poção!");
            if (items == 3){
                System.out.println("\033[0;32m Com todos os items que você conseguiu a poção ficou perfeita! seu cliente até deixou uma gorjeta \n [FINAL BOM]");
            } else if (items == 0) {
                System.out.println("\033[0;31m Você não conseguiu nada para sua poção...seu cliente ficou desapontado e foi embora \n [FINAL RUIM]");
            }else {
                System.out.println("\033[0;33m Você conseguiu fazer a poção, mas algo está faltando...seu cliente não ficou impressionado \n [FINAL NEUTRO]");
            }


        }



    }
    
        
   

    
    

    