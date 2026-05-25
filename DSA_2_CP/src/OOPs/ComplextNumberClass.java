package OOPs;

public class ComplextNumberClass {
    int real;
    int image;
    ComplextNumberClass(int r , int i){
        this.real = r;
        this.image = i;
    }
    void show(){
        System.out.println(this.real + "+ i" + this.image);
    }
    static ComplextNumberClass add(ComplextNumberClass n1, ComplextNumberClass n2){
        ComplextNumberClass res = new ComplextNumberClass(0, 0);
        res.real  = n1.real + n2.real;
        res.image = n1.image + n2.image;
        return res;
    }

    public static void main(String[] args) {
        ComplextNumberClass c1 = new ComplextNumberClass(4,5);
        ComplextNumberClass c2 = new ComplextNumberClass(10, 5);
        System.out.println("First complex number: ");
        c1.show();
        System.out.println("Second complex number: ");
        c2.show();
        ComplextNumberClass res = add(c1, c2);
        System.out.println("/Addition is: ");
        res.show();
    }
}
