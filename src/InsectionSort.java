/**
 *
 * @author percy 插入排序
 */
public class InsectionSort {
    static int count=10;
    static long[] longs = new long[count];
    private void InsectionSort_(){
        int position=0;
        long temp;
        while(position<count-1){
            for (int i=position+1;i>0;i--){
               if (longs[i]<longs[i-1]){
                   Swap(longs,i,i-1);
               }else{
                   break;
               }

            }

            position++;
        }
    }
    private void Swap(long[] list,int i,int j){
        long c= list[i];
        list[i] = list[j];
        list[j] = c;
    }
    public static void main(String[] args){

        for (int i=0;i<count;i++){
            longs[i] = Math.round(Math.random()*10);
            System.out.print(longs[i]+" ");
        }
        System.out.println("\n");
        System.out.println("------------");
        new InsectionSort().InsectionSort_();
        for (int i=0;i<longs.length;i++){

            System.out.print(longs[i]+" ");
        }
    }

}
