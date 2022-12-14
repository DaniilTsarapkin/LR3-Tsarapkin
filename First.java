import java.util.Scanner;

public class First {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
    
            int array_size = 0; 
            
    
            System.out.print("Введите размерность массива: ");
            if(in.hasNextInt()){
                array_size = in.nextInt();
            }else{
                System.out.println("Размерность массива должна быть задана целым числом, попробуйте еще раз:");
                System.exit(0);
            }
            if (array_size <=0){
                System.out.println("Размерность массива должна быть больше нуля, попробуйте еще раз");
                System.exit(0);
            }
            
               float [] array = new float[array_size];
            
            for(int i=0; i < array_size; i++){
                if(in.hasNextInt() || in.hasNextFloat()){
                     array[i] = in.nextFloat();
                }}
                System.out.print("Массив после обработки: ");
                    for (int i=0; i<array.length; i++){
                        float sum=0;

                    for(int j= 0; j< i+1; j++){
                        sum+= array[j];
            }
                    float sredarthm = sum/(i+1);
                    System.out.print(sredarthm+ " ");
        }
        in.close();
}
}