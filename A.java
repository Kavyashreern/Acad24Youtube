class A{
    private int x;
    private int y;
    private int z;
    public A(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int sum(){
        return x + y;
    }
    public int sum(int z){
        return x + y + z;
    }
}