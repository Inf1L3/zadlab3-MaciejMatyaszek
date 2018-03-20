/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author Maciej
 */
import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.Scanner;
import javax.xml.transform.Source;
public class zadanie {
    
public static int potegar(int liczba1, int potega) {
if (potega==0){
return 1;
}
else if (potega==1){
return liczba1;
}

else if(potega%2>0){
 return liczba1*potegar(liczba1, potega-1);

}
else {
  return (potegar(liczba1, potega / 2)) * (potegar(liczba1, potega / 2));
}}
public static int fib(int x) {
if (x==1 || x==2){
    return 1;
}    
else {
    return fib(x-1)+fib(x-2);
}
}
/**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
  //zad3.3 
   Scanner sc = new Scanner(System.in); 
  int liczba1, potega;
        System.out.println("Potęga rekruencyjnie ");
      System.out.println("Podaj liczbe która chcesz podnieśc do potęgi ");
 liczba1=sc.nextInt();
      System.out.println("Podaj wykładnik potęgi ");
 potega=sc.nextInt();
        System.out.println("Wynik = "+potegar(liczba1, potega));
      
        System.out.println("potega iteracyjnie");
        int a=1;
        while (potega>0) {
           
           a=a*liczba1;
           potega--;
        }
        System.out.println("Wynik= "+a);
  

//zad 3.4 
System.out.println("Podaj wyraz ciągu Fibonacciego ");
int x;
x=sc.nextInt();
        System.out.println("Wynik =" +fib(x));

        
        //1.4
         System.out.println("11<<3 =");
        System.out.println(11 << 3);
        System.out.println("45>>9 =");
        System.out.println(77 >> 2);
        System.out.println("-17>>>3 =");
        System.out.println(-17 >>> 3);
        System.out.println();
        System.out.println();
        System.out.println();
 
   
// 1.7 
     boolean a1, a2, a3;                                        //zad1.7
        a1 = true;
        a2 = false;
        a3 = a1 ^ a2;
        System.out.println("XOR: " + a3);
        System.out.println("NOT: " + !a1);
        System.out.println();
        System.out.println();
        
        
 //2. 2 
 String str = "Java";
byte[] actualValue = str.getBytes();
        System.out.println(""+Arrays.toString(actualValue));
        System.out.println("zamienia string na char");

 String q="Test";
 String b="Test";
 if (q.equals(b))
 {System.out.println("Są takie same");
    }
 String c="test";
  if (q.equals(c)) //porównuje dwa stringi
 {System.out.println("Są takie same");
    }
  else {System.out.println("są różne ");
      System.out.println("Porównuje dwa stringi");
    if (q.equalsIgnoreCase(c)) // porównuje dwa stringi nie zwracając uwagi na wilkość liter
 {System.out.println("Są takie same");
    }
  else {System.out.println("są różne ");
}
      System.out.println("Porównuje stringi nie zwracając uwagi na wielkość liter");
    String jeden="aaa";
    String dwa = "bbb";
int g=jeden.compareTo(dwa);// porównuje według kolejności leksykograficznej
if (g<0){
    System.out.println("Pierwsz element większ w kolejności leksykograficznej" +g);
}
      System.out.println("porównuje według kolejności leksykograficznej");
int g1=jeden.compareToIgnoreCase(dwa); // porównuje według kolejności leksykograficznej bez uwzglądniania wielkości liter
System.out.println("porównuje według kolejności leksykograficznej bez uwzglądniania wielkości liter");
String r="Teste";
int w=r.indexOf("e");// zwraca indeks pierwszego znalezionego wystąpienia
      System.out.println(""+w);
      System.out.println("zwraca indeks pierwszego znalezionego wystąpienia");

 int w1=r.lastIndexOf("e");// zwraca indeks pierwszego znalezionego wystąpienia szuka od końca
      System.out.println(""+w1);
      System.out.println(" zwraca indeks pierwszego znalezionego wystąpienia szuka od końca");
String subs=r.substring(1);//Metoda substring zwraca wybrany fragment ciągu znaków od podanego indeksu
      System.out.println(""+subs);
      System.out.println("Metoda substring zwraca wybrany fragment ciągu znaków od podanego indeksu");
String subs1=r.substring(1,3);//Metoda substring zwraca wybrany fragment ciągu znaków o podanym zakresie indeksów.
      System.out.println(""+subs1);
      System.out.println("Metoda substring zwraca wybrany fragment ciągu znaków o podanym zakresie indeksów.");
String replace=r.replace("e", "E");// zmienia ciąg znaków na inny
      System.out.println(""+replace);
      System.out.println("zmienia ciąg znaków na inny");
String bialy="Tak       ";
String bialy1=bialy.trim();// pozbywa się białych znaków
System.out.println(""+bialy1);
      System.out.println("pozbywa się białych znaków");
String r3=r.toLowerCase(); //zmienia na male litery
      System.out.println(""+r3);
      System.out.println("zmienia na male litery");
String r4=r.toUpperCase(); // zmienia na duze litery
      System.out.println(""+r4);
      System.out.println("zmienia na duze litery");
 String pow="Werstdekopease";
 String[] pow1=pow. split("e");// dzieli tekst na fragmenty według wybranego znaku/fragmentu
      System.out.println(""+pow1[1]);
      System.out.println("dzieli tekst na fragmenty według wybranego znaku/fragmentu");
 String [] pow2=pow.split("", 4);//dzieli fragment na wybrna ilosc elementow 
 for (int j=0; j<4; j++){
     System.out.println(""+pow2[j]);
    }
      System.out.println("dzieli fragment na wybrna ilosc elementow");
}}}

