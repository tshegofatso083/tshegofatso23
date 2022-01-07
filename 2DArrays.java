  
class 2DArrays{  
public static void main(String args[]){

int arr[]=new int[50];//declaration and instantiation

for(int i=0 ;i<arr.length;i++){

arr[i] =(int)
(Math.random()*60);

}  
for(int j=0 ;j<arr.length;j++){

arr[j] =(int)
(Math.random()*60);

}  
//printing array using for-each loop  
for(int i:arr)  
{
for(int j:arr)
{
i++;
j++;
System.out.println(i);
System.out.println(j);  
}
}
}}  