import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
		Scanner dati=new Scanner(System.in);
String vards,atb,dzivnieks,mdziv,kads,krāsa,supervar,dziesma,filma,favfilm;
int vecums,m,v;

do{
System.out.println("Kā tevi sauc?");
vards=dati.nextLine();// next nolasa lidz atstarpei, nextLine visu liniju

if(vards.endsWith("s")||vards.endsWith("o"))
{
    System.out.println("tu esi vīrietis");
}
else if(vards.endsWith("a")||vards.endsWith("e"))
{
    System.out.println("tu esi sieviete");
}
}while(!vards.endsWith("s")&&!vards.endsWith("o")&&!vards.endsWith("a")&&!vards.endsWith("e"));
System.out.println("Tevi sauc " +vards);

do {
System.out.println("Cik Jums gadu?");
vecums=dati.nextInt();
if (vecums<=0||vecums>=150) System.out.println("Tāds vecums nevar būt");
else System.out.println("Korekts vecums");
	}while(vecums<=0||vecums>=150);
System.out.print("Tev ir "+vecums+" gad");
if(vecums==1||vecums==21||vecums==31||vecums==41||vecums==51) System.out.println("s"); else System.out.println("i");

if (vards.endsWith("s")||vards.endsWith("o")){

    if(vecums<10) System.out.println("tu esi ļoti jauns");else
    if(vecums<20) System.out.println("tu es pusaudzis");else
    if(vecums<65) System.out.println("tu esi pieaugušais");else
    System.out.println("tu esi pensionārs");

}
else if(vards.endsWith("a")||vards.endsWith("e")){
   if(vecums<10) System.out.println("tu esi ļoti jauna");else
   if(vecums<20) System.out.println("tu es pusaudze");else
   if(vecums<65) System.out.println("tu esi pieaugusī");else
   System.out.println("tu esi pensionāre");
}

do {
 if (vards.endsWith("s")||vards.endsWith("o")){
     System.out.println("kurā menesī tu esi dzimis");
}
else if(vards.endsWith("a")||vards.endsWith("e")){
    System.out.println("kurā mēnesī tu esi dzimusi");
}
m=dati.nextInt();
dati.nextLine();

if(m<=0||m>=13) System.out.println("tāds mēnesis nevar būt");

}while(m<=0||m>=13);

if (vards.endsWith("s")||vards.endsWith("o")){
    System.out.print("tu esi dzimis ");
}
else if(vards.endsWith("a")||vards.endsWith("e")){
    System.out.print("tu esi dzimusi ");
}

switch (m){
    
    
    case 1:System.out.println("janvārī");break;
    case 2:System.out.println("februārī");break;
    case 3:System.out.println("martā");break;
    case 4:System.out.println("aprīlī");break;
    case 5:System.out.println("maijā");break;
    case 6: case 7: case 8 :System.out.println("vasarā");break;
    case 9: case 10: case 11: System.out.println("rudenī");break;
    case 12:System.out.println("decembī");break;
}

 do{
System.out.println("vai tev ir brālis?(jā/nē)");
atb=dati.nextLine();
}while(!atb.equals("jā")&&!atb.equals("Jā")&&!atb.equals("Nē")&&!atb.equals("nē"));
if(atb.equals("Jā")||atb.equals("jā")){
    
 System.out.println("Kā viņu sauc?");
 atb=dati.nextLine();
 System.out.println("skaists vārds!");}

else{ System.out.println("žēl!");
}
do{

System.out.println("baļlu sistēmā, cik labi jūs pārzināt angļu valodu?");
v=dati.nextInt();
dati.nextLine();
}while(v<0||v>=11);
switch(v){
    
    case 0:System.out.println("Ļoti žēl");break;
    case 1:System.out.println("tev ir minimālas zināšanas");break;
    case 2:System.out.println("tev vēl stingri jāpamācās");break;
    case 3:System.out.println("tev vēl ir daudz ko mācīties");break;
    case 4:System.out.println("tev ir gandīz viduvējas zināšanas");break;
    case 5:System.out.println("tev ir viduvējas zināšanas ");break;
    case 6:System.out.println("tev ir gandīz labas zināšanas");break;
    case 7:System.out.println("tev ir labas zināšanas");break;
    case 8:System.out.println("tev ir ļoti labas zināšanas");break;
    case 9:System.out.println("tev ir teicamas zināšanas");break;
    case 10:System.out.println("tev ir izcilas zināšanas, apsveicu!");break;
}
 
   do{ 
System.out.println("kas tev labā patīk, kaķi vai suņi?");
dzivnieks=dati.nextLine();

}while(!dzivnieks.equals("kaķi")&&!dzivnieks.equals("Kaķi")&&!dzivnieks.equals("suņi")&&!dzivnieks.equals("Suņi"));
if(dzivnieks.equals("kaķi")||dzivnieks.equals("Kaķi")){
       System.out.println("meow =^_^="); 
    }
    
    else if(dzivnieks.equals("suņi")||dzivnieks.equals("Suņi")){
     System.out.println("woof U・ᴥ・U");  

    }
 
do{
System.out.println("vai tev pieder kāds mājdzivnieks?");
mdziv=dati.nextLine();

}while (!mdziv.equals("Jā")&&!mdziv.equals("jā")&&!mdziv.equals("Nē")&&!mdziv.equals("nē"));
if (mdziv.equals("Jā")||mdziv.equals("jā")){
    System.out.println("kāds?");
    kads=dati.nextLine();
System.out.println("jauki");


}
else if(mdziv.equals("Nē")||mdziv.equals("nē")){
    System.out.println("saprotami,mājdzivnieki ir liela atbildība");
  
}

System.out.println("kāda ir tava mīļākā krāsa?");
krāsa=dati.nextLine();
System.out.println("tava mīļākā krāsa ir "+krāsa);

System.out.println("ja tu varētu būt supervaronis, kas tu būtu?");
supervar=dati.nextLine();
System.out.println("tavs supervaronis ir "+supervar);

System.out.println("kas ir tava mīļākā dziesma");
dziesma=dati.nextLine();
System.out.println("tava mīļākā dziema ir "+dziesma);

do{
System.out.println("vai tev  patīk skatīties filmas TV(jā/nē)");
filma=dati.nextLine();
}while(!filma.equals("jā")&&!filma.equals("Jā")&&!filma.equals("Nē")&&!filma.equals("nē"));
if(filma.equals("Jā")||filma.equals("jā")){
    System.out.println("lieliski, kura ir tava mīļākā filma?");
    favfilm=dati.nextLine();
    System.out.println("tava mīļākā filma ir "+favfilm);
}
else{
    System.out.println("tu filmas neskaties TV");
}
System.out.println("Bija jauki komunicēt!");

dati.close();
	}
}


