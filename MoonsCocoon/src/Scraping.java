import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.util.*;

class Scraping {
    public static void scrape() {
        String url = "https://wiki.gbl.gg/w/Gundam:_Battle_Assault_2"; // URL of the webpage you want to scrape
        String[] characters = {"Neue_Ziel","Big_Zam","Hydra","Epyon","Dark","Psyco","Quin_Mantha","Acguy","Hygogg","GP-02A","Gundam_ZZ","Ball","Zeong","Sazabi","RX-78","Zaku_II","%CE%BD_Gundam","Zaku_IIS","Heavy_Arms","Sandrock","Wing","Deathscythe_Hell","Altron","Tallgeese_III","Bolt","Dragon","Burning","Maxter","Rose","Master","Zeta","The-O","Qubeley","Hamma_Hamma"};
        int i=0;
        String[] names={};
        String[] desc={};
        Integer[] damage={};
        Integer[] defense={};
        Integer[] speed={};
        Integer[] dash={};
        String[] dpress={};
        for(i=0;i<characters.length;i=i+1){
        try {
            Document document = Jsoup.connect(url+"/"+characters[i]).get();

            Elements name = document.getElementsByTag("h1");
            names[i]=name.toString();
            System.out.println(name.toString().substring(118));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
}