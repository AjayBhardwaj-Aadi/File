 class ConstructorJava {
    String Name; 
   String color;
 
    public ConstructorJava()
{
        System.out.println("Constructor is =");
    }

    public ConstructorJava(String sName,  String color)
{
        Name = sName;
        this.color = color;
    }

    public ConstructorJava(ConstructorJava variable)
{
        Name = variable.Name;
        color = variable.color;
    }
        public static void main(String args[]) {
         ConstructorJava Plum= new ConstructorJava("Plum","Red ");
        System.out.println("Plum "     + Plum.Name);

        System.out.println("Red "        + Plum.color);    

        ConstructorJava Mango= new ConstructorJava(Plum);
        System.out.println("Mango "   + Mango.Name);

        System.out.println("Yellow "   + Mango.color);

       ConstructorJava Peaches = new ConstructorJava ();
       System.out.println("Peaches  " + Peaches.Name);

      System.out.println("Yellow  "     + Peaches.color);
   }
    }