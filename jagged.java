import java.utill.scanner;
    public class jagged {
    public static void main (String[] args){
       int n,i,sub,j;
          System.out.println("Enter the size of arr: ");
           Scanner sc = new Scanner(System.in);
           n=sc.nextInt();
           int [] [] arr = new int[n][];
             for(i=0;i<n;i++){
              System.out.println("Enter the size of sub-array"+ i+1);
              sub=sc.nextInt()
               arr[i] = new int[sub];
               }
                for(i=0;i<n;i++){
                   System.out.println("Enter  the element of array"+ i+1);
                    for(j=0;j<arr[i].length; j++)
              arr[i] [j] =sc.next int ()
             }
              System.out.println("Given Array are: ");
                for(i=0;i<n;i++){
                    for(j=0;j<arr[i].length;j++){
                        System.out.print(arr[i][j]+ " ");
                        }
                           System.out.println();
                      }
                          }
                              }


