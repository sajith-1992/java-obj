public class TextScanner {

    hello obj;
    public TextScanner(hello obj) {
            this.obj=obj;
    } 

    void scan(){
      String  text="scanned";
    obj.onText(text);
    }
    
}
