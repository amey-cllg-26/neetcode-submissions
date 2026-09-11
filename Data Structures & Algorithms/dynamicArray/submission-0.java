class DynamicArray{
 private int[] arr;
 private int size;
 private int capacity; 
 DynamicArray(int cont_capacity){
  this.arr=new int[cont_capacity];
  this.capacity=cont_capacity;
  this.size=0;
 }
 int get(int i){
  return arr[i];
 }
 void set(int i, int n){
  arr[i]=n;
 }
 int getSize(){
  return size;
 }
 int getCapacity(){
  return capacity;
}
void resize(){
int newCapacity=capacity*2;
int[] newarr= new int[newCapacity];
for(int i=0;i<size;i++){newarr[i]=arr[i];}
this.arr=newarr;
this.capacity=newCapacity;
}
void pushback(int n){
if(size==capacity){
  resize();}
arr[size]=n;
size++;
}
int popback(){
size=size-1;
return arr[size];
}
}