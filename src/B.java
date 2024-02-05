class B extends A  {
    void display(){
        System.out.println("this is class B");
    }
    void basedisplay(){

        super.display();
    }
    int a;
      void sum(){ 
        a=10;
    super.a=30;
    int c=a+super.a;
    System.out.println(c);

    }
    
}
