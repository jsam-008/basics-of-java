class Floats{
    public  static void main(String [] args){
        double A = 31.12;
        double B = 31.12;

        A  = Math.round(A*1000.0)/1000.0;
        B  = Math.round(B*1000.0)/1000.0;

        if(A>B){
            System.out.println("A is greater");
        }
        else if(A<B){
            System.out.println("B is greater");
        }
        else {
            System.out.println("Both are equal");
        }

    }
}
