void main(){
    String name =IO.readln("enter your name \n");
    IO.println("hello" + name);
    IO.println("the size of name is"+name.length());
    Integer id = 2;
    for (int i=name.length()-1; i>-1; i--){
        IO.println(i+" "+name.charAt(i));
    }
       IO.println(id);
}