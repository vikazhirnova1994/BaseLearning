package study.labs.lab2.help;

/**
 * @author Victoria Zhirnova
 * @project commonLab
 */

public class Class7 {
    public Class7() {}

    public void printSnake() {
        int n = 6; //размерность массива
        int r = 0; // "строки"
        int c = 0; // "столбцы"
        int spec = 0; //переменная для уменьшения кол-во шагов следующего цикла
        int i = 0;  //значение конкретной ячейки
        int arr[][]=new int[n][n];


        //заполение массива
        for(int z=0;z<n*n-1;z++){ //двумерный массив

            for(int j=0;j<n-spec;j++){
                arr[r][c++]=++i;
            }

            c--;  //уменьшаем "с" на один
            ++spec; // уменьшаем кол-во шагов следующего цикла

            for(int k=0;k<n-spec;k++){
                arr[++r][c]=++i;
            }
            for(int l=0;l<n-spec;l++){
                arr[r][--c]=++i;
            }

            ++spec;// уменьшаем кол-во шагов следующего цикла

            for(int m=0;m<n-spec;m++){
                arr[--r][c]=++i;
            }
            c++; //увеличиваем для установки 1-го цикла на нужный столбец
        }

        // вывод массива
        for(int d=0;d<n;d++){
            for(int s=0;s<n;s++){
                System.out.print(arr[d][s]+"\t");
            }
            System.out.println();
        }
    }
}
