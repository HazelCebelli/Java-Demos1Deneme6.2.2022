import java.util.Locale;

public class Main {

    public static void main(String[] args) {
       String s="benim ismim hazel cebelli";
       s=s.toLowerCase();
       int ilkBosluk=s.indexOf(" ");
       String ilkKelime=s.substring(ilkBosluk);
       System.out.println("dizgi " +s+ " ilk bosluk: "+ ilkBosluk);
       System.out.println("ilk kelime degiskeni: "+ ilkKelime);
}}
