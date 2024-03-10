//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            CLL l =new CLL();
            l.insert(2);
            l.insert(12);
            l.insert(23);
            l.insert(0);
            l.insert(9);
            l.insert(45);
            l.display();
            l.delete(2);
            l.display();
            l.delete(45);
            l.display();
    }
}