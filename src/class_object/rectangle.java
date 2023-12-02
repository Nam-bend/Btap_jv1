package class_object;

public class rectangle {
    private int length ;
    private  int width ;
    public rectangle(){
        this.length=0 ;
        this.width = 0 ;}
    public int getLength() {
        return length;}
    public void setLength(int length) {
        this.length = length;}
    public int getWidth() {
        return width;}
    public void setWidth(int width) {
        this.width = width;}
    public rectangle(int length, int width){
        this.length=length ;
        this.width=width ;}
    public  void acreage(){
         int acreage =this.width*this.length;
        System.out.println("acreage ="+ acreage);
    }
    public void printInfRectangle(){
        System.out.println("length =" + this.length);
        System.out.println("wedth = "+ this.width);
    }
    };
