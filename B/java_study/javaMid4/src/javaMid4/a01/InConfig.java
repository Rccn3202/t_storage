package javaMid4.a01;

public interface InConfig {
    void i1();
    //��� 
    static final double PI=3.14;
    static final boolean OK = true;
    static final int COMPUT_PRICE = 2000000;
    static final int PRINT_PRICE = 500000;
    //����Ʈ �޼ҵ� - �ڹ� 1.8���� �߰��� 
    default void di1() { }
    default int dd1() { return 0;}
    //���� �޼ҵ� 
    static void sd() {  }
    private void a() { }
}
