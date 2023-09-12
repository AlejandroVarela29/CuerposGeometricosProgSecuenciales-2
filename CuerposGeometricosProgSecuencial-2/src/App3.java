import java.util.Scanner;
public class App3{

    public static void main(String args[]){

        byte elegir, intentoMaximo = 3, intentos = 0, nLados;
        double  altura = 0,  radio = 0, areaLateral = 0, area=0, areaHusoEsferico=0, volumenCasqueteEsferico=0, diagonal = 0,volumenCunaEsferica=0, volumenZonaEsferica=0, volumen=0, areaTotal=0, areaZonaEsferica=0;
        double generatriz,  aristas, numeroDeGrados,  apotemaBaseb, aBaseMayor,aBaseMenor,apotemaBaseMenor,radioMayor, radioMenor,bBaseMayor,bBaseMenor,pBaseMayor,pBaseMenor,apotemaTroncoPiramide, pBase, aBase , base, cara, apotema, apotemaPiramide, perimetro,alfa,largo, apotemaBaseMayor;
    
        Scanner menu = new Scanner(System.in);

        System.out.println("Se realizar un menu donde se pueda escoger las");
        System.out.println("Las siguientes figuras gemoetricas y que operaciones desea realizar con ella");
        System.out.println("1)Cilindro");
        System.out.println("2)Cono");
        System.out.println("3)Dodecaedro");
        System.out.println("4)Esfera");
        System.out.println("5)Zona Esferica");
        System.out.println("6)Huso Esferico");
        System.out.println("7)Hexaedro");
        System.out.println("8)Icosaedro");
        System.out.println("9)Octoaedro");
        System.out.println("10)Ortoaedro");
        System.out.println("11)Piramide");
        System.out.println("12)Prismas");
        System.out.println("13)Tetaedro");
        System.out.println("14)Tronco Cono");
        System.out.println("15)Tronco Piramide");
        System.out.println("16)Salir del programa");

        elegir=menu.nextByte();

            switch (elegir) {
                case 1:
                    
              System.out.println("Se realizaran los calculos de un cilindro");
              System.out.println("");
              
              System.out.println("No se puede ingresar valores negativos");                      
              while(intentos<intentoMaximo){

              System.out.println("");
                      
              System.out.println("para sacar el area latearal de un cilindro");
              System.out.println("Se necesita lo siguiente altura y radio");

              System.out.println("");
              
              System.out.println("Cual es la altura del cilindro ");
              
              altura=menu.nextDouble();

              System.out.println("");
              
              System.out.println("Cual es el radio del cilindro");
              radio=menu.nextDouble();
              

              pBase = (2 * Math.PI) * radio;

              areaLateral = pBase * altura;
                      
              System.out.println("");

                
              System.out.println("Para sacar el area total de un cilindro");
              System.out.println("Se necesita lo siguiente el area lateral, pi, radio cuadrado y a base");

              System.out.println("");
              
              System.out.println("Cual es el radio");
              radio=menu.nextDouble();
              

              aBase = Math.PI * Math.pow(radio, 2);
              areaTotal = areaLateral + 2*aBase; 

              System.out.println("");

              System.out.println("Para sacar el volumen de un cilindro se le pedira que ingrese los siguientes datos ");

              System.out.println("");
              
              System.out.println("Cual es la altura del cilindro");
              altura=menu.nextDouble();
              
              System.out.println("");
              
              System.out.println("Cual es el radio");
              radio=menu.nextDouble();
              

              aBase = Math.PI * Math.pow(radio, 2);
              
              volumen = aBase * altura;

              if(radio>0 && altura>0){
                break;
              }else{
                System.out.println("No se puede ingresar valores negativos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
              intentos++;
            } 
              
              if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
              }else{

              System.out.println("El area lateral del cilindro es "+areaLateral);  
              System.out.println("");
              System.out.println("El area total del cilindro es "+areaTotal);
              System.out.println("");
              System.out.println("El volumen del cilindro es "+volumen);
            }
              break;

              case 2: 

              System.out.println("Se Realizaran los calculos de un cono");
              System.out.println("");

               while(intentos<intentoMaximo){
              System.out.println("Se calculara el area lateral de un cono");
              System.out.println("para ello se necesita la base de p ");
              System.out.println("tambien se necesitan datos adicionales comno lo son el radio y la altura");

              System.out.println("");
              System.out.println("cual es el radio");
              radio=menu.nextDouble();

              System.out.println("");
              System.out.println("cual es la altura");
              altura=menu.nextDouble();

              System.out.println("");
              System.out.println("cual es la base de p");
              pBase=menu.nextDouble();

              generatriz = altura * radio;
              areaLateral = (pBase * generatriz) / 2;

              System.out.println("");
              System.out.println(" se calculara el area total de un cono");
              System.out.println(" para ellos se necesita el area lateral y el radio ");

              System.out.println("");
              System.out.println("cual es el radio");
              radio=menu.nextDouble();

              aBase = Math.PI * Math.pow(radio, 2);
              areaTotal = areaLateral + aBase;

              System.out.println("");

              System.out.println("Se  calculara el volumen de un cono ");

              System.out.println("");
              System.out.println("cual es la altura");
              altura=menu.nextDouble();

              System.out.println("");
              System.out.println("Cual es la base de a ");
              aBase=menu.nextDouble();

              volumen = (aBase * altura) / 3;

              

                
                if(radio>0 && altura>0 && pBase>0){
                break;
              }else{
                System.out.println("No se puede ingresar valores negativos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
              intentos++;
            }

              if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
              }else{

              System.out.println("El area lateral del cono es "+areaLateral);  
              System.out.println("");
              System.out.println("El area total del cono es "+areaTotal);
              System.out.println("");
              System.out.println("el volumen es " + volumen);
            }

                break;

            case 3:

              System.out.println("Se realizaran los calculos de un dodecaedro");
              System.out.println("");

              while(intentos<intentoMaximo){  
              System.out.println("Se calculara el area de un dodecaedro");

              System.out.println("");
              System.out.println("Cual es el valor de la arista");
              aristas=menu.nextDouble();

              area = 3 * Math.pow(aristas, 3) * Math.sqrt(25 + 10 * Math.sqrt(5));

             System.out.println("");
             System.out.println("Se calculara el volumen de un dodecaedro");

             System.out.println("");
             System.out.println("Cual es el valor de la arista");
             aristas=menu.nextDouble();

            
             volumen = 0.25 * (15 + 7 * Math.sqrt(5)) * Math.pow(aristas, 3);

             if(aristas>=0){
                break;
              }else{
                System.out.println("No se puede ingresar valores negativos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
               intentos++;
            }

               if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
            }else{

             System.out.println("El area de un dodecaedro es " + area);
             System.out.println("");
             System.out.println("El volumen de un dodecaedro es " + volumen );
            }
              
              break;

            case 4:

            System.out.println("Se realizaran los calculos de una esfera");
            System.out.println("");
            

            while(intentos<intentoMaximo){  
            System.out.println("Se calculara el area de una esfera");

            System.out.println("");
            System.out.println("Cual es el radio ");
            radio=menu.nextDouble();
        
            area = 4 * Math.PI * Math.pow(radio, 2);
        
            System.out.println("");
        
            System.out.println("Se calculara el volumen de una esfera ");
        
            System.out.println("");
            System.out.println("Cual es el radio");
            radio=menu.nextDouble();
        
            volumen = (4 / 3) * Math.PI * Math.pow(radio, 3);
        
           

            if(radio>0 && area>0 ){
                break;
              }else{
                System.out.println("No se puede ingresar valores negativos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
              intentos++;
            }
        
              if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
            }else{

             System.out.println("El area de la esfera es  " + area);
             System.out.println("");
             System.out.println("El volumen de la esfera es " + volumen);
            }
              

                break;

            case 5:

            System.out.println("Se realizaran los calculos de una parte de la esfera");
            System.out.println("");

            while(intentos<intentoMaximo){  
            System.out.println("Se calculara el area de una zona esferica");
    
            System.out.println("cual es el radio");
            radioMayor=menu.nextDouble();
    
            System.out.println("cual es la altura");
            altura=menu.nextDouble();
    
            areaZonaEsferica = 2 * Math.PI * radioMayor * altura;
    
            System.out.println("");
    
            System.out.println("Se calcura el volumen de la zona esferica ");
    
            System.out.println("Cual es la altura");
            altura=menu.nextDouble();
    
            System.out.println("Cual es el radio");
            radioMayor=menu.nextDouble();
    
            volumenZonaEsferica = ( Math.PI * altura * (Math.pow(altura, 2) * (3 * Math.pow(radioMayor, 2)) * (3 * Math.pow(radioMayor,2)))) / 6 ;
    
            System.out.println("");
    
            System.out.println("Se calculara el volumen de el casquete esferico");
            System.out.println("Para ello se necesita el radio mayor y la altura ");
    
            System.out.println("Cual es el radio");
            radioMayor=menu.nextDouble();
    
            System.out.println("Cual es la altura");
            altura=menu.nextDouble();
    
            volumenCasqueteEsferico = (Math.PI * altura * ((3 * radioMayor) - altura)) / 3;


            if(radio>=0 && altura>=0 ){
                break;
              }else{
                System.out.println("No se puede ingresar valores negativos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
               intentos++;
            }

               if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
            }else{

             System.out.println("el area de la zona esferica es " + areaZonaEsferica);
             System.out.println("");
             System.out.println("El volumen de la zona esferica es " + volumenZonaEsferica);
             System.out.println("");
             System.out.println("El volumen del casuqete esferico es " + volumenCasqueteEsferico);
            }
    

              break;

              case 6:

              System.out.println("Se realizaran los calculos de ua parte de la esfera");
              System.out.println("");

              while(intentos<intentoMaximo){
              System.out.println("Se calculara el huso esferico ");

              System.out.println("");
              System.out.println("Cual es radio");
              radio=menu.nextDouble();

              System.out.println("");
              System.out.println("Cual es el numero de grado ");
              numeroDeGrados=menu.nextDouble();

              areaHusoEsferico = (4 * Math.PI * Math.pow(radio, 2) * numeroDeGrados) / 360;

              System.out.println("");

              System.out.println("Se calculara la cuna esferica ");

              System.out.println("");
              System.out.println("Cual es el radio");
              radio=menu.nextDouble();

              System.out.println("");
              System.out.println("Cual es el numero de grado ");
              numeroDeGrados=menu.nextDouble();

              volumenCunaEsferica = (4/3) * ((Math.PI * Math.pow(radio, 3) * numeroDeGrados )/ 360);

              if(radio>0 && numeroDeGrados>0 && numeroDeGrados<360){
                break;
              }else{
                System.out.println("No se puede ingresar valores incorrectos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
              intentos++;
            }

               if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
            }else{

             System.out.println("El huso esferico es " + areaHusoEsferico);
             System.out.println("");
             System.out.println("El volumen de la cuna esferica es " + volumenCunaEsferica);
            }


                break;

            case 7:

              System.out.println("Se realizaran los calculos de un hexaedro");
              System.out.println("");

               while(intentos<intentoMaximo){
              System.out.println("Se calculara el area de un hexaedro");

              System.out.println("");
              System.out.println("Cual es el valor de la arista");
              aristas=menu.nextDouble();
    
              area = 6 * Math.pow(aristas, 2);
    
              System.out.println("");
    
              System.out.println("Se calculara el volumen de un hexaedro ");
    
              System.out.println("");
              System.out.println("Cual es el valor de la arista");
              aristas=menu.nextDouble();
    
              volumen = Math.pow(aristas, 3);
    
              System.out.println("");
    
              System.out.println("Se calculara la diagonal de un hexaedro");
    
              System.out.println("");
              System.out.println("Cual es el valor de la arista");
              aristas=menu.nextDouble();
    
              diagonal = aristas * Math.sqrt(3);

              if(aristas>0 ){
                break;
              }else{
                System.out.println("No se puede ingresar valores negativos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
              intentos++;
            }

              if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
            }else{

             System.out.println("el area del hexaedro es " + area);
             System.out.println("");
             System.out.println("El volumen del hexaedro es " + volumen);
             System.out.println("");
             System.out.println("La diagonal del hexaedro es " + diagonal);

            }

              break;

              case 8:

              System.out.println("Se realizaran los calculos de un icosaedro");
              System.out.println("");

              while(intentos<intentoMaximo){
              System.out.println("Se calculara el area de icoseadro");

              System.out.println("");
              System.out.println("Cual es el valor de la arista");
              aristas=menu.nextDouble();
      
              area = 5 * Math.pow(aristas, 2) * Math.sqrt(3);
      
              System.out.println("");
      
              System.out.println("Se calculara el volumen de un icoseadro");
              
               System.out.println("");
              System.out.println("Cual es el valor de la arista");
              aristas=menu.nextDouble();
      
              volumen = 0.4166 * (3 + Math.sqrt(5)) * Math.pow(aristas, 3 );

              if(aristas>0 ){
                break;
              }else{
                System.out.println("No se puede ingresar valores negativos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
              intentos++;
            }

              if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
            }else{

             System.out.println("el area del hexaedro es " + area);
             System.out.println("");
             System.out.println("El volumen del hexaedro es " + volumen);

            }
      

                break;

            case 9:

              System.out.println("Se realizara los calculos de un octoaedro");
              System.out.println("");

              while(intentos<intentoMaximo){
              System.out.println("Se calculara el area de un octaedro");

              System.out.println("");
              System.out.println("Cual es el valor de las aristas");
              aristas=menu.nextDouble();
    
              area = 2 * Math.pow(aristas, 2) * Math.sqrt(3);
      
              System.out.println("");
    
              System.out.println("Se calculara el volumen de un octaedro");
    
              System.out.println("");
              System.out.println("Cual es el valor de las aristas");
              aristas=menu.nextDouble();
    
              volumen = (Math.sqrt(2) / 3) * Math.pow(aristas, 3);
    
                if(aristas>0 ){
                break;
              }else{
                System.out.println("No se puede ingresar valores negativos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
             intentos++;
            }

               if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
            }else{

             System.out.println("el area del icosaedro es " + area);
             System.out.println("");
             System.out.println("El volumen del icosaedro es " + volumen);
            }
              break;

              case 10:

              System.out.println("Se realizaran los calculos de un ortoaedro");
              System.out.println("");

              while(intentos<intentoMaximo){
              System.out.println("Se calculara el area de un ortoedro");

              System.out.println("");
              System.out.println("Cual es el valor de la arista");
              aristas=menu.nextDouble();

              System.out.println("");
              System.out.println("Cual es el valor de la base");
              base=menu.nextDouble();

              System.out.println("");
              System.out.println("Cual es el valor de la cara");
              cara=menu.nextDouble();

              area = 2 * ((aristas * base) * (aristas * cara) * (base * cara));

              System.out.println("");

              System.out.println("Se calculara el volumen de un ortoedro");

              System.out.println("");
              System.out.println("Cual es el valor de la arista");
              aristas=menu.nextDouble();

              System.out.println("");
              System.out.println("Cual es el valor de la base");
              base=menu.nextDouble();

              System.out.println("");
              System.out.println("Cual es el valor de la cara");
              cara=menu.nextDouble();

              volumen = aristas * base * cara;

              System.out.println("");

              System.out.println("Se calculara la diagonal de un ortoedro");

              System.out.println("");
              System.out.println("Cual es el valor de la arista");
              aristas=menu.nextDouble();

              System.out.println("");
              System.out.println("Cual es el valor de la base");
              base=menu.nextDouble();

              System.out.println("");
              System.out.println("Cual es el valor de la cara");
              cara=menu.nextDouble();

              diagonal = Math.sqrt(Math.pow(aristas + base + cara, 2));

              if(aristas>=0 && cara>=0 && base>=0 ){
                break;
              }else{
                System.out.println("No se puede ingresar valores negativos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
              intentos++;
            }

              if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
            }else{

             System.out.println("el area del ortoaedro es " + area);
             System.out.println("");
             System.out.println("El volumen del ortoaedro es " + volumen);
             System.out.println("");
             System.out.println("La diagonal de un ortoaedro es " + diagonal);


            }

                break;

            case 11:

              System.out.println("Se realizara los calculos de una piramide"); 
              System.out.println(""); 

              while(intentos<intentoMaximo){
              System.out.println("Se calculara el area lateral de una piramide");

              System.out.println(""); 
              System.out.println("Cual es la altura de la piramide");
              altura=menu.nextDouble();
    
              System.out.println(""); 
              System.out.println("Cual es el apotema base b ");
              apotemaBaseb=menu.nextDouble();
    
              System.out.println(""); 
              System.out.println("Cual es la base de p");
              pBase=menu.nextDouble();
    
              apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(apotemaBaseb, 2));
              apotemaPiramide = altura * apotema;
              areaLateral = (pBase * apotemaPiramide) / 2;
    
              System.out.println("");
    
              System.out.println("Se calculara el area total de una piramide");
    
              System.out.println(""); 
              System.out.println("Cual es la base de a");
              aBase=menu.nextDouble();
    
              areaTotal = areaLateral + aBase;
    
              System.out.println("");
    
              System.out.println(""); 
              System.out.println("Se calculara el volumen de la piramide");
    
              System.out.println(""); 
              do{
              System.out.println("Cual es la base de a ");
              aBase=menu.nextDouble();
              }while(aBase<=0);
    
              System.out.println(""); 
              System.out.println("Cual es la altura");
              altura=menu.nextDouble();
    
              volumen = (aBase * altura) / 3;

             if(altura>=0 && apotemaBaseb>=0 && pBase>=0 ){
                break;
              }else{
                System.out.println("No se puede ingresar valores negativos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
              intentos++;
            }

              if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
            }else{

             System.out.println("El area de la piramide es " + areaLateral);
             System.out.println("");
             System.out.println("El area total de la piramide es " + areaTotal);
             System.out.println("");
             System.out.println("El volumen de la piramide es es " + volumen);


            }
    

              break;

            case 12:

              System.out.println("Se realizaran los calculos de un prisma");
              System.out.println("");

              while(intentos<intentoMaximo){
              System.out.println("Se calculara el area lateral de un prisma");


              System.out.println("");
              
              System.out.println("Cuantos lados contiene el prisma");
              nLados=menu.nextByte();


              System.out.println("");
              System.out.println("Cual es el largo del prisma");
              largo=menu.nextDouble();

              System.out.println("");
              System.out.println("Cual es la altura del prisma");
              altura=menu.nextDouble();

              pBase = nLados * largo ;
              areaLateral = pBase * altura;

              System.out.println("");

              System.out.println("Se calculara el area total de un prisma");

              System.out.println("");
              System.out.println("Cual es el perimetro del prisma");
              perimetro=menu.nextDouble();

              alfa = 360/nLados;

              apotema = largo / 2*Math.tan(alfa/2);
              aBase= perimetro * apotema / 2;
              areaTotal= areaLateral * aBase;

              System.out.println("");

              System.out.println("Se calculara el volumen de un prisma ");

              System.out.println("");
              System.out.println("Cual es la altura del prisma");
              altura=menu.nextDouble();

              volumen= aBase * altura;

              if(altura>=0 && largo>=0 && perimetro>=0 && nLados>=3 ){
            
                break;
              }else{
                System.out.println("No se puede ingresar valores negativos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
              intentos++;
            }

              if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
            }else{

             System.out.println("el area lateral del prisma es " + areaLateral);
             System.out.println("");
             System.out.println("El area toal del prisma es " + areaTotal);
             System.out.println("");
             System.out.println("El Volumen del prisma es " + volumen);


            }

              break;

            case 13:

              System.out.println("Se realizaran los calculos de un tetraedro");
              System.out.println("");

              while(intentos<intentoMaximo){
              System.out.println("Se calculara el area del tetraedro");

              System.out.println("Se realizaran los calculos de un tetraedro");
              System.out.println("Cual es arista");
              aristas=menu.nextDouble();

              area = Math.pow(aristas, 2) * Math.sqrt(3);

              System.out.println("");

              System.out.println("Se calculara el volumen del tetraedo");

              System.out.println("Se realizaran los calculos de un tetraedro");
              System.out.println("Cual es la arista");
              aristas=menu.nextDouble();

              volumen = (Math.sqrt(2) / 12) * Math.pow(aristas, 3);

              System.out.println("");

              System.out.println("Se calculara la altura del tetraedo");

              System.out.println("Se realizaran los calculos de un tetraedro");
              System.out.println("Cual es la arista");
              aristas=menu.nextDouble();

              altura = aristas * (Math.sqrt(6) / 3);

              
              if(aristas>=0 ){
            
                break;
              }else{
                System.out.println("No se puede ingresar valores negativos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
              intentos++;
            }

              if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
            }else{

             System.out.println("El area del tetraedo es " + area);
             System.out.println("");
             System.out.println("El volumen del tetraedo es " + volumen);
             System.out.println("");
             System.out.println("La altura del tetraedo es " + altura);

            }
            break;

            case 14:

              System.out.println("Se realizaran los calculos de un tronco Cono");
              System.out.println("");

              while(intentos<intentoMaximo){
              System.out.println("Se calculara el area lateral del tronco de un cono");

              System.out.println("");
              System.out.println("Cual es la altura");
              altura=menu.nextDouble();
    
              System.out.println("");
              System.out.println("Cual es el radio menor");
              radioMenor=menu.nextDouble();
    
              System.out.println("");
              System.out.println("Cual es el radio  mayor");
              radioMayor=menu.nextDouble();
    
              generatriz = radioMenor * altura;
              areaLateral = Math.PI * generatriz * ( radioMayor + radioMenor);
    
              System.out.println("");

              System.out.println("se calculara el area total del tronco de un cono ");
    
              System.out.println("");
              System.out.println("cual es la base menor de b");
              bBaseMenor=menu.nextDouble();
    
              System.out.println("");
              System.out.println("cual es la base mayor de b");
              bBaseMayor=menu.nextDouble();
    
              areaTotal = areaLateral + bBaseMayor + bBaseMenor;
    
              System.out.println("");
    
              System.out.println("Se calcular el volumen de el tronco de un cono ");
    
              System.out.println("");
              System.out.println("Cual es la altura");
              altura=menu.nextDouble();
    
              System.out.println("");
              System.out.println("Cual es el radio menor");
              radioMenor=menu.nextDouble();
    
              System.out.println("");
              System.out.println("Cual es el radio  mayor");
              radioMayor=menu.nextDouble();
    
              volumen = (0.33 * (Math.PI * altura) * (Math.pow(radioMayor, 2) + Math.pow(radioMenor, 2) +radioMayor * radioMenor));
            
            
              if(altura>=0 && bBaseMenor>=0  &&  radioMayor>0 && radioMenor>0 && bBaseMayor>0 ){
            
                break;
              }else{
                System.out.println("No se puede ingresar valores negativos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
              intentos++;
            }

              if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
            }else{

             System.out.println("El area lateral es " + areaLateral);
             System.out.println("");
             System.out.println("El area total es " + areaTotal);
             System.out.println("");
             System.out.println("El volumen del tronco del cono es " + volumen);
            }
              
             break;

            case 15:

            System.out.println("Se realizaran los calculos de un tronco piramide");
            System.out.println("");

            while(intentos<intentoMaximo){
            System.out.println("Se calculara el area lateral del tronco de una piramide ");

            System.out.println("");
            System.out.println("Cual es la base mayor de p");
            pBaseMayor=menu.nextDouble();
    
            System.out.println("");
            System.out.println("Cual es la base menor de p");
            pBaseMenor=menu.nextDouble();
    
            System.out.println("");
            System.out.println("Cual es el apotema base menor");
            apotemaBaseMenor=menu.nextDouble();
    
            System.out.println("");
            System.out.println("Cual es el apotema base mayor");
            apotemaBaseMayor=menu.nextDouble();
    
            System.out.println("");
            System.out.println("Cual es la altura");
            altura=menu.nextDouble();
    
            apotemaTroncoPiramide = Math.sqrt(Math.pow(altura, 2) - Math.pow(apotemaBaseMayor - apotemaBaseMenor, 2) );
            areaLateral = ((pBaseMayor + pBaseMenor) / 2) * apotemaTroncoPiramide;
   
            System.out.println("");
    
            System.out.println("Se calculara el area total del tronco de la piramide");

            System.out.println("");
            System.out.println("Cual es la base mayor de a");
            aBaseMayor=menu.nextDouble();
    
            System.out.println("");
            System.out.println("Cual es la base menor de a");
            aBaseMenor=menu.nextDouble();
    
            areaTotal = areaLateral + aBaseMayor + aBaseMenor;
    
            System.out.println("");
    
            System.out.println("Se calculara el volumen de la tronco de la piramide");
    
            System.out.println("");
            System.out.println("Cual es la base mayor de a");
            aBaseMayor=menu.nextDouble();
    
            System.out.println("");
            System.out.println("Cual es la base menor de a");
            aBaseMenor=menu.nextDouble();
    
            System.out.println("");
            System.out.println("Cual es la altura");
            altura=menu.nextDouble();
    
            volumen = 0.33 * altura * (aBaseMayor + aBaseMenor + Math.sqrt(aBaseMayor * aBaseMenor));
    
            System.out.println("El volumen del tronco de la piramide es " + volumen);
            if(altura>=0 && aBaseMayor>=0  &&  aBaseMenor>=0 && pBaseMayor>=0 && pBaseMenor>=0 && apotemaBaseMayor>=0 && apotemaBaseMenor>=0 ){
            
                break;
              }else{
                System.out.println("No se puede ingresar valores negativos");
                System.out.println("");
                if(intentos <3){

                    System.out.println("Intentelo nuevamente");
                }
              }
              intentos++;
            }

              if(intentos == intentoMaximo){
                
              System.out.println("Ah utilizado todos sus intentos");
            }else{

             System.out.println("El area lateral del tronco de la piramide " + areaLateral);
             System.out.println("");
             System.out.println("El area total del tronco de la piramide " + areaTotal);
             System.out.println("");
             System.out.println("El volumen del tronco de la piramide " + volumen);
            }
              break;

            case 16 :

              System.out.println("Saliendo del programa");

              break;

              
              default:
              System.out.println("Digite bien el numero");
              System.out.println("Saliendo del programa");

                break;

                }menu.close();

            }

        }
                
            
                
            
        

