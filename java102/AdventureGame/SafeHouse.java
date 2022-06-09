package AdventureGame;

//import java.util.Arrays;

public class SafeHouse extends NormalLocation{
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev",1,"Savaştan yorulduysan Aradığın Yer Burası");
    }
    @Override
    public Boolean onLocation() {
        System.out.println("\nGüvenli Evdesin ! Canın Yenilendi");
        this.getPlayer().setHealth(this.getPlayer().getDefHealth());
        if (Game.territoriesWon.contains("Mağara")&&Game.territoriesWon.contains("Maden")&&Game.territoriesWon.contains("Nehir")&&Game.territoriesWon.contains("Orman"))
        {
            System.out.println();
            System.out.println(this.getPlayer().getName()+" Tebrikler ! Oyunu Başarıyla Tamamladın");
            System.out.println();
            System.out.println("Orta Dünya'da   Tüm Bölgelerdeki Düşmanları Temizledin ! ");
            System.out.println();
            System.out.println("Kanlar içinde kalan düşmanların arasından yorgun bir şekilde geçiyorsun ! Yeni Bir Macerada Görüşmek Üzere");
            System.exit(0);
        }
        return true;
    }
}