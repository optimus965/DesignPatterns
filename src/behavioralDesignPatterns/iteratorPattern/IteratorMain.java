package behavioralDesignPatterns.iteratorPattern;

public class IteratorMain {
    public static void main(String[] args) {
        IterableCollection iterableCollection = new ListIterableCollection();
        iterableCollection.addSong("Naatu Naatu – RRR");
        iterableCollection.addSong("Samajavaragamana – Ala Vaikunthapuramulo");
        iterableCollection.addSong("Butta Bomma – Ala Vaikunthapuramulo");
        iterableCollection.addSong("Ramuloo Ramulaa – Ala Vaikunthapuramulo");
        iterableCollection.addSong("Inkem Inkem Inkem Kaavaale – Geetha Govindam");
        iterableCollection.addSong("Whattey Beauty – Bheeshma");
        iterableCollection.addSong("Srivalli – Pushpa");
        iterableCollection.addSong("Oo Antava Oo Oo Antava – Pushpa");
        iterableCollection.addSong("Saami Saami – Pushpa");
        iterableCollection.addSong("Dhoom Dhaam Dhosthaan – Dasara");
        iterableCollection.addSong("Dandalayya – Baahubali 2");
        iterableCollection.addSong("Panchadara Bomma – Magadheera");
        iterableCollection.addSong("Nee Kanti Choopullo – Arundhati");
        iterableCollection.addSong("Butsabokka – Tillu Square");
        iterableCollection.addSong("Ticket Eh Konakunda – Tillu Square");
        iterableCollection.addSong("Kalavathi – Sarkaru Vaari Paata");
        iterableCollection.addSong("Mind Block – Sarileru Neekevvaru");
        iterableCollection.addSong("Duppatlo Minnagu – Salaar");
        iterableCollection.addSong("Shape of You – Ed Sheeran");
        iterableCollection.addSong("Blinding Lights – The Weeknd");
        iterableCollection.addSong("Believer – Imagine Dragons");
        iterableCollection.addSong("Someone Like You – Adele");
        iterableCollection.addSong("Perfect – Ed Sheeran");
        iterableCollection.addSong("Levitating – Dua Lipa");
        iterableCollection.addSong("Senorita – Shawn Mendes & Camila Cabello");
        iterableCollection.addSong("Havana – Camila Cabello");
        iterableCollection.addSong("Closer – The Chainsmokers");
        iterableCollection.addSong("Cheap Thrills – Sia");
        //        ListIterator playList = iterableCollection.createIterator(); // here it is showing error because it violates liskov substitution principle as it should be more specific instead it is more general that is why it violates lsp
        Iterator playList = iterableCollection.createIterator();
        while(playList.hasNext()) {
            System.out.println("Playing next song: "  + playList.next());
        }
        iterableCollection.setShuffle();
        System.out.println("now go random playing");
        Iterator playList1 = iterableCollection.createIterator();
        while(playList1.hasNext()) {
            System.out.println("Playing next song: "  + playList1.next());
        }

    }

}
